let input, container,errorMessage;
let arrayNumbers = new Array();

function main(){
    input = document.getElementById('input');
    container = document.getElementById('container');
    errorMessage = document.getElementById('errorMessage');

    document.getElementById('button').addEventListener('click',addNumber);
}

function addNumber(){
    let list =""; 
    
    if(isNaN(parseInt(input.value)) || input.value == null){
        errorMessage.innerHTML = "Invalid data :(";
    }else{
        list +=`<li>${parseInt(input.value)}</li>`;
        errorMessage.innerHTML = "";
    }
        
    
    container.innerHTML += list;
}

window.addEventListener('click', main)