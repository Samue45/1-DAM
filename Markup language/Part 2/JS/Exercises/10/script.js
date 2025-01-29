
let mapa;
let circulo;
let puntaje;
let mensajePuntos;

window.addEventListener('load',main)

function main(){

    //1º Creamos el mapa , creamos el circulo e iniciamos el puntaje a 0
    iniciarElementosJuego();


    //2º Empiza el juego y vamos cambiando la posición del circulo de manera aleatoria
    iniciarCronometro(circulo);

}

function crearCirculo(){
    
    // Creamos el circulo , le aplicamos un estilo CSS y lo añadimos al mapa
    circulo = document.createElement('div');
    circulo.classList.add('circulo');
    mapa.appendChild(circulo);
}

//Función hecha por ChatGPT
function obtenerAleatorio(min, max) {
  return Math.floor(Math.random() * (max - min + 1)) + min;
}


function iniciarElementosJuego(){

    //Iniciamos el contador de puntos
    puntaje = 0;

    // Creamos el mapa , le aplicamos el estilo CSS, añadimos un manejador de eventos y lo añadimos al DOM
    mapa = (document.createElement('div'));
    mapa.classList.add('mapa');
    mapa.addEventListener('click',(e) => {
        
        //Si el circulo ha sido pulsado se incrementa el puntaje
        if(e.target && e.target.classList.contains("circulo")) {
            puntaje++;
            actualizarPuntaje(); // Actualizamos el puntaje en el DOM
        }
    
    })
    document.body.appendChild(mapa);

    //Creamos el circulo 1 vez
    crearCirculo();

    //Añadimos el puntaje al DOM cuando cargue la página
    mensajePuntos = document.createElement('p');
    mensajePuntos.textContent = "Puntaje =" + puntaje;
    mensajePuntos.classList.add('puntaje');
    document.body.appendChild(mensajePuntos)
}

function actualizarPuntaje() {
    // Seleccionamos el elemento con la clase 'puntaje' y actualizamos su texto
    mensajePuntos = document.querySelector('.puntaje');
    mensajePuntos.textContent = "Puntaje = " + puntaje;
}

function iniciarCronometro(circulo){

    // Iniciamos el cronometro
    let cronometro = 0;
    
    //1º Necesito poder acceder a las posiciones del circulo
    //2º Generar valores aleatorios para las nuevas coordenadas(x,y)
    //3º Asginar esos valores a la clase del circulo

    // Como el ancho máximo del mapa es 800px el valor x tendrá un rango de (0,800)
    // Como el alto máximo del mapa es 600px el valor y tendrá un rango de (0,600)

    //El método setInterval nos permite ejecutar un código cada cierto tiempo, en este caso cada 2 segundos se modifican las posiciones del círculo
    let intervalo = setInterval(() =>{

        circulo.style.left = obtenerAleatorio(0,810) + 'px';
        circulo.style.top = obtenerAleatorio(0,610) + 'px';
        contador++;
    },2000); 

    //Cuando el contador sea = 10 se deja de cambiar la posición del circulo
    if(cronometro >= 10) clearInterval(intervalo);
}