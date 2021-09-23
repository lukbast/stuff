const express = require("express");
const app = express();

app.get("/someshit/:poop", (req, res)=>{
    const { poop } = req.params;
    res.send(`<h1>Welcome ${poop} </h1>`)
})

app.get("/search", (req, res) => {
    res.send(`<h1>Did you search for ${req.query.q} ? I hope you got what you wanted</h1>`)
})

app.listen(3000,()=>{
    console.log("Im going and going, and nothing can stop me! (except Ctrl+C)")
})


app.get("*",(req, res) =>{
    res.send("How possibly could you fuck it up")
})