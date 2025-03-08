import { Servicio } from "./Servicio";
export class Controlador{

    constructor(){
        this.Servicio = new Servicio();
    }

    //Método para determinar la dificultad el juego
    // POST(juego/{dificultad})
    setDificultad(nivelDificultad){
        this.Servicio.setDificultad(nivelDificultad);
    }

    // Método para obtener la combinación ganadora del juego
    // GET(juego/solucion)
    getSolucion(){
        return this.Servicio.crearSolucion();
    }

    // Método para generar pistas
    // Recibe como parámetro un array que contiene la combinación de colores generada por el usuario
    // GET(juego/pistas)
    getPistas(respuestaUser){
        return this.Servicio.comprobarRespuesta(respuestaUser);
    }

    // Método para determinar si el juego continua o ha terminado
    // Recibe como parámetro el array de Pistas , para determinar si el jugador continua o acaba
    // GET(juego/finJuego)
    getFinjuego(arrayPistas){
        this.Servicio.finJuego(arrayPistas);
    }

    // Método para obtener el número de intentos que le quedan al usuario
    // GET(juego/numeroIntentos)
    getNumberIntentos(){
        return this.Servicio.getNumberIntentos();
    }

    // Método para obtener el array de colores que contiene los colores que el usuario debe emplear para jugar
    // GET(juego/paletaColores)
    getPaletaColores(){
        return this.Servicio.getPaletaColores();
    }


    
}