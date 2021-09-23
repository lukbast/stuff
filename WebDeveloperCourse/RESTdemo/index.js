const { render } = require('ejs');
const express = require('express')
 const app = express();
 const path = require("path")
 const { v4: uuid } = require('uuid');
 const methodOverride = require("method-override")

app.use(express.urlencoded({extended: true}));
app.use(express.json());
app.use(methodOverride("_method"))
 app.set("view engine", 'ejs');
 app.set("views", path.join(__dirname, "/views"))


 const comments = [
     {
     username : "Todd",
     comment: "lol that is so funny",
     id: 0
    },
    {
        username : "Skyler",
        comment: "I like to go birdwatching with my dog",
        id: 1
       },
       {
        username : "Sk8ter Boi",
        comment: "Plz delete your account, Todd",
        id: 2
       },
       {
        username : "onlysaywoof",
        comment: "woof woof woof",
        id: 3
       }
    ]

    app.get("/comments", (req, res) => {
        res.render("comments/index", {comments})
    })

    app.get("/comments/new", (req, res) => {
        res.render("comments/new", {comments})
    })



    app.post("/comments", (req, res)=>{
        const {username, comment} = req.body;
        const id=comments.length;
        comments.push({username,comment, id});
        res.redirect("/comments");     
    })

    app.get("/comments/:id",(req,res) =>{
        const id = req.params.id;
        const comment = comments.find(c => c.id == id)
        if(comment){
            res.render("comments/show", {comment, id})
        } else {
            res.render("comments/err", {id})
        }

    })

    app.get("/comments/:id/edit", (req, res) => {
        const id = req.params.id;
        const comment = comments.find(c => c.id == id)
        if(comment){
            const {username , comment} = comments[id]
            res.render("comments/edit" ,{username, comment,id})
        } else {
            res.render("comments/err", {id})
        }
    })

    app.patch("/comments/:id", (req, res) =>{
        const id = req.params.id;
        let comment = req.body.comment;
        comments[id].comment=comment;
        res.redirect("/comments");
    })


    app.delete("/comments/:id", (req, res) =>{
        const id = req.params.id;
        comments.splice(id,1);
        res.redirect("/comments")
    })





 app.listen(3000, () =>{
     console.log("LISTENING ON PORT 3000")
 })