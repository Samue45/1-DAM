import { Controlador } from "./Controlador.js";

window.addEventListener('load', main);

// Variable global que va a contener la instancia del controlador
let controlador;

function main(){

    //  Cogemos el botón del DOM y le colocamos un eventListener
    document.getElementById("start-game").addEventListener('click',empezarJuego);
}

function crearJuego() {
    // Obtener el valor seleccionado en el <select>
    let selectElement = document.getElementById('dificultad');
    let optionValue = selectElement.value;

    // Creamos un obejto literal donde asignamos un número a cada nivel de dificultad
    const niveles = { "facil": 0, "medio": 1, "dificil": 2 };
    let nivelDificultad = niveles[optionValue];

    console.log("Juego iniciado con dificultad:", optionValue, "(", nivelDificultad, ")");

    // Instanciar el controlador con el nivel de dificultad
    controlador = new Controlador(nivelDificultad);
}


function empezarJuego(){

    // Creamos el juego en base al nivel de dificultad elegido por el usuario
    crearJuego();

    // 1º Generar la solución ganadora
    // 2º Mostrar la paleta de colores que el usuario debe emplear para jugar
    // 3º Mostrar un vector de colores por cada intento que tenga el jugador
    // 4º Mostrar un vector de pistas por cada intento que tenga el jugador
    // 5º Mostrar un vector para la solución ganadora
    
    // El usuario debe poder agarrar un color de la paleta de colores y arrastrarlo hasta el
    // array que contendra su respuesta. Cuando el array esté lleno, se comprueba si ha acertado

}