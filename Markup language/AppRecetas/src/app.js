import { Controlador } from "./controlador.js";

//Creamos una instancia de Controlador
let controlador = new Controlador();
//Array global con todas las recetas
let arrayRecetas = controlador.obtenerRecetas();
//Array global de ingredientes
let arrayIngredientes = [];
//Cuerpo de la tabla
let cuerpo = document.createElement('tbody');
//Identificador para el botón de eliminar 
let indentificador = 0;



//1.Espero que la página cargue.
window.addEventListener('load',main);
//2.En el main pongo los manejadores de evento.
//También tengo que mostrar al principo la lista de recetas: llamo al método del servicio obtenerRecetas
//y uso la técnica de innerHTML para crear la lista
//Recordad que cada item (li) tiene un botón borrar al que asociaremos un manejador.
function main (){

     //Método para crear la tabla
    crearTabla();

    //Bóton para crear una nueva receta
    document.getElementById('new-receta').addEventListener('click',crearReceta);

    //Botón para crear un nuevo ingrediente
    document.getElementById('newIgrediente').addEventListener('click',crearIgrediente);

    //Botón para eliminar una receta
    document.querySelector('table').addEventListener('click', eliminarReceta);

}

function crearTabla(){
    //Creamos la tabla
    let tabla = document.createElement('table');

    //Creamos la cabecera de la tabla
    crearCabeceraTabla(tabla);

    //Creamos el cuerpo de la tabla
    crearCuerpoTabla(tabla);

    //Añadimos la tabla al DOM, tengo que especificar que es el DOM de index.html 
    document.getElementById('lista-recetas').appendChild(tabla);

}
function crearCabeceraTabla(tabla){

    //Creamos un thead
    let cabecera = document.createElement('thead');

    //Creamos una fila para la cabecera
    let filaHead = document.createElement('tr');
    

    
    // Obtenemos las propiedades de la primera receta para usarlas como cabeceras
    if (arrayRecetas.length > 0) {
        let nombresPropiedades = Object.keys(arrayRecetas[0]);

        // Añadimos los nombres de las propiedades como cabeceras de columna
        nombresPropiedades.forEach(propiedad => {

            if(propiedad !== 'id'){
                let columna = document.createElement('th');
                columna.textContent = propiedad; // Ponemos el nombre de la propiedad
                filaHead.appendChild(columna);
            }
            
        });
    }

    //Añadimos la fila al thead
    cabecera.appendChild(filaHead);

    //Añadimos la cabecera a la tabla
    tabla.appendChild(cabecera);
}

function crearCuerpoTabla(tabla){
    //El cuerpo es global, para poder añadir una nueva fila cuando se cree una nueva receta

    arrayRecetas.forEach(receta =>{

        //Por cada receta creamos un a nueva fila y una lista para los diferentes ingredientes
        let filaBody = document.createElement('tr');

        // Recorremos las propiedades de la receta
        Object.keys(receta).forEach(propiedad => {
            let columna = document.createElement('td');
    
            if (typeof receta[propiedad] !== 'number' && !Array.isArray(receta[propiedad])) {
                // Si no es un número ni un array, mostramos el valor simple
                columna.textContent = receta[propiedad]; // Accedemos al valor de la propiedad
                filaBody.appendChild(columna);
            } else if (Array.isArray(receta[propiedad])) {
             // Si la propiedad es un array 
                let ulIngredientes = document.createElement('ul'); // Lista para los ingredientes
                    receta[propiedad].forEach(ingrediente => {
                        let liIngrediente = document.createElement('li');
                        liIngrediente.textContent = `${ingrediente.ingrediente.nombre}: ${ingrediente.cantidad}g`; // Mostramos nombre y cantidad
                        ulIngredientes.appendChild(liIngrediente);
                    });

                columna.appendChild(ulIngredientes);
                filaBody.appendChild(columna);

                let columnaEliminar = document.createElement('td');
                columnaEliminar.appendChild(crearButtonEliminarReceta());

                filaBody.appendChild(columnaEliminar)
            }
        });
        //Añadimos la fila al cuerpo
        cuerpo.appendChild(filaBody);
    })

    //Añadimos el cuerpo a la tabla
    tabla.appendChild(cuerpo);

}
function crearButtonEliminarReceta(){
    let button = document.createElement('button');
    
    button.textContent = 'Eliminar';
    button.id = indentificador;
    indentificador++;
    return button;
    
}

