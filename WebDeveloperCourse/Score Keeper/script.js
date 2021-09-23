const buttons = document.querySelectorAll("button");
const spans = document.querySelectorAll("span");
let playingTo = document.querySelector("#playingTo");
const endGameLabel = document.querySelector("#endGameLabel");
let plr1 = 0;
let plr2 = 0;
buttons[0].addEventListener("click", changeScore1);
buttons[1].addEventListener("click", changeScore2);
buttons[2].addEventListener("click", reset);

function updateScore(){
    spans[0].textContent=`${plr1}`;
    spans[1].textContent=`${plr2}`;
}

function changeScore1(){
    plr1++;
    updateScore();
    ifEndOfGame();
}
function changeScore2(){
    plr2++;
    updateScore();
    ifEndOfGame();
}

function reset(){
    plr1=0;
    plr2=0;
    updateScore();
    buttons[0].disabled=false;
    buttons[1].disabled=false;
    buttons[0].style.backgroundColor="rgb(24, 165, 146)";
    buttons[1].style.backgroundColor="rgb(78, 126, 216)";
    spans[0].style.color="black";
    spans[1].style.color="black";
    endGameLabel.style.display="none";
}

function ifEndOfGame(){
        if(plr1 === parseInt(playingTo.value) || plr2 === parseInt(playingTo.value)){
            buttons[0].disabled=true;
            buttons[1].disabled=true;
            buttons[0].style.backgroundColor="rgb(105, 238, 220)";
            buttons[1].style.backgroundColor="rgb(109, 170, 228)";
            setTimeout(() => {
                endGameLabel.style.display="block";
            }, 60);
            if(plr1>plr2){
                spans[0].style.color="#158c4b";
                spans[1].style.color="red";
                endGameLabel.textContent="Player One wins!"
            } else {
                spans[1].style.color="#158c4b";
                spans[0].style.color="red";
                endGameLabel.textContent="Player Two wins!"

            }
        }
}
