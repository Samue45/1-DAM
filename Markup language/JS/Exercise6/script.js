let inputNumber, list;

function main(){

    inputNumber = document.getElementById('inputNumber');
    list = document.getElementById('list');

    document.getElementById('button').addEventListener('click', primeNumbers);
}

function primeNumbers(){
    //1º Create an Array to can calculate the primes numbers and set a style and the begining of our list
    let allNumbers =[parseInt(inputNumber.value) ];
    //The list
    let finalSolution = '';

    //2º We run the Array to calculate what numbers are primes and also to set a style
    for (let index = 0; index < allNumbers.length; index++) {
        //Number
        let primeNumber;
        //Check if the number is prime
        if((allNumbers[index] % (1)) == 0 && (allNumbers[index] % (allNumbers.length)) == 0) {
            primeNumber = allNumbers[index];
        }

       /*  //Check if it is even to set a style
        if((allNumbers[index] % 2) == 0){
            primeNumber.classList.add("red-decoration");
        }else{
            primeNumber.classList.add("blue-decoration");
        }
        */

        //Finally we save the number on the list
        finalSolution += `<li>${primeNumber}</li>`
        
    }

    //Close the list
    list.innerHTML = finalSolution;
}

window.addEventListener('load', main);




















window.addEventListener('load',main);