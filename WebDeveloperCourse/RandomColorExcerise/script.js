
function changeBackgroundColor (){
    let r = Math.floor( (255 - 1) * Math.random() );
    let g = Math.floor( (255 - 1) * Math.random() );
    let b = Math.floor( (255 - 1) * Math.random() );
    document.querySelector("body").style.backgroundColor = `rgb(${r}, ${g}, ${b})` ;
    document.querySelector("h1").textContent = `rgb(${r}, ${g}, ${b})`;
}
document.querySelector("#btn").addEventListener("click", changeBackgroundColor);
changeBackgroundColor();
