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
}]; 



function main(){
    document.getElementById('button').addEventListener('click', createTable);
    
}

//Method to create the student table
function createTable(){
    
    //Create the header of the table

    let table = document.createElement('table');

    let trHeader = document.createElement('tr');
    headers.forEach((element =>{
        // We create the elements th and add to the element tr
        let th = document.createElement('th');
        th.textContent = element;
        trHeader.appendChild(th);
    }))

    // We add the header to the table
    table.appendChild(trHeader);

    //Create rest of the table
    studentArray.forEach((element => {
        //Creamos la fila de la tabla
        let trAlumno = document.createElement('tr');

        //Creamos cada columna de la tabla y le asignamos un valor a cada una 
        //El método Object.keys() me permite recorrer las propiedades de un objeto literal como si fuera un Array
        Object.keys(element).forEach((propiedad => {

            let td = document.createElement('td');
            td.textContent = element[propiedad]; // Así accedo al valor de cada propiedad del objeto literal

            //Falta calcular la media 
            
            //Guardamos la columna en la fila
            trAlumno.appendChild(td);
        }))
    

         //Finalmente guardamos la fila en la tabla
          table.appendChild(trAlumno);

    }))
    //Finally add the table to the body
    document.body.appendChild(table); 
}

function media(){
    let media = 0;

    studentArray.forEach((element => {
        media = (element.note1 + element.note2 + element.note3) / 3;
    }))

    return media;
}


window.addEventListener('load',main)