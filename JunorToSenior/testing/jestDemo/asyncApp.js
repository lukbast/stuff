const fetch = require('node-fetch')

const getPeoplePromise = (fetchDep) =>{
    return fetchDep('https://swapi.dev/api/people/')
    .then(res => res.json())
    .then(data => {
        console.log(data)
        return {
            count: data.count,
            result: data.results
        }}
    )
}

const getPeople = async (fetchDep) =>{
    const res = await fetchDep('https://swapi.dev/api/people/')
    const data = await res.json()
    return {
        count: data.count,
        result: data.results
    }
}

module.exports = getPeople

