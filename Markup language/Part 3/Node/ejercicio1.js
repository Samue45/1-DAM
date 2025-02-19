// Importar express
const express = require('express');

// Crear una aplicación express
const app = express();

// Definir un puerto para el servidor
const port = 3000;

// Ruta básica de prueba
app.get('/', (req, res) => {
  res.send(getNumber());
});

//Ejercicio 1
function getNumber(){
  let randomNumber = Math.floor(Math.random() * 100); // Random number between 0 and 99
  let mensaje = "";

  if((randomNumber % 2) == 0){
    mensaje = 'El número es par ' + randomNumber;
  }else{
    mensaje = 'El número es impar ' + randomNumber;
  }

  return mensaje;
}

// Iniciar el servidor
app.listen(port, () => {
  console.log(`Servidor corriendo en http://localhost:${port}`);
});
