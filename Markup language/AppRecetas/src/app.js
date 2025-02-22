import { Controlador } from "./controlador.js";

//Creamos una instancia de Controlador
let controlador = new Controlador();
//Array global con todas las recetas
let arrayRecetas = controlador.obtenerRecetas();
//Cuerpo tabla
let cuerpo;



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
    document.getElementById('new-receta').addEventListener('click',crearReceta)

   
    

    
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
    //Creamos un tbody
    cuerpo = document.createElement('tbody');

    arrayRecetas.forEach(receta =>{

        //Por cada receta creamos un a nueva fila
        let filaBody = document.createElement('tr');

        //Obtenemos los datos de cada receta
        Object.keys(receta).forEach(propiedad => {

            if(typeof receta[propiedad] !== 'number' ){
            let columna = document.createElement('td');
            columna.textContent = receta[propiedad]; // Accedemos al valor de la propiedad


            //Añadimos cada columna a la fila
            filaBody.appendChild(columna);
            }
        })

        //Creamos filas nuevas

        
        //Añadimos la fila al cuerpo
        cuerpo.appendChild(filaBody);
    })

    //Añadimos el cuerpo a la tabla
    tabla.appendChild(cuerpo);

}
//3.Manejador de evento del botón +.
//Cojo los datos del formulario y llamo al método del servicio añadirReceta
function crearReceta(){

    // 1º Obtenemos los elementos del DOM
    let nombre = document.getElementById('nombre');
    let descripcion = document.getElementById('descripcion');
    let categoria = document.getElementById('categoria');
    // Lista de ingrdientes

    // 2º Llamamos al método agregarRecetas de muestro Controlador y le pasamos los valores de cada elemento
    controlador.agregarReceta(nombre.value, descripcion.value, categoria.value, null);

    //Receta nueva en la tabla
    let filaBody = document.createElement('tr');
    let receta = [nombre.value, descripcion.value, categoria.value, null];

    receta.forEach(propiedad => {
        
        let columna = document.createElement('td');
        columna.textContent = propiedad; 

        filaBody.appendChild(columna);
    })

    cuerpo.appendChild(filaBody);
    
}

//4.Manejador de los botones -.
//Tengo que distingir (e.target) de qué receta se trata y llamar método del servicio borrar.

//Notas: Cada vez que borro o añado una receta deo actualizar la lista de receta. Es mejor tener una
//función de apoyo para llamarla cada vez que quiera volver a crear la vista.