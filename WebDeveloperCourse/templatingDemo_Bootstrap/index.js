 const express = require('express')
 const app = express();
 const path = require("path")
 const redditData = require("./data.json");

 app.use(express.static(path.join(__dirname, "public")));

 app.set("view engine", "ejs");
 app.set("views", path.join(__dirname, "/views"))

app.get("/" ,(req, res)=>{
    res.render("home.ejs")
})

app.get("/r/:subreddit", (req, res) => {
    const {subreddit} = req.params;
    const data = redditData[subreddit];
    if(data){
    res.render("subreddit", {...data } )
        } else {
            res.render("notfound", {subreddit})
        }
})

app.get("/random", (req, res)=>{
    const rand = Math.floor(Math.random()*10 );
    res.render("random", {rand})
})

app.get("/Tanks", (req, res) => {
    const tanks = ["Kv-2", "IS-3", "T-54", "Pershing", "FV 4005", 
        "Pzkpf VI Tiger", "StuG. IV", "Pzkpf IV", "STRV 103 B", "Chi-Nu","O-I",
         "Merkava", "M1A2 Abrams", "T-90", "Renault F1"]
    res.render("Tanks", {tanks})
})


 app.listen("3000", ()=>{
     console.log("Listening on port 3000");
 })