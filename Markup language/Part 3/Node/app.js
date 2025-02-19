// Importar express
const express = require('express');

// Crear una aplicación express
const app = express();

// Definir un puerto para el servidor
const port = 3000;

// Ruta básica de prueba
app.get('/', (req, res) => {
  res.send('¡Hola, mundo!');
});

// Iniciar el servidor
app.listen(port, () => {
  console.log(`Servidor corriendo en http://localhost:${port}`);
});

