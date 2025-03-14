// 1º Crear una función esperarTiempo(ms) devuelve una promesa resuelta

function esperarTiempo(ms){
    setTimeout(() => {
        return fetch('https://api.ejemplo.com/submit')
        .then(response => {})
        .catch(error => {})
    }, ms);
    
    
}

// 2º Manejar la promesa con  .then().catch()
// 3º Manejar la promesa con async/await y try...catch.