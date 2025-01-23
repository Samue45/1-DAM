
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

    let tareaTr = document.createElement('tr');

    crearColumna(tareaTr,tarea);

    table.appendChild(tareaTr);

}

function crearColumna(trTask,tarea){

    Object.keys(tarea).forEach((propertie => {

        if(propertie != 'id'){
            //Creamos el elemento para la columna
        let tdTask = document.createElement('td');

        //Obtenemos el id de la tarea
        let idTarea = tarea.id;
        
        // Si la propiedad es 'estado', creamos un checkbox en lugar de texto
         if (propertie === 'estado') {
         let input = document.createElement('input');
         input.type = "checkbox";
         input.checked = tarea[propertie];  // Marca el checkbox si el estado es 'true'
         input.addEventListener('change', (e) => actualizarEstadoTarea(idTarea, e.target.checked));
         tdTask.appendChild(input);
         } else {
         // Para las otras propiedades, simplemente mostramos su valor
         tdTask.textContent = tarea[propertie];
         }
 
         //Añadimos un botón para eliminar cada tarea
         if(tarea[propertie] === null){
             let button = document.createElement('button');
             button.textContent = "Eliminar";
             button.addEventListener('click', () => eliminarTarea(idTarea))
             tdTask.appendChild(button);
         }
         //Añadimos el elemento a la fila
         trTask.appendChild(tdTask);
 
         // Si la tarea está completada, se aplica el estilo correspondiente
         if (tarea.estado === true) {
             trTask.classList.add("completada"); // Añadimos una clase CSS para las tareas completadas
         }
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



function actualizarEstadoTarea(id, estadoCompletado) {

    arrayTareas.forEach((element, index) =>{

        //El cambio se aplica sobre el objeto literal guardado en el Array, pero no sobre el elemento que está en el DOM
        if(element.id === id) {
            // Actualizamos el estado de la tarea en el array usando su índice
            arrayTareas[index].estado = estadoCompletado ? true : false;
        }
    })
}

function eliminarTarea(id){

    arrayTareas.forEach((element, index) =>{


        //Se elimina del Array pero no del DOM
        if(element.id == id) {
             // Eliminar la tarea del array
            arrayTareas.splice(index, 1);
        }
    })

}
