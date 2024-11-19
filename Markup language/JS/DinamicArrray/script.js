//Properties
let input, list, error;
let arrayNumbers = new Array();


function main(){

    //Look for the elements in the DOM
    input = document.getElementById('input');
    list = document.getElementById('list');
    error = document.getElementById('error');
    document.getElementById('button').addEventListener('click', addNumber)
}

function addNumber(){
    
    if(validateData() == true){
        //We show an error message
        error.innerHTML = `ERROR :The value ${input.value} isn't a number :(`;
    }else{
        //We delete the error message
        error.innerHTML = ``;

        // Add the number to the Array
        arrayNumbers.push(parseInt(input.value));

        //We walk inside an Array and save the number in a String
        let cadena = '';
        for(let i = 0; i < arrayNumbers.length; i++){
        //Add the number to a Srtring list
        cadena += `<li>Number : ${arrayNumbers[i]}</li>`
        }

        //Show the list of all numbers
        list.innerHTML = cadena;
    }
    

}

//Function to check if user data is a number or not
function validateData(){
    return isNaN(parseInt(input.value));
}









window.addEventListener('load',main);