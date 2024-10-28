let myButton = document.getElementById("getwelcome");
let myParagrahp = document.getElementById("welcome");

myButton.addEventListener('click',pressButton);

function pressButton(){
    myParagrahp.textContent('Hi and welcome to this marvelous page');
}