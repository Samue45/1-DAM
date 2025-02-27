//Properties
let table;
let studentArray = new Array();

function main(){
    //Look for the elements in the DOM
    table = document.getElementById('table');
    document.getElementById('button').addEventListener('click', createTable);

    //Create the literal objects
    studentArray =[student1 = {
        name : "Paco",
        note1 : 8,
        note2 : 7,
        note3: 9   
    },
    student2 = {
        name : "María",
        note1 : 10,
        note2 : 9,
        note3: 9   
    },
    student3 = {
        name : "Antonio",
        note1 : 5,
        note2 : 7,
        note3: 6   
    }]; 
        
}

//Method to create the student table
function createTable(){

    //Create a String variable to save all contend of the table and another to save the media of the all notes
    let information = `<tr>
                            <th>Student</th> 
                            <th>Note 1</th> 
                            <th>Note 2</th> 
                            <th>Note 3</th> 
                            <th>Media</th>
                        </tr>`;
    let media = 0;

    for(let i=0; i < studentArray.length; i++){
        //Calculate the media of each student
        media = (studentArray[i].note1 + studentArray[i].note2 + studentArray[i].note2) / 3;
        //Create the rest of the table and concatenate with the information variable .
        information += `<tr> 
                            <td>${studentArray[i].name}</td> 
                            <td>${studentArray[i].note1}</td>
                            <td>${studentArray[i].note2}</td> 
                            <td>${studentArray[i].note3}</td> 
                            <td>${media}</td>
                        </tr>`;
    }

    //Save all the information inside on the table
    table.innerHTML = information;
}


window.addEventListener('load',main)