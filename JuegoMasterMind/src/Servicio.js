
export class Servicio{

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

    // Patron Singleton
    static instancia;

    constructor(nivelDificultad) {
        if (Servicio.instancia) {
            return Servicio.instancia;
        }
        this.ininializacionDatos = this.setDificultad(nivelDificultad);
        Servicio.instancia = this;  // Guardar la instancia
    }

    //Método para establecer el nivel de dificultad del juego
    // Devuelve un objeto literal con los datos del juego ya inicializados
    // Los niveles de dificultad son 3 y están representados por números
    // 0 = Fácil, 1 = Medio, 2 = Difícil 
    setDificultad(nivelDificultad) {
        let ininializacionDatos;
    
        switch(nivelDificultad) {
            case 0:
                ininializacionDatos = {
                    solucion: new Array(3),
                    pistas: new Array(3),
                    historialRespuestas: new Array(3),
                    historialPistas: new Array(3),
                    colores: [0, 1, 2],
                    numberIntentos: 15
                };
                break;
    
            case 1:
                ininializacionDatos = {
                    solucion: new Array(5), // 5 colores para la combinación
                    pistas: new Array(5),
                    historialRespuestas: new Array(5),
                    historialPistas: new Array(5),
                    colores: [0, 1, 2, 3, 4], // Colores para el nivel medio
                    numberIntentos: 10
                };
                break;
    
            case 2:
                ininializacionDatos = {
                    solucion: new Array(7), // 7 colores para la combinación
                    pistas: new Array(7),
                    historialRespuestas: new Array(7),
                    historialPistas: new Array(7),
                    colores: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10], // Colores para el nivel difícil
                    numberIntentos: 6
                };
                break;
    
            default:
                console.log("Error :(, no existe el nivel de dificultad, debe ser \n 0 = Fácil, 1 = Medio, 2 = Difícil  ");
                break;
        }
    
        return ininializacionDatos;
    }
    

    // Método que genera una combinación de colores aleatoria y la guarda en el arrayRespuesta inicializado en el constructor
    crearSolucion(){

        // 1º Obtenemos el arrayRespuesta que va a guardar la combiinación de colores generada
        let arraySolucion = this.ininializacionDatos.solucion;

        // 2º Rellenamos el array con números aleatorios
        for(let i=0; i < arraySolucion.length ; i++){
            let randomNumber = Math.random() * 10; // Devuelve números entre 0 y 1 , por eso multiplicamos por 10

            //Guardamos cada número aleatorio en el arrayRespuesta
            arraySolucion.push(randomNumber);
        }

        return arraySolucion;
    }

    //Método que permite comprobar la respuesta del usuario con la solución
    // Recibe como parámetro un array de números que han sido seleccionado por el usuario
    comprobarRespuesta(arrayColores){
        // Se comprueban la existencia y la posición de los números de la respuesta y de la solución para poder determinar el tipo de pista
        // Cada tipo de pista es representada con un número
        // Hay 3 tipos de pista : 1º Existe y está en la posición correcta = 0, 2º Existe y no está en la posición correcta = 1 y 3º  Ni existe y ni está en la posición correcta = 2

        // Se debe estar trabajando con los array originales, ya que si no los datos no se guardan
        let arraySolucion = this.ininializacionDatos.solucion;
        let arrayRespuesta = arrayColores;
        let arrayPistas = this.ininializacionDatos.pistas;
        let arrayHistorialRespuestas = this.ininializacionDatos.historialRespuestas;
        let arrayHistorialPistas = this.ininializacionDatos.arrayHistorialPistas;

        // Recorremos ambos arrays y comprobamos los colores que hay en cada uno y sus posiciones para determinar el tipo de pista
        arraySolucion.forEach((color, index) => {
            
            let colorSolucion = color;
            let indexSolucion = index;
            
            arrayRespuesta.forEach((color, index) => {

                let colorRespuesta = color;
                let indexSRespuesta = index;

                if(colorSolucion === colorRespuesta && indexSolucion === indexSRespuesta){
                    arrayPistas.push(0);
                }else if (arraySolucion.includes(colorRespuesta)){
                    arrayPistas.push(1);
                }else {
                    arrayPistas.push(2);
                }

            })

        });

        // Guardamos el array generado por el usuario para tener un historial
        arrayHistorialRespuestas.push(arrayRespuesta);
        arrayHistorialPistas.push(arrayPistas);

        return arrayPistas;
    }

    // Método que finaliza el juego
    // Recibe un número para indicar si el juego ha terminado o continua
    // Puede hacer 3 casos : 1º El jugador ha acertado = 0 , 2º El jugador se ha quedado sin intentos = 1 o 3º El jugador tiene más opurtunidades = 2
    // El número 4 significa que ha ahbido un error , ya que el número de intentos no puede ser menos a 0
    finJuego(arrayPistas){

        let respuesta = 0;
        // Si el jugador ha acertado significa que el array de pista solo contiene 0
        // Si el jugador no ha acertado significa que el array de pista contiene 1 o 2
        // Si no ha acertado pueden darse 2 casos : 1º No ha acertado pero sigue tiendo más intentos o 2º No ha acertado y se ha quedado sin intentos
        if(!arrayPistas.includes(0)){
            // Comprobamos el número de intentos
            // Que debe ir disminuyendo por cada respuesta que envie el usuario
            respuesta = this.continua(this.ininializacionDatos.numberIntentos);

            this.ininializacionDatos.numberIntentos--;
        }

        //Se sale del bucle que inicia el juego
        return respuesta;

    }

    // Método privado que determina si el jugador puede continuar jugando
    continua(number){

        if(number === 0) {
            return 1
        } else if (number > 0){
            return 2;
        } else {
            return 4;
        }

    }

    // Método para obtener el número de intentos que tiene el usuario
    getNumberIntentos(){
        return this.ininializacionDatos.numberIntentos;
    }

    // Método que devuelve los colores que debe usar el usuario para jugar
    getPaletaColores(){

        let arrayColores = this.ininializacionDatos.colores;

        
        // Rellenar el array con los colores disponibles según el tamaño
        Object.keys(this.Color).forEach((color, index) => {
            if (index < arrayColores.length) {
             arrayColores.push(this.Color[color]);  // Añadir los valores de los colores
            }
        });

        return arrayColores;
    }

    // Método para obtener el hisotorial de las respuestas del usuario
    getHistorialRespuestas(){
        return this.ininializacionDatos.historialRespuestas;
    }

    // Método para obtener el hisotorial de las pistas del usuario
    getHistorialPistas(){
        return this.ininializacionDatos.historialPistas;
    }
}