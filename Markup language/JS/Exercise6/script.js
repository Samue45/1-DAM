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
            if(i % 2 == 0){list += `<li class='blue-decoration' > ${allNumbers[i]} </li>`}
            else{list += `<li class='red-decoration' > ${allNumbers[i]} </li>`};  
        }


    }
    //Close the list
    list += `</ul>`;

    container.innerHTML = list;
}


//Calculate multiples numbers
function obtenerMultiplos(numero, cantidad) {
    let multiplos = [];
    for (let i = 1; i <= cantidad; i++) {
      multiplos.push(numero * i);
    }
    return multiplos;
  }


window.addEventListener('load', main);




















window.addEventListener('load',main);