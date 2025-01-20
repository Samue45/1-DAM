
window.addEventListener('load', main);

let arrayTareas = [];
let table;

function main(){
    
    //Botón
    document.querySelector('button').addEventListener('click', createTask);


    //Tabla
    table = document.createElement('table');
    
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
        estado : false,
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

     // Limpiar la tabla antes de agregar nuevas filas
     table.innerHTML = '';

     // Volver a agregar la cabecera después de limpiar la tabla
     crearCabecera();
    
    arrayTareas.forEach((element, index) => {

        //1º Por cada objeto literal creamos una fila
        let trTask = document.createElement('tr');

        //2º Por cada propiedad del objeto literal creamos una columna
        crearColumnas(trTask,element,index);

        //3º Añadimos la fila a la tabla
        table.appendChild(trTask);
     })
}

function crearColumnas(trTask,element,index){
    
    Object.keys(element).forEach((propertie => {

        //Creamos el elemento para la columna
        let tdTask = document.createElement('td');
        // Le asignamos el valor de la propiedad del objeto literal
        tdTask.textContent = element[propertie];
        
        //Añadimos una checkbox
        if(element[propertie] === false){
            tdTask.textContent = null;

            // Estado: Checkbox para completar la tarea
            let input = document.createElement('input');
            input.type = "checkbox";
            input.checked = element.estado; // Marca la tarea si está completada
            input.addEventListener('change', (e) => actualizarEstadoTarea(index, e.target.checked));
            tdTask.appendChild(input);
        }

        //Añadimos un botón para eliminar cada tarea
        if(element[propertie] === null){
            let button = document.createElement('button');
            button.textContent = "Eliminar";
            button.addEventListener('click', () => eliminarTarea(index))
            tdTask.appendChild(button);
        }
        //Añadimos el elemento a la fila
        trTask.appendChild(tdTask);

        // Si la tarea está completada, se aplica el estilo correspondiente
        if (element.estado === true) {
            trTask.classList.add("completada"); // Añadimos una clase CSS para las tareas completadas
        }

    }))
}

function actualizarEstadoTarea(index, estadoCompletado) {
    // Actualizamos el estado de la tarea en el array usando su índice
    arrayTareas[index].estado = estadoCompletado ? true : false;

    // Volver a renderizar la tabla
    crearFilas();
}

function eliminarTarea(index){

    // Eliminar la tarea del array
    arrayTareas.splice(index, 1);

    // Volver a renderizar la tabla
    crearFilas();

}
