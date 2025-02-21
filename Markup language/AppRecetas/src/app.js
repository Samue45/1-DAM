import { ServicioRecetas } from "./servicioRecetas";
//Comienzo el controlador
//instancio el servicio
class Controlador {

    constructor (){
        this.servicio = new ServicioRecetas();
    }

    //GET(/recetas)
    obtenerRecetas(){
        return this.servicio.obtenerRecetas();
    }
    //GET(/receta{id})
    obtenerReceta(id){
        return this.servicio.obtenerRecetaPorId(id)
    }
    //POST(/receta)
    agregarReceta(nombre, descripcion, categoria, ingredientes) {
        this.servicio.agregarReceta(nombre, descripcion, categoria, ingredientes);
    }
    //UPDATE(/receta{id})
    agregarReceta(id, nuevosDatos) {
        this.servicio.actualizarReceta(id, nuevosDatos);
    }
    //DELETE(/receta{id})
    eliminarReceta(id) {
        this.servicio.eliminarReceta(id);
    }

}

//Para diferenciar los DOMS de los 2 archivos html
const home = document.getElementById('home');
const newReceta = document.getElementById('new-receta');


//Creamos una instancia de Controlador
let controlador = new Controlador();
//Array global con todas las recetas
let arrayRecetas = controlador.obtenerRecetas();


//1.Espero que la página cargue.
window.addEventListener('load',main);
//2.En el main pongo los manejadores de evento.
//También tengo que mostrar al principo la lista de recetas: llamo al método del servicio obtenerRecetas
//y uso la técnica de innerHTML para crear la lista
//Recordad que cada item (li) tiene un botón borrar al que asociaremos un manejador.
function main (){

    crearTabla();
    
}

function crearTabla(){
    //Creamos la tabla
    let tabla = document.createElement('table');

    //Creamos la cabecera de la tabla
    crearCabeceraTabla();

    //Creamos el cuerpo de la tabla
    crearCuerpoTabla();

    //Añadimos la tabla al DOM, tengo que especificar que es el DOM de index.html 
    home.appendChild(tabla);

}
function crearCabeceraTabla(tabla){

    //Creamos un tr
    let cabecera = document.createElement('tr');

    //Dentro de la fila th, creamos una columna(td) por cada propiedad de la receta
    arrayRecetas.forEach(receta =>{

        // Obtener los nombres de las propiedades de la receta
        let nombresPropiedades = Object.keys(receta);

        // Añadir los nombres de las propiedades como cabeceras de columna
        nombresPropiedades.forEach(propiedad => {
        let columna = document.createElement('th');
        columna.textContent = propiedad;
        cabecera.appendChild(columna);
        });
        
    })

    //Añadimos la cabecera a la tabla
    tabla.appendChild(cabecera);
}

function crearCuerpoTabla(tabla){
    //Creamos un tr
    let cuerpo = document.createElement('tr');

    //Dentro de la fila tr, creamos una columna(td) por cada propiedad de la receta
    arrayRecetas.forEach(receta =>{

        //Recerremos cada receta como si fuera un array
        Object.keys(receta).forEach(propiedad => {
            let columna = document.createElement('td');
            columna.textContent = propiedad.value

            //Añadimos cada columna al cuerpo
            cuerpo.appendChild(columna);
        })
        
    })

    //Añadimos la cabecera a la tabla
    tabla.appendChild(cuerpo);

}
//3.Manejador de evento del botón +.
//Cojo los datos del formulario y llamo al método del servicio añadirReceta

//4.Manejador de los botones -.
//Tengo que distingir (e.target) de qué receta se trata y llamar método del servicio borrar.

//Notas: Cada vez que borro o añado una receta deo actualizar la lista de receta. Es mejor tener una
//función de apoyo para llamarla cada vez que quiera volver a crear la vista.