import { ServicioRecetas } from "./servicioRecetas";
//Comienzo el controlador
//instancio el servicio
class Controlador {

    constructor (){
        this.servicio = new ServicioRecetas();
    }


}
//1.Espero que la página cargue.
window.addEventListener('load',main);
//2.En el main pongo los manejadores de evento.
//También tengo que mostrar al principo la lista de recetas: llamo al método del servicio obtenerRecetas
//y uso la técnica de innerHTML para crear la lista
//Recordad que cada item (li) tiene un botón borrar al que asociaremos un manejador.
function main (){
    
}


//3.Manejador de evento del botón +.
//Cojo los datos del formulario y llamo al método del servicio añadirReceta

//4.Manejador de los botones -.
//Tengo que distingir (e.target) de qué receta se trata y llamar método del servicio borrar.

//Notas: Cada vez que borro o añado una receta deo actualizar la lista de receta. Es mejor tener una
//función de apoyo para llamarla cada vez que quiera volver a crear la vista.