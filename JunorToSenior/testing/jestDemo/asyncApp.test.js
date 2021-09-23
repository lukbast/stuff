const fetch = require('node-fetch')
const getPeople = require('./asyncApp')


describe( 'Async test for getPeople', ()=>{
    expect.assertions(1)
    test('if calls swapi to get people', (done)=>{ 
        // done says to JEST to wait for done being called before pass tests 
        // another way  is to return promise
        // when testing async functions always use expect.assertions() 
        // to be sure that all of your tests are running as intended
        getPeople(fetch).then(data => {
            expect(data.count).toEqual(82)
            done();
        })
    }),
    test('mocked version', ()=>{
        expect.assertions(1)
        const mock = jest.fn()
        .mockReturnValue(Promise.resolve({
            json: () => Promise.resolve({
                count: 866,
                results: [0,1,2,3,4,5]
            })
        }))
        return getPeople(mock).then(data => {
            expect(data.count).toEqual(866)
        })

    })
})