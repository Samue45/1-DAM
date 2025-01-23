
window.addEventListener('load', main);

let arrayTareas = [];
let table;
let contador = 0;

function main(){
    
    //Botón
    document.querySelector('button').addEventListener('click', createTask);

    //Tabla
    table = document.createElement('table');

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
    //3º Guardar los datos en el arrayTareas
    arrayTareas.push(tarea = {
        id: contador,
        nombre : nombre,
        descripcion: descripcion,
        fecha : fecha,
        estado : false,
        button: null
    });

    //4º Creamos las filas y las añadimos a la tabla
    crearFila(tarea);

    //5º Incrementados el índice de la tarea
    contador++;
}

function crearFila(tarea){

    //1º Creamos la fila de la tabla
    let tareaTr = document.createElement('tr');

    //2º Le damos un identifiador a la tabla
    tareaTr.setAttribute('title',contador);

    // 3º Creamos las columnas de la fila y le asignamos los valores a cada celda
    crearColumna(tareaTr,tarea);

    // Añadimos un estilo por defecto
    tareaTr.classList.add('incompleta');

    // 4º Finalmente, añadimos la fila a la tabla
    table.appendChild(tareaTr);

}

function crearColumna(trTask,tarea){

    // 1º Recorremos cada tarea que se ha guardado en el array, de modo que podemos generar varias columnas para cada propiedad de tarea
    Object.keys(tarea).forEach((propertie => {

        // 2º No queremos mostrar el identificador que tiene asociada cada tarea de la tabla, por lo que no se crea ninguna columna cuando la propiedad sea el id de la tarea
        if(propertie != 'id'){
            
            // 3º Creamos el elemento para la columna
            let tdTask = document.createElement('td');
        
            // 4º Si la propiedad es 'estado', creamos un checkbox en lugar de texto
            if (propertie === 'estado') {
                let input = document.createElement('input');
                input.type = "checkbox";
                input.checked = tarea[propertie];  // Marca el checkbox si el estado es 'true'
                input.addEventListener('change', actualizarEstadoTarea);
                tdTask.appendChild(input);
            } else {
            // 5º Para las otras propiedades, simplemente mostramos su valor
            tdTask.textContent = tarea[propertie];
            }

            // 6º Añadimos un botón para eliminar cada tarea
            if(tarea[propertie] === null){
                let button = document.createElement('button');
                button.textContent = "Eliminar";
                button.addEventListener('click', eliminarTarea)
                tdTask.appendChild(button);
            }
            // 7º Añadimos el elemento a la fila
            trTask.appendChild(tdTask);

        }

    }))


}


function mostrarTareas(){

    //Añadimos la tabla con todos sus elementos al DOM
    document.body.appendChild(table);
}

function crearCabecera(){

    let tablaHeaders = ['Nombre', 'Descripción', 'Fecha', 'Estado','Borrar'];

    //1º Añadir encabezado a la tabla
    let trHeader = document.createElement('tr');
    tablaHeaders.forEach((element =>{
        let thHeader = document.createElement('th');
        thHeader.textContent = element;
        trHeader.appendChild(thHeader);
    }))

    table.appendChild(trHeader);

}



function actualizarEstadoTarea(e) {
   
    let idTareaAsociada = e.target.parentElement.parentElement.getAttribute('title');
    let tareaAsociada = arrayTareas.find((tarea) => {return tarea.id == idTareaAsociada});

    tareaAsociada.estado = !tareaAsociada.estado;

    if(tareaAsociada.estado){
        e.target.parentElement.parentElement.classList.add('completada');
        e.target.parentElement.parentElement.classList.remove('incompleta');
         
    }
    else{
        e.target.parentElement.parentElement.classList.add('incompleta');
        e.target.parentElement.parentElement.classList.remove('completada');
        
    }

}

function eliminarTarea(e){

    // 1º Tenemos que buscar la tarea en el DOM por su id
    let idTareaAsociada = e.target.parentElement.parentElement.getAttribute('title');
    // 2º Necesitamos buscar la tarea en el array de tareas por su id
    let tareaAsociada = arrayTareas.find((tarea) => {return tarea.id == idTareaAsociada});
    
    // 3º Como se trata del botón su padre es el elemento td, a su vez el padre del td es el tr y es este el elemento que queremos eliminar
    e.target.parentElement.parentElement.remove();

    // 4º Eliminamos la tarea de la lista de tareas, para ello usamos el método filter y solo guardamos las tareas cuyo id sea diferente de la tarea que hemos eliminado
    arrayTareas.filter((tarea) => { return tareaAsociada != idTareaAsociada});

}
