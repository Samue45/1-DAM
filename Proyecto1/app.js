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

// Ruta para crear la base de datos
app.post('/crear-base-de-datos', (req, res) => {
  const crearBaseDeDatosQuery = 'CREATE DATABASE IF NOT EXISTS escuela';

  // Ejecuta la consulta para crear la base de datos
  connection.query(crearBaseDeDatosQuery, (err, results) => {
    if (err) {
      console.error('Error al crear la base de datos:', err);
      return res.status(500).json({ error: 'Error al crear la base de datos' });
    }
    res.status(200).json({ message: 'Base de datos creada con éxito' });
  });
});


//--------------------------------------------------Creación de las Tablas de la Base de Datos-------------------------------------

// Ruta para crear la tabla de estudiantes
app.post('/crear-tabla', (req, res) => {
  // Cambia la conexión a la base de datos 'escuela'
  connection.changeUser({ database: 'escuela' }, (err) => {
    if (err) {
      console.error('Error al cambiar la base de datos:', err);
      return res.status(500).json({ error: 'Error al cambiar la base de datos' });
    }

    // Consulta SQL para crear la tabla de estudiantes
    const crearTablaQuery = `
      CREATE TABLE IF NOT EXISTS estudiantes (
        id INT AUTO_INCREMENT PRIMARY KEY,
        nombre VARCHAR(255) NOT NULL,
        email VARCHAR(255) NOT NULL UNIQUE,
        edad INT
      );
    `;

    // Ejecuta la consulta para crear la tabla
    connection.query(crearTablaQuery, (err, results) => {
      if (err) {
        console.error('Error al crear la tabla:', err);
        return res.status(500).json({ error: 'Error al crear la tabla' });
      }
      res.status(200).json({ message: 'Tabla de estudiantes creada con éxito' });
    });
  });
});

// Ruta para crear la tabla de cursos
app.post('/crear-tabla-cursos', (req, res) => {
  // Cambia la conexión a la base de datos 'escuela'
  connection.changeUser({ database: 'escuela' }, (err) => {
    if (err) {
      console.error('Error al cambiar la base de datos:', err);
      return res.status(500).json({ error: 'Error al cambiar la base de datos' });
    }

    // Consulta SQL para crear la tabla de cursos
    const crearTablaCursosQuery = `
      CREATE TABLE IF NOT EXISTS cursos (
        id INT AUTO_INCREMENT PRIMARY KEY,
        nombre VARCHAR(255) NOT NULL,
        descripcion TEXT,
        duracion INT NOT NULL
      );
    `;

    // Ejecuta la consulta para crear la tabla
    connection.query(crearTablaCursosQuery, (err, results) => {
      if (err) {
        console.error('Error al crear la tabla de cursos:', err);
        return res.status(500).json({ error: 'Error al crear la tabla de cursos' });
      }
      res.status(200).json({ message: 'Tabla de cursos creada con éxito' });
    });
  });
});

// Ruta para crear la tabla de inscripciones (relación N:M entre estudiantes y cursos)
app.post('/crear-tabla-inscripciones', (req, res) => {
  // Cambia la conexión a la base de datos 'escuela'
  connection.changeUser({ database: 'escuela' }, (err) => {
    if (err) {
      console.error('Error al cambiar la base de datos:', err);
      return res.status(500).json({ error: 'Error al cambiar la base de datos' });
    }

    // Consulta SQL para crear la tabla de inscripciones
    const crearTablaInscripcionesQuery = `
      CREATE TABLE IF NOT EXISTS inscripciones (
        id INT AUTO_INCREMENT PRIMARY KEY,
        estudianteId INT,
        cursoId INT,
        fechaInscripcion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
        FOREIGN KEY (estudianteId) REFERENCES estudiantes(id) ON DELETE CASCADE,
        FOREIGN KEY (cursoId) REFERENCES cursos(id) ON DELETE CASCADE
      );
    `;

    // Ejecuta la consulta para crear la tabla
    connection.query(crearTablaInscripcionesQuery, (err, results) => {
      if (err) {
        console.error('Error al crear la tabla de inscripciones:', err);
        return res.status(500).json({ error: 'Error al crear la tabla de inscripciones' });
      }
      res.status(200).json({ message: 'Tabla de inscripciones creada con éxito' });
    });
  });
});

// ------------------------------ Inicio del Servidor------------------------
// Inicia el servidor
app.listen(port, () => {
  console.log(`Servidor escuchando en el puerto ${port}`);
});
