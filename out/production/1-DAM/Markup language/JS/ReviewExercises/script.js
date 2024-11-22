let input1, input2, myParagraph;


function main(){
    //We look for the element in the DOM
    input1 = document.getElementById('input1');
    input2 = document.getElementById('input2');
    myParagraph = document.getElementById('result');

    //We look for the button element and set an event 
    document.getElementById('button').addEventListener('click', sumNumbers);

}

function sumNumbers(){

    //We get the values of the inputs, then change into numbers to can sum and finally change to String data
    if(validateData() == false){
        myParagraph.innerHTML = String(parseInt(input1.value) + parseInt(input2.value)); 
    } else {
        myParagraph.innerHTML = "ERROR: Some of the numbers isn't a real number :(";
    }
    
    
}

//Method to check if data are numbers
function validateData(){
    //We can use the isNan method that return true if the values of inputs can't change into numbers
    return isNaN(parseInt(input1.value)) || isNaN(parseInt(input2.value));
}




window.addEventListener('load', main);