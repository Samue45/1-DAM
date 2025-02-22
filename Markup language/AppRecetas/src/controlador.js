import { ServicioRecetas } from "./servicioRecetas.js";
//Comienzo el controlador
//instancio el servicio
export class Controlador {

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