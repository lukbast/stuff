const Product = require('./models/product');
const mongoose = require('mongoose');

mongoose.connect('mongodb://localhost:27017/farmStand', {useNewUrlParser: true, useUnifiedTopology: true})
.then(()=>{
    console.log("----Connected with MongoDB----")
})
.catch(err =>{
    console.log("How possibly you fucked that up")
    console.log(err)
});

const p =[{
    name: 'Fairy Eggplant',
    price: 1.00,
    category: 'vegetables'
},
{
    name: 'Organic Goddes Melon',
    price: 4.99,
    category: 'fruit'
},
{
    name: 'Organic Mini Seedles Watermelon',
    price: 3.99,
    category: 'fruit'
},
{
    name: 'Organic Celery',
    price: 1.50,
    category: 'vegetables'
},
{
    name: 'Chocolate Whole Milk',
    price: 2.69,
    category: 'dairy'
},
]

Product.insertMany(p)
.then(p =>{
    console.log(p);
})
.catch(err =>{
    console.log(err);
})

