const search = require('./app')
const dbMock = [
    'cats.com',
    'souprecipes.com',
    'animals.com',
    'catpictures.com',
    'flowers.com',
    'myfavouritecats.com'
];
describe('search', ()=>{
 test('when input is null and undefined', ()=>{
     expect(search(undefined, dbMock)).toEqual([])
     expect(search(null, dbMock)).toEqual([])
 }),
 test('return empty array when input is not in DB', () =>{
     expect(search('sdcdersg ersg',dbMock)).toEqual([])
 }),
 test('to recive all found items', () =>{
    expect(search('cat',dbMock).length).toEqual(3)
}),
test('if returns single item if there is only one match in DB', ()=>{
    expect(search('flowers',dbMock)).toEqual(['flowers.com'])
})
})


