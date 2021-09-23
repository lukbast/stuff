const franc = require("franc");
const langs = require("langs")

let text = process.argv[2];


let code = franc(text);


let langObject = langs.where("3", code);

console.log(langObject.name);
