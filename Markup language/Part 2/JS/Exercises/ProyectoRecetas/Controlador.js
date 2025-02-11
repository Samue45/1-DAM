//Importamos las clases
import Servicio from "./Servicio.js";

class Controlador{

    constructor(){
        this.servicio = new Servicio();
    }

    //Obtener recetas
    obtenerRecetas(){
        this.servicio.obtenerListaRecetas;
    }

    //Obtener una receta por su id
    obtenerRecetaId(recetaId){
        this.servicio.obtenerReceta(recetaId);
    }

    //Eliminar receta
    eliminarReceta(recetaId){
        this.servicio.eliminarReceta(recetaId);
    }

    //Actualizar receta
    actualizarReceta(id, nombre,ingredientes,descripcion,categoria){
        this.servicio.actualizarReceta(id, nombre,ingredientes,descripcion,categoria);
    }

    //Crear receta
    crearReceta(id, nombre,ingredientes,descripcion,categoria){
        this.servicio.crearReceta(id, nombre,ingredientes,descripcion,categoria);
    }


}
