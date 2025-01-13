let inputNumber, container;

function main(){

    inputNumber = document.getElementById('inputNumber');
    container = document.getElementById('container');

    document.getElementById('button').addEventListener('click', obtainMultples);
}


//Calculate multiples numbers
function obtainMultples() {
    //1º Start the list
    let list = `<ul>`;

    for (let i = 1; i <= 10; i++) {
      let mutiples = parseInt(inputNumber.value) * i;

      if(i % 2 == 0) {
        list += `<li class = 'red-decoration'>${mutiples}</li>`
      }else{
        list += `<li class = 'blue-decoration'>${mutiples}</li>`
      }
    }
    
    //2º Close the list
    list += `</ul>`;

    container.innerHTML = list;
}


window.addEventListener('load', main);




















window.addEventListener('load',main);