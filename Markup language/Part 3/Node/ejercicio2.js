// Importar express
const express = require('express');

// Crear una aplicación express
const app = express();

// Definir un puerto para el servidor
const port = 3000;

// Ruta básica de prueba
app.get('/saludo', (req, res) => {
  res.send('Hola');
});

app.post('/despedida', (req, res) => {
  res.send('Adiós');
});




// Iniciar el servidor
app.listen(port, () => {
  console.log(`Servidor corriendo en http://localhost:${port}`);
});

