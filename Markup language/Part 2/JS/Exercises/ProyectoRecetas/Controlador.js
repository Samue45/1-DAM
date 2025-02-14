//Importamos las clases
import Servicio from "./servicio.js";

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
    actualizarReceta(receta){
        this.servicio.actualizarReceta(recetaNueva);
    }

    //Crear receta
    crearReceta(receta){
        this.servicio.crearReceta(recetaNueva);
    }


}
