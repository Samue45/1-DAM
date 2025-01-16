//Properties

//Create headers for the table
let headers = ["Students","Note 1","Note 2","Note 3","Media"];
    
//Create the literal objects
let studentArray =[{
    name : "Paco",
    note1 : 8,
    note2 : 7,
    note3: 9   
},
{
    name : "María",
    note1 : 10,
    note2 : 9,
    note3: 9   
},
{
    name : "Antonio",
    note1 : 5,
    note2 : 7,
    note3: 6   
},
//Calcular media como un objeto literal
media =>{

}]; 



function main(){
    document.getElementById('button').addEventListener('click', createTable);
    
}

//Method to create the student table
function createTable(){
    
    //Create the header of the table

    let table = document.createElement('table');

    let trHeader = document.createElement('tr');
    for(let i= 0; i < headers.length; i++){
        // We create the elements th and add to the element tr
        let th = document.createElement('th');
        // 1º Opción = th.textContent = headers[i];
        //2º Opción
        // let texto = document.createTextNode(headers[i]);
        th.appendChild(document.createTextNode(headers[i]));
        trHeader.appendChild(th);
    }
    // We add the header to the table
    table.appendChild(trHeader);

    //Create rest of the table
    for(let i=0; i < studentArray.length; i++){
        let media = 0;

        let trAlumno = document.createElement('tr');
        //Calculate the media of each student
        media =(studentArray[i].note1 + studentArray[i].note2 + studentArray[i].note2) / 3;

        //Crear las columnas de cada fila usando un bucle for
        for (let index = 0; index < studentArray.length; index++) {
            let td = document.createElement('td');
            td.appendChild(studentArray[i]);
            
            
            trAlumno.appendChild(td);
        }
    
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

        trAlumno.appendChild(td1);
        trAlumno.appendChild(td2);
        trAlumno.appendChild(td3);
        trAlumno.appendChild(td4);
        trAlumno.appendChild(td5);

        //Save all the information inside on the table
        table.appendChild(trAlumno);

    }
    //Finally add the table to the body
    document.body.appendChild(table); 
}


window.addEventListener('load',main)