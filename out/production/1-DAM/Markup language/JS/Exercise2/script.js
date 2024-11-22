//We look for the button and the inputs in the DOM and we reference they with a variable
let myButton = document.getElementById("button");
let input1 = document.getElementById('sumando1');
let input2 = document.getElementById('sumando2');
let myMedia = document.getElementById('media');

//We add a controler of events
myButton.addEventListener('click', calculateMedia);

//When we do click on the button this function is call
function calculateMedia(){

    //We get the value of the last directions and pass String to Int
    let value1 = parseInt(input1.value); 
    let value2 = parseInt(input2.value); 

    //We use the previous data to calcualte they media and show the solution
    myMedia.textContent += String((value1 + value2) / 2);

}