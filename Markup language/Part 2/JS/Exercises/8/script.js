
window.addEventListener('load', main);

let arrayTareas = [];
let table;

function main(){
    
    //Botón
    document.querySelector('button').addEventListener('click', createTask);

    //Tabla
    table = document.createElement('table');
    //Creamos la cabecera de la tabla y la añadimos a la tabla
    crearCabecera();

    //Mostramos la tabla
    mostrarTareas();
}

function createTask(){
    
    //1º Agarrar los inputs del DOM y obtener sus valores
    let nombre = document.getElementById('nombre').value;
    let descripcion = document.getElementById('descripcion').value;
    let fecha = document.getElementById('fecha').value;


    //2º Crear un objeto literal con los datos obtenidos
    let task = {
        nombre : nombre,
        descripcion: descripcion,
        fecha : fecha,
        estado : "No completada",
        button: null
    }

    //3º Guardar los datos en el arrayTareas
    arrayTareas.push(task);

    //4º Creamos las filas y las añadimos a la tabla
    crearFilas();
}

function mostrarTareas(){

    //Añadimos la tabla con todos sus elementos al DOM
    document.body.appendChild(table);
}

function crearCabecera(){

    let tablaHeaders = ['Nombre', 'Descripción', 'Fecha', 'Estado'];

    //1º Añadir encabezado a la tabla
    let trHeader = document.createElement('tr');
    tablaHeaders.forEach((element =>{
        let thHeader = document.createElement('th');
        thHeader.textContent = element;
        trHeader.appendChild(thHeader);
    }))

    table.appendChild(trHeader);

}

function crearFilas(){
    
    arrayTareas.forEach((element => {

        //1º Por cada objeto literal creamos una fila
        let trTask = document.createElement('tr');

        //2º Por cada propiedad del objeto literal creamos una columna
        crearColumnas(trTask,element);

        //3º Añadimos la fila a la tabla
        table.appendChild(trTask);
     }))
}

function crearColumnas(trTask,element){
    
    Object.keys(element).forEach((propertie => {

        //Creamos el elemento para la columna
        let tdTask = document.createElement('td');
        // Le asignamos el valor de la propiedad del objeto literal
        tdTask.textContent = element[propertie];
        
        //Añadimos una checkbox
        if(element[propertie] === "No completada"){
            tdTask.textContent = null;

            let input = document.createElement('input');
            input.type = "checkbox";
            tdTask.appendChild(input);
        }

        //Añadimos un botón para eliminar cada tarea
        if(element[propertie] === null){
            let button = document.createElement('button');
            button.textContent = "Eliminar";
            button.addEventListener('click', eliminarTarea)
            tdTask.appendChild(button);
        }
        //Añadimos el elemento a la fila
        trTask.appendChild(tdTask);

    }))
}

function eliminarTarea(){

    null

}
