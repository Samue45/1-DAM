// Importa las dependencias
const express = require('express');
const mysql = require('mysql2');

// Crea una instancia de Express
const app = express();

// Configura Express para manejar solicitudes JSON
app.use(express.json());

//--------------------------------------------------Creación de la base de datos-------------------------------------

// Configura el puerto
const port = 3000;

// Configura la conexión a MySQL sin especificar base de datos
const connection = mysql.createConnection({
  host: 'localhost', // Dirección del servidor de base de datos
  user: 'root',      // Tu usuario de MySQL
  password: '',      // Tu contraseña de MySQL
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

// Ruta para crear la base de datos y las tablas
app.post('/crear-base-de-datos-y-tablas', (req, res) => {
  // Primero creamos la base de datos (si no existe)
  const crearBaseDeDatosQuery = 'CREATE DATABASE IF NOT EXISTS escuela';

  connection.query(crearBaseDeDatosQuery, (err, results) => {
    if (err) {
      console.error('Error al crear la base de datos:', err);
      return res.status(500).json({ error: 'Error al crear la base de datos' });
    }

    // Ahora cambiamos a la base de datos 'escuela'
    connection.changeUser({ database: 'escuela' }, (err) => {
      if (err) {
        console.error('Error al cambiar a la base de datos escuela:', err);
        return res.status(500).json({ error: 'Error al cambiar a la base de datos escuela' });
      }

      // Creamos las tablas en la base de datos 'escuela'
      const crearTablasQuery = `
        CREATE TABLE IF NOT EXISTS estudiantes (
          id INT AUTO_INCREMENT PRIMARY KEY,
          nombre VARCHAR(255) NOT NULL,
          email VARCHAR(255) NOT NULL UNIQUE,
          edad INT
        );
        
        CREATE TABLE IF NOT EXISTS cursos (
          id INT AUTO_INCREMENT PRIMARY KEY,
          nombre VARCHAR(255) NOT NULL,
          descripcion TEXT,
          duracion INT NOT NULL
        );

        CREATE TABLE IF NOT EXISTS inscripciones (
          id INT AUTO_INCREMENT PRIMARY KEY,
          estudianteId INT,
          cursoId INT,
          fechaInscripcion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
          FOREIGN KEY (estudianteId) REFERENCES estudiantes(id) ON DELETE CASCADE,
          FOREIGN KEY (cursoId) REFERENCES cursos(id) ON DELETE CASCADE
        );
      `;

      // Ejecutamos la consulta para crear las tablas
      connection.query(crearTablasQuery, (err, results) => {
        if (err) {
          console.error('Error al crear las tablas:', err);
          return res.status(500).json({ error: 'Error al crear las tablas' });
        }
        res.status(200).json({ message: 'Base de datos y tablas creadas con éxito' });
      });
    });
  });
});

// Inicia el servidor
app.listen(port, () => {
  console.log(`Servidor escuchando en el puerto ${port}`);
});

// --------------------------- Endpoints del Backend ------------------


//Endpoints para la tabla estudiante
app.post('/estudiante', (req,res) => {
  // 1º Conocer los datos que me ha enviado el usuario y guardarlos en variables por seperado
  const {nombre, email, edad} = req;

  const crearEstudiante = 'INSERT INTO estudiante(nombre, email, edad) VALUES ()';

})