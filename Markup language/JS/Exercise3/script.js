//Start template
let input1;
let input2;
let myParagrahp;

function main(){
   
    //Look for the objects in the DOM
    input1 = document.getElementById('firstNumber');
    input2 = document.getElementById('secondNumber');
    myParagrahp = document.getElementById('solution');

    //Look for the button in he DOM and set a Listener to run the method calculateMedia
    document.getElementById('button').addEventListener('click', calculateMedia);
}

//Methods
function calculateMedia(){
    //Show the solution
    myParagrahp.textContent = String((parseInt(input1.value) + parseInt(input2.value)) / 2);
}


//The execution of man start
window.addEventListener('load', main);