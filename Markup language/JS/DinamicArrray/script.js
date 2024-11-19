//Properties
let input, list;
let arrayNumbers = new Array();


function main(){

    //Look for the elements in the DOM
    input = document.getElementById('input');
    list = document.getElementById('list');
    document.getElementById('button').addEventListener('click', addNumber)
}

function addNumber(){
    // Add the number to the Array
    arrayNumbers.push(parseInt(input.value));

    //We walk inside an Array
    let cadena = '';
    for(let i = 0; i < arrayNumbers.length; i++){
        //Add the number to a Srtring list
        cadena += `<li>Number : ${arrayNumbers[i]}</li>`
    }

    //Show the list of all numbers
    list.innerHTML = cadena;

}









window.addEventListener('load',main);