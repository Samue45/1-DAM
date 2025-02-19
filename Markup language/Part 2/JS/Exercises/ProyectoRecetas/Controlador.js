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

    //Eliminar todas la recetas
    eliminarAllReceta(){
        this.servicio.eliminarAllReceta();
    }

    //Actualizar receta
    actualizarReceta(recetaNueva){
        this.servicio.actualizarReceta(recetaNueva);
    }

    //Crear receta
    crearReceta(recetaNueva){
        this.servicio.crearReceta(recetaNueva);
    }


}
