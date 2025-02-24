// Importa las dependencias
const express = require('express');
const mysql = require('mysql2');

// Crea una instancia de Express
const app = express();

// Configura el puerto
const port = 3000;

// Configura la conexión con MySQL
const connection = mysql.createConnection({
  host: 'localhost', // Dirección del servidor de base de datos
  user: 'root',      // Tu usuario de MySQL
  password: '',      // Tu contraseña de MySQL
  database: 'prueba' // Nombre de la base de datos
});

// Conecta a la base de datos
connection.connect((err) => {
  if (err) {
    console.error('Error al conectar a la base de datos:', err);
    process.exit(1); // Sale si no puede conectar
  } else {
    console.log('Conexión a la base de datos establecida con éxito');
  }
});


// Configura Express para manejar solicitudes JSON
app.use(express.json());

// Inicia el servidor
app.listen(port, () => {
  console.log(`Servidor escuchando en el puerto ${port}`);
});

// Ruta para obtener todos los usuarios
app.get('/usuarios', (req, res) => {
  const sql = 'SELECT * FROM usuarios'; // Consulta SQL

  connection.query(sql, (err, results) => {
    if (err) {
      console.error('Error en la consulta:', err);
      res.status(500).send('Error en la base de datos');
    } else {
      res.json(results); // Devuelve los resultados como respuesta en formato JSON
    }
  });
});
