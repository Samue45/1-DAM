//Properties
let table;
let studentArray = new Array();


function main(){
    //Look for the elements in the DOM
    table = document.createElement('table');
    document.getElementById('button').addEventListener('click', createTable);
    

    //Create headers for the table
    headers = ["Students","Note 1","Note 2","Note 3","Media"];
    
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

    //Create the header of the table
    let tr1 = document.createElement('tr');
    for(let i= 0; i < headers.length; i++){
        // We create the elements th and add to the element tr
        let th = document.createElement('th');
        th.textContent = headers[i];
        tr1.appendChild(th);
    }
    // We add the header to the table
    table.appendChild(tr1);

    //Create rest of the table
    let media = 0;
    let tr2;
    for(let i=0; i < studentArray.length; i++){
        tr2 = document.createElement('tr');
        //Calculate the media of each student
        media =(studentArray[i].note1 + studentArray[i].note2 + studentArray[i].note2) / 3;
    
        //Create the rest of the table and concatenate with the information variable .
        let td1 = document.createElement('td');
        let td2 = document.createElement('td');
        let td3 = document.createElement('td');
        let td4 = document.createElement('td');
        let td5 = document.createElement('td');

        td1.textContent = studentArray[i].name;
        td2.textContent = studentArray[i].note1;
        td3.textContent = studentArray[i].note2;
        td4.textContent = studentArray[i].note3;
        td5.textContent = media;

        tr2.appendChild(td1);
        tr2.appendChild(td2);
        tr2.appendChild(td3);
        tr2.appendChild(td4);
        tr2.appendChild(td5);

        //Save all the information inside on the table
        table.appendChild(tr2);

    }

    //Finally add the table to the body
    document.body.appendChild(table);
}


window.addEventListener('load',main)