// Importa las dependencias
const e = require('express');
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
  database: 'escuela'
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

// POST /estudiantes → Crear un estudiante
app.post('/estudiante', (req, res) => {
  // Extraemos los datos que se envían en formato JSON desde req.body
  const { nombre, email, edad } = req.body;

  // Validar que los datos no sean nulos o vacíos
  if (!nombre || !email || !edad) {
    return res.status(400).json({ error: 'Todos los campos (nombre, email, edad) son obligatorios' });
  }

  // Consulta SQL para insertar el estudiante
  const crearEstudiante = 'INSERT INTO estudiantes (nombre, email, edad) VALUES (?, ?, ?)';

  // Realizamos la consulta sobre la base de datos
  connection.query(crearEstudiante, [nombre, email, edad], (err, results) => {
    if (err) {
      console.error("Error al crear el estudiante:", err);
      return res.status(500).json({ error: 'Error al crear estudiante' });
    }
    res.status(200).json({ message: 'Estudiante creado con éxito' });
  });
});

// GET /estudiantes → Listar todos los estudiantes
app.get('/estudiantes', (req,res) => {

  //No recibimos ningún dato a tener en cuenta de parte del frontend

  //Creamos la consulta SQL
  const obtenerTodosEstudiantes = 'SELECT * FROM estudiantes';

  // Realizamos la consulta
  connection.query(obtenerTodosEstudiantes, (err,results) => {
    if(err){
      console.error("Error al buscar a los estudaintes ", err);
      return res.status(500).json({ error : "Error al encontrar a los estudiantes"});
    }

    
    // 4º Verificamos si encontramos al estudiante
    if (results.length === 0) {
      return res.status(404).json({ error: 'Estudiantes no encontrados' });
    }

    // 5º Enviamos los datos del estudiante si es encontrado
    res.status(200).json({
      message: 'Estudiantes encontrados con éxito',
      estudiante: results // Devolvemos el primer estudiante encontrado
    });
  });
});

// GET /estudiantes/:id → Obtener un estudiante por ID
app.get('/estudiante/:id', (req, res) => {
  // 1º Extraemos el id pasado en la URL
  const id = req.params.id;

  // 2º Creamos la consulta SQL
  const buscarEstudiante = 'SELECT * FROM estudiantes WHERE id = ?';

  // 3º Realizamos la consulta a la base de datos
  connection.query(buscarEstudiante, [id], (err, results) => {
    if (err) {
      console.error("Error al buscar el estudiante:", err);
      return res.status(500).json({ error: 'Error al buscar estudiante' });
    }

    // 4º Verificamos si encontramos al estudiante
    if (results.length === 0) {
      return res.status(404).json({ error: 'Estudiante no encontrado' });
    }

    // 5º Enviamos los datos del estudiante si es encontrado
    res.status(200).json({
      message: 'Estudiante encontrado con éxito',
      estudiante: results[0] // Devolvemos el primer estudiante encontrado
    });
  });
});

// PUT /estudiante/:id → Actualizar un estudiante
app.put('/estudiante/:id', (req, res) => {
  // 1º Extraemos los datos enviados en el cuerpo de la solicitud
  const { nombre, email, edad } = req.body;
  
  // 2º Extraemos el id pasado en la URL
  const id = req.params.id;

  // 3º Validamos que los campos necesarios hayan sido proporcionados
  if (!nombre || !email || !edad) {
    return res.status(400).json({ error: 'Todos los campos (nombre, email, edad) son obligatorios' });
  }

  // 4º Creamos la consulta SQL
  const actualizarEstudiante = 'UPDATE estudiantes SET nombre = ?, email = ?, edad = ? WHERE id = ?';

  // 5º Realizamos la consulta a la base de datos
  connection.query(actualizarEstudiante, [nombre, email, edad, id], (err, results) => {
    if (err) {
      console.log("Error al actualizar el estudiante:", err);
      return res.status(500).json({ error: 'Error al actualizar el estudiante' });
    }

    // 6º Comprobamos si se actualizó el estudiante
    if (results.affectedRows === 0) {
      return res.status(404).json({ error: 'Estudiante no encontrado' });
    }

    // 7º Enviamos un mensaje de éxito
    res.status(200).json({
      message: 'Estudiante actualizado con éxito',
    });
  });
});

// DELETE /estudiante/:id → Eliminar un estudiante
app.delete('/estudiante/:id', (req, res) => {
  // 1º Guardamos el id en una constante
  const id = req.params.id;

  // 2º Creamos la consulta SQL
  const eliminarEstudiante = 'DELETE FROM estudiantes WHERE id = ?';

  // 3º Realizamos la consulta
  connection.query(eliminarEstudiante, [id], (err, results) => {
    
    // 4º Manejamos errores en la consulta SQL
    if (err) {
      console.log("Error al eliminar el estudiante:", err);
      return res.status(500).json({ error: 'Error al eliminar el estudiante' });
    }

    // 5º Comprobamos si se eliminó algún estudiante
    if (results.affectedRows === 0) {
      return res.status(404).json({ error: 'Estudiante no encontrado' });
    }

    // 6º Enviamos un mensaje de confirmación
    res.status(200).json({
      message: 'Estudiante eliminado con éxito',
    });
  });
});


