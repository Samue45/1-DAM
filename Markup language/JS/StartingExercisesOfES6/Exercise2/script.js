//PROPERTIES
let name;
let age;
let profession;
let result;



//Main method
function main(){

    //We look for the HTMLELEMNT in the DOM
    name = document.getElementById('name');
    age = document.getElementById('age');
    profession = document.getElementById('profession');
    result = document.getElementById('result');

    //We look for the button and set a function
    document.getElementById('button').addEventListener('click',createLiteralObject)
    
}

function createLiteralObject(){

    //We save the different values in a literal object student
    const student = {
        name: name.value,
        age: age.value,
        profession: profession.value
    }

    //We save all values inside of a paragraph
    result.innerHTML = "[Name: " + student.name + " Age: " +  student.age + " Profession: " +  student.profession + " ]";
}




window.addEventListener('load', main);