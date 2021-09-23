const express = require("express")
const app = express();
const path = require('path');
const mongoose = require("mongoose")
const methodOverride = require('method-override');

const Product = require('./models/product');
const Farm = require("./models/farm");


mongoose.connect('mongodb://localhost:27017/farmStand', {useNewUrlParser: true, useUnifiedTopology: true})
.then(()=>{
    console.log("----Connected with MongoDB----")
})
.catch(err =>{
    console.log("How possibly you fucked that up")
    console.log(err)
});

app.set("view engine", "ejs");
app.set("views", path.join(__dirname, "views"));
app.use(express.urlencoded({extended: true}))
app.use(methodOverride('_method'));

const categories = ['vegetables', 'fruit', 'dairy'];

app.listen(3000, ()=>{
    console.log("Listening on port 3000")
});

app.get('/test',(req, res) =>{
    res.send("working");
})

//FARM ROUTES

app.get('/farms', async (req, res) => {
    const farms = await Farm.find({});
    res.render("farms/all.ejs", {farms});
});

app.get('/farms/new', (req, res) => {
    res.render('farms/new')
    })

app.post('/farms', async (req, res)=>{
    const { farm } = await Farm.insertMany([req.body.farm])
    res.redirect(`/farms`);
    });

app.get('/farms/:id', async (req, res)=>{
    const {id} = req.params;
    const farm =  await Farm.findById(id).populate('products');
    res.render("farms/show.ejs", {farm})
    })

    app.delete('/farms/:id/delete', async (req, res)=>{
        const {id} = req.params;
        const farm = await Farm.findByIdAndRemove(id);
        res.redirect('/farms');
    });
 app.get('/farms/:id/edit', async (req, res) => {
    const {id} = req.params;
    const farm =  await Farm.findById(id);
    res.render(`farms/edit`, {farm})
 })

app.put('/farms/:id', async (req,res)=>{
    const {id} = req.params;
    const farm = await Farm.findByIdAndUpdate(id, req.body.farm, {runValidators:true});
    res.redirect('/farms');
})

app.get('/farms/:id/products/new', async (req, res) =>{
        const {id} = req.params;
        const farm = await Farm.findById(id);
        res.render('products/new', {categories,id, farm});
    })

app.post('/farms/:id/products', async (req,res)=>{
    const {id} = req.params
    const farm =  await Farm.findById(id);
    const {name, price, category} = req.body;
    const product = new Product({name, price, category});
    farm.products.push(product);
    product.farm = farm;
    await farm.save();
    await product.save();
    res.redirect(`/farms/${id}`)
    })

app.delete('/farms/:id', async (req, res)=>{
    const { id } = req.params;
    const farm = await Farm.findByIdAndDelete(id);
    res.redirect('/farms');
})








//PRODUCTS ROUTES
app.get('/products', async (req, res) => {
    const products = await Product.find({});
    res.render("products/all.ejs", {products, categories});
});

app.get('/products/new',  (req, res) => {
    res.render("products/new.ejs", {categories});
});



app.post("/products", (req, res)=>{
    const p ={
        name: req.body.name,
        price: req.body.price,
        category: req.body.category
    };
    Product.insertMany([p])
    .then( data=>{
        console.log(data)
        res.redirect('/products')
    })
    .catch(err =>{
        console.log(err);
    })

})

app.get('/products/:id', async (req, res) => {
        const {id} = req.params;
        const product =  await Product.findById(id);
        res.render("products/show.ejs", {product})
});

app.get('/products/:id/edit', async (req, res)=>{
    const {id} = req.params;
    const product =  await Product.findById(id);
    res.render('products/edit.ejs', {product, categories});
});

app.put('/products/:id', async (req, res)=>{
    const {id} = req.params;
    const product = await Product.findByIdAndUpdate(id, req.body, {runValidators:true});
    res.redirect('/products');


});

app.delete('/products/:id/delete', async (req, res)=>{
    const {id} = req.params;
    const product = await Product.findByIdAndRemove(id);
    res.redirect('/products');
});

app.post('/products/filter' ,  async (req, res) =>{
    const {selectedCategory} = req.body;
    const products = await Product.find({category: selectedCategory})
    res.render("products/filter.ejs", {selectedCategory, products, categories})
})





