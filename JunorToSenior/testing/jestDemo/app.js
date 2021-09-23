const search = (input, db) => (
    db.filter(entry => entry.includes(input) )
)

module.exports = search