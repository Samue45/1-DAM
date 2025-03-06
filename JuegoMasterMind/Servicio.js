
export class Servicio{

    //Se debería seguir el patrón Singleton

    //Como en JS no exiten el tipo de dato Enum, voy a crear un objeto literal que contenga cada color y su número asociado
    Color = {
        ROJO : 0,
        VERDE: 1,
        AZUL: 2,
        AMARILLO: 3,
        MORADO: 5,
        NEGRO: 6,
        NARANJA: 7,
        BLANCO: 8,
        MARRON: 9,
        GRIS: 10
    }

    // Cuando instanciamos el servicio se determina el nivel de dificultad del juego para
    // definir el tamaño de cada Array y el número de intentos
    constructor(nivelDificultad){
        this.setDificultad(nivelDificultad);
    }

    //Método de devuelve un objeto literal con los datos del juego ya definidos
    // Los niveles de dificultad son 3 y están representados por números
    // 0 = Fácil, 1 = Medio, 2 = Difícil 
    setDificultad(nivelDificultad){

        let ininializacionDatos;

        switch(nivelDificultad){
            case 0:
                ininializacionDatos = {
                    solucion : arraySolucion[3],
                    respuesta : arrayRespuesta[3],
                    pistas : arrayPistas[3],
                    numberIntentos : 15
                }
                break;
            case 1:
                ininializacionDatos = {
                    solucion : arraySolucion[5],
                    respuesta : arrayRespuesta[5],
                    pistas : arrayPistas[5],
                    numberIntentos : 10
                }
                break;
            case 2:
                ininializacionDatos = {
                    solucion : arraySolucion[7],
                    respuesta : arrayRespuesta[7],
                    pistas : arrayPistas[7],
                    numberIntentos : 6
                }
                break;
            default:
                console.log("Error :(, no existe el nivel de dificultad, debe ser \n 0 = Fácil, 1 = Medio, 2 = Difícil  ");
                break;
        }

        return ininializacionDatos;
    }




}