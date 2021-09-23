const mongoose = require("mongoose")

mongoose.connect('mongodb://localhost:27017/shopApp', {useNewUrlParser: true, useUnifiedTopology: true})
.then(()=>{
    console.log("----Connected with MongoDB----")
})
.catch(err =>{
    console.log("How possibly you fuck that up")
});

const productShema = new mongoose.Schema({
    name: {
        type: String,
        trim:true,
        maxLength: 20,
        required:true
    },
    price: {
        type: Number,
        required:true,
        min:0
    },
    onSale: {
        type: Boolean,
        default:false
    },
    categories:[String]
})

const Product = mongoose.model('Product', productShema);

const bike = new Product({price:420})
bike.save()
    .then(data =>{
        console.log("-----------Item added succesfuly------------")
        console.log(data)
    })
    .catch(err =>{
        console.log("-----------Something went wrong------------")
        console.log(err)
    })































































// const movieSchema = new mongoose.Schema({
//     title: String,
//     year: Number,
//     score: Number,
//     rating: String
// })

// const Movie =  mongoose.model('Movie', movieSchema);

// const amadeus = new Movie ({title:'Aamdeus', year:1986 , score:9.2, rating:"R"})

// Movie.insertMany([
//     {title:'Amelie', year:2001 , score:8.3, rating:"R"},
//     {title:'Alien', year:1979 , score:8.1, rating:"R"},
//     {title:'The Iron Giant', year:1999 , score:7.5, rating:"PG"},
//     {title:'Stand By Me', year:1986 , score:8.6, rating:"R"},
//     {title:'Moonrise Kingdom', year:2012 , score:7.3, rating:"PG-13"}
// ])
// .then(data=>{
//     console.log("-------List of data added to the database--------");
//     console.log(data);
// })
// .catch(err =>{
//     console.log("How possibly you fuck that up. Seriosly")
//     console.log(err)
// });

// Movie.updateOne({title:'Aamdeus' },{title: "Amadeus"})
// .then(res =>{
//     console.log(res)
// });

// Movie.updateOne({title: "Amadeus"}, {year: 1984})
// .then(res =>{
//     console.log(res)
// });

// Movie.updateMany({title: {$in: ['Amadeus', 'Stand By Me']}}, {score:10})
// .then(res =>{
//     console.log(res)
// });

// Movie.deleteOne({title: 'Amelie'}).then(msg =>{
//     console.log(msg)
//     console.log("-------------------------")
// });

// Movie.deleteMany({year: {$gte: 1999}}).then(msg =>{
//     console.log(msg)
//     console.log("-------------------------")
// });