//Endpoints para la tabla cursos

// POST /cursos → Crear un curso
app.post('/cursos', (req, res) => {
  // Extraemos los datos que se envían en formato JSON desde req.body
  const { nombre, descripcion, duracion } = req.body;

  // Validar que los datos no sean nulos o vacíos
  if (!nombre || !descripcion || !duracion) {
    return res.status(400).json({ error: 'Todos los campos (nombre, descripcion, duracion) son obligatorios' });
  }

  // Consulta SQL para insertar el curso
  const crearCurso = 'INSERT INTO cursos (nombre, descripcion, duracion) VALUES (?, ?, ?)';

  // Realizamos la consulta sobre la base de datos
  connection.query(crearCurso, [nombre, descripcion, duracion], (err, results) => {
    if (err) {
      console.error("Error al crear el curso:", err);
      return res.status(500).json({ error: 'Error al crear curso' });
    }
    res.status(200).json({ message: 'Curso creado con éxito' });
  });
});

// GET /cursos → Listar todos los cursos
app.get('/cursos', (req, res) => {
  // Consulta SQL para obtener todos los cursos
  const obtenerCursos = 'SELECT * FROM cursos';

  // Realizamos la consulta
  connection.query(obtenerCursos, (err, results) => {
    if (err) {
      console.error("Error al buscar los cursos:", err);
      return res.status(500).json({ error: 'Error al encontrar los cursos' });
    }

    // Si no se encontraron cursos
    if (results.length === 0) {
      return res.status(404).json({ error: 'No se encontraron cursos' });
    }

    // Enviamos los datos de los cursos encontrados
    res.status(200).json({
      message: 'Cursos encontrados con éxito',
      cursos: results
    });
  });
});

// GET /cursos/:id → Obtener un curso por ID
app.get('/cursos/:id', (req, res) => {
  // Extraemos el id pasado en la URL
  const id = req.params.id;

  // Creamos la consulta SQL
  const buscarCurso = 'SELECT * FROM cursos WHERE id = ?';

  // Realizamos la consulta a la base de datos
  connection.query(buscarCurso, [id], (err, results) => {
    if (err) {
      console.error("Error al buscar el curso:", err);
      return res.status(500).json({ error: 'Error al buscar el curso' });
    }

    // Verificamos si encontramos el curso
    if (results.length === 0) {
      return res.status(404).json({ error: 'Curso no encontrado' });
    }

    // Enviamos los datos del curso si es encontrado
    res.status(200).json({
      message: 'Curso encontrado con éxito',
      curso: results[0] // Devolvemos el primer curso encontrado
    });
  });
});

// PUT /cursos/:id → Modificar un curso
app.put('/cursos/:id', (req, res) => {
  // Extraemos los datos enviados en el cuerpo de la solicitud
  const { nombre, descripcion, duracion } = req.body;

  // Extraemos el id pasado en la URL
  const id = req.params.id;

  // Validamos que los campos necesarios hayan sido proporcionados
  if (!nombre || !descripcion || !duracion) {
    return res.status(400).json({ error: 'Todos los campos (nombre, descripcion, duracion) son obligatorios' });
  }

  // Creamos la consulta SQL
  const actualizarCurso = 'UPDATE cursos SET nombre = ?, descripcion = ?, duracion = ? WHERE id = ?';

  // Realizamos la consulta a la base de datos
  connection.query(actualizarCurso, [nombre, descripcion, duracion, id], (err, results) => {
    if (err) {
      console.log("Error al actualizar el curso:", err);
      return res.status(500).json({ error: 'Error al actualizar el curso' });
    }

    // Comprobamos si se actualizó el curso
    if (results.affectedRows === 0) {
      return res.status(404).json({ error: 'Curso no encontrado' });
    }

    // Enviamos un mensaje de éxito
    res.status(200).json({
      message: 'Curso actualizado con éxito',
    });
  });
});

// DELETE /cursos/:id → Eliminar un curso
app.delete('/cursos/:id', (req, res) => {
  // Guardamos el id en una constante
  const id = req.params.id;

  // Creamos la consulta SQL
  const eliminarCurso = 'DELETE FROM cursos WHERE id = ?';

  // Realizamos la consulta
  connection.query(eliminarCurso, [id], (err, results) => {
    if (err) {
      console.log("Error al eliminar el curso:", err);
      return res.status(500).json({ error: 'Error al eliminar el curso' });
    }

    // Comprobamos si se eliminó algún curso
    if (results.affectedRows === 0) {
      return res.status(404).json({ error: 'Curso no encontrado' });
    }

    // Enviamos un mensaje de confirmación
    res.status(200).json({
      message: 'Curso eliminado con éxito',
    });
  });
});

//Endpoints para la tabla inscripciones

// POST /inscripciones → Inscribir un estudiante en un curso
app.post('/inscripciones', (req, res) => {
});


// GET /inscripciones → Listar todos los cursos
app.get('/inscripciones', (req, res) => {
});

// DELETE /inscripciones/:id → Eliminar una inscripción
app.delete('/inscripciones/:id', (req, res) => {
});