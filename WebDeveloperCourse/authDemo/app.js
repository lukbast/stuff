const express = require('express');
const mongoose = require('mongoose');
const User = require('./models/user');
const path = require('path')
const app = express();
const bcrypt = require('bcrypt')
const session = require('express-session')



mongoose.connect("mongodb://localhost:27017/auth-demo",{
    useNewUrlParser:true,
    useUnifiedTopology:true,
    useCreateIndex:true,
    useFindAndModify: false
})
const db = mongoose.connection;
db.on("error", console.error.bind(console, "connection error:"));
db.once("open", ()=>{
    console.log("----------------------database connected------------------------------------");
});


app.use(session({secret: 'notagoodsecret'}))


app.set('view engine', 'ejs');
app.set('views' , path.join(__dirname, 'views'));

app.use(express.urlencoded({extended: true}))

app.get('/register', (req, res ) => {
    res.render('register')
})

app.get('/login', (req, res ) => {
    res.render('login')
})

app.post('/login', async (req,res)=>{
    const user = await User.findOne({username: req.body.username});
    const result = await bcrypt.compare( req.body.password ,user.password )
    if(result){
        req.session.user_id = user._id
        res.redirect('/secret')
    } else {
        res.redirect('/login')
    }
})

app.post('/logout', (req, res)=>{
    req.session.user_id=null;
    console.log('logged out')
    res.redirect('/login')
})

app.get('/secret', (req, res) =>{
    if(req.session.user_id){
        res.render('logged')
    } else {
        res.redirect('/login')
    }
    })

app.post('/register', async (req, res) => {
    const {username, password} = req.body;
    const hash = await bcrypt.hash(password, 12);
    const user =  await new User({
        username,
        password: hash});
    await user.save();
    if(user){
    req.session.user_id = user._id;
    }
    res.send(user)
})


app.listen(3000, ()=>{
    console.log('-----------------Listening on port 3000-------------------------------')
})