//Array global para las tareas.Sin tareas iniciales.
let arrayTareas =[]; 
//Voy a acceder a los inputs y a la lista desde varias funciones
let inputTitulo, inputDescripcion, lista;

//De forma forzada (cuando uso innerHTML), para diferenciar cada li de la lista y cada botón de borrar usará este contador.
let contador=0

window.addEventListener('load',main);

function main(){
    //Cojo los inputs y el botón para añadir
    inputTitulo= document.querySelector('#titulo');
    inputDescripcion= document.querySelector('#descripcion');
    lista=document.querySelector('ul');
    document.getElementById('boton').addEventListener('click', anadirTarea);     
}

function anadirTarea(){
    //1.Cojo los valores actuales de los inputs y con ellos creo un objeto literal que añado al array de tareas.
    arrayTareas.push({
        id:contador,
        titulo: inputTitulo.value,
        descripcion: inputDescripcion.value,
        fecha: Date.now(),
        completada: false
    })

    //2.Crea además un nuevo li que añado a la lista.
    let nuevoLi = document.createElement('li');
    nuevoLi.textContent = `${titulo}: ${descripcion}`;
    nuevoLi.id = contador;
    nuevoLi.addEventListener('click',cambiarEstilo);

    let botonBorrar = document.createElement('button');
    botonBorrar.textContent = 'Borrar';
    botonBorrar.id = contador;
    botonBorrar.addEventListener('click', borrarTarea);

    nuevoLi.appendChild(botonBorrar);
    lista.appendChild(nuevoLi);

    contador++;
}

function cambiarEstilo(e){
    //e va a guardar el objeto evento, que tiene información sobre el evento que ha sucedido.
    //Quiero que una tarea completada sea verde y si no lo está roja.
    //La propiedad target del objeto evento (e) me devuelve el objeto del DOM (en este caso el li)
    //sobre el que se produce el evento click.

    //Averigo usando e.target.id cuál es la tarea a la que corresponde ese li en el array

    //Sabiendo cuál es la tarea miro su booleano "completada" y hago un if-else
    //Si está a true le asigno asigno una clase de un color verde
    e.target.classList.add()
    //Si está a false se lo quito.
    e.target.classList.remove()
}

function borrarTarea(e){

}
