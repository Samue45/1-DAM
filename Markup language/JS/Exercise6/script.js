let inputNumber, container;

function main(){

    inputNumber = document.getElementById('inputNumber');
    container = document.getElementById('container');

    document.getElementById('button').addEventListener('click', primeNumbers);
}

function primeNumbers(){
    //1º Create an Array to can calculate the primes numbers and set a style and the begining of our list
    let allNumbers = new Array(parseInt(inputNumber.value));
    //The list
    let list = `<ul>`;

    //2º We run the Array to calculate what numbers are primes and also to set a style
    for (let i = 0; i < allNumbers.length; i++) {
    
        //Save the numbers inside
        allNumbers[i] = i + 1;
        //Check if the number is prime
        if(isPrime(allNumbers[i])){
            list += `<li> ${allNumbers[i]} </li>`;
        }
    }
    //Close the list
    list += `</ul>`;

    container.innerHTML = list;
}


//Check if the number is prime
function isPrime(number){
    if (number < 2) return false; // Numbers less than 2 are not prime
    for (let i = 2; i <= Math.sqrt(number); i++) {
        if (number % i === 0) {
            return false; // Number is divisible by another number, so it's not prime
        }
    }
    return true; // If no divisors are found, the number is prime
}

//Create a method to change into the style of the <li> depends on if it's even or odd
function setStyle(elemnt){
    

}

window.addEventListener('load', main);




















window.addEventListener('load',main);