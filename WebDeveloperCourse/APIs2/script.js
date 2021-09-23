const form = document.querySelector("form");
form.addEventListener("submit", async function (e){
    e.preventDefault();
    const searchTerm = form.elements.q.value;
    const res = await fetch(`http://api.tvmaze.com/search/shows?q=${searchTerm}`);
    let resj = await res.json();
    console.log(resj);


    for(let i =0; i<resj.length; i++){
        if(resj[i].show.image!=null){
    const div = document.createElement("div");
    const p = document.createElement("p");
    const p2 = document.createElement("p");
    const img = document.createElement("IMG");

    img.src=resj[i].show.image.medium;
    p.append(resj[i].show.name);
    p2.append(resj[i].show.summary);
    div.append(img);
    div.append(p);
    div.append(p2);
    document.querySelector("main").append(div);}
    else {console.log(`${resj[i].show.name} do not have and image`)}
    }
})