//PROPERTIES
let input1;
let paragraph;
const MILES = 0.621371;



//Main method
function main(){

    input1 = document.getElementById('input1');
    paragraph = document.getElementById('solution');

    document.getElementById('button').addEventListener('click',KmToMilles);
    
}

//Button function
function KmToMilles(){
    
    if(validData()){
        paragraph.innerHTML = "Solution: " + String(Number(input1.value) * MILES) + " miles";
    }else{
        paragraph.innerHTML = "ERROR :(, invalid data";
    }
    
    
}

//Method to check the data entered by the user
function validData(){

    /*
    We use the isNaN() method to check if the value of input1 can be transformed into a Number.
    To get the String that is inside of the input , we use the 'value' property and then use
    the Number() method can transform that String into a Number.
    */ 
    //Return TRUE if the value inside of input1 can be transform to a Number, so that is different to a NaN data
    return !isNaN(Number(input1.value));
}


window.addEventListener('load', main);