//3.Manejador de evento del botón +.
//Cojo los datos del formulario y llamo al método del servicio añadirReceta
function crearReceta(event) {
    // 1º Prevenir el comportamiento por defecto del formulario (recarga de la página)
    event.preventDefault();

    // 2º Obtenemos los elementos del DOM
    let nombre = document.getElementById('nombre');
    let descripcion = document.getElementById('descripcion');
    let categoria = document.getElementById('categoria');

    // 3º Llamamos al método agregarReceta de nuestro Controlador y le pasamos los valores de cada elemento
    controlador.agregarReceta(nombre.value, descripcion.value, categoria.value, arrayIngredientes); // Aquí deberías agregar la receta al servicio

    // 4º Actualizamos la lista de recetas
    arrayRecetas = controlador.obtenerRecetas(); // Actualizamos el arrayRecetas con las recetas más recientes

    // 5º Creamos una nueva fila para la receta y la añadimos al cuerpo de nuestra tabla
    let filaBody = document.createElement('tr');
    let arrayPropiedades = [nombre.value, descripcion.value, categoria.value, arrayIngredientes];

    arrayPropiedades.forEach((propiedad, index) => {
        if (!Array.isArray(propiedad)) {
            let columna = document.createElement('td');
            columna.textContent = propiedad; 
            filaBody.appendChild(columna);
        } else if (Array.isArray(propiedad)) {
            // 6º Añadir los ingredientes de la nueva receta a la tabla
            let columnaIngredientes = document.createElement('td');  // Nueva celda para los ingredientes
            let ulIngredientes = document.createElement('ul'); // Lista para los ingredientes
            propiedad.forEach(ingrediente => {
                let liIngrediente = document.createElement('li');
                liIngrediente.textContent = `${ingrediente.nombre}: ${ingrediente.cantidad}g`; // Mostramos nombre y cantidad
                ulIngredientes.appendChild(liIngrediente);
            });
            columnaIngredientes.appendChild(ulIngredientes);  // Añadimos la lista a la celda
            filaBody.appendChild(columnaIngredientes);  // Añadimos la celda con los ingredientes a la fila
        }
    });

    // 7º Creamos un botón para eliminar la receta
    let columnaEliminar = document.createElement('td');
    columnaEliminar.appendChild(crearButtonEliminarReceta());

    filaBody.appendChild(columnaEliminar);
    cuerpo.appendChild(filaBody);

    // 8º Cuando creamos la receta debemos vaciar el array de ingredientes global
    arrayIngredientes = [];

    console.log(arrayRecetas);
}

//4.Manejador de los botones -.
//Tengo que distingir (e.target) de qué receta se trata y llamar método del servicio borrar.
function crearIgrediente(event){
     // 1º Prevenir el comportamiento por defecto del formulario (recarga de la página)
    event.preventDefault();

    //Mejora
    // Cuando se añade un nuevo ingrediente guardamos los datos anteriores en un array y limpiamos los inputs
    //1º Obtener los valores de los inputs
    let nombre = document.getElementById('nombre-ingrediente');
    let cantidad = document.getElementById('cantidad-ingrediente');
    let calorias = document.getElementById('calorias-ingrediente');

    //2º Guardarlo en un array como un objeto literal
    arrayIngredientes.push({
        nombre : nombre.value,
        cantidad : cantidad.value,
        calorias : calorias.value
    })

    //3º Refrescar el contenido de cada input
    nombre.value = '';
    cantidad.value = '';
    calorias.value = '';
}

function eliminarReceta(event){
     // 1º Prevenir el comportamiento por defecto del formulario (recarga de la página)
     event.preventDefault();

    
    if(event.target.tagName.toLowerCase() === 'button' ){
        //Se elimina de la lista
        controlador.eliminarReceta(event.target.id);
        //Se elimina de la tabla
        event.target.closest('tr').remove();
    }
    
}

//Notas: Cada vez que borro o añado una receta deo actualizar la lista de receta. Es mejor tener una
//función de apoyo para llamarla cada vez que quiera volver a crear la vista.
