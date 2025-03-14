const express = require('express');
const router = express.Router();

const estudianteRoutes = require('./estudianteRoutes');
const cursoRoutes = require('./cursoRoutes');
const inscripcionRoutes = require('./inscripcionRoutes');

router.use('/estudiantes', estudianteRoutes); // Rutas de Estudiantes
router.use('/cursos', cursoRoutes); // Rutas de Cursos
router.use('/inscripciones', inscripcionRoutes); // Rutas de Inscripciones

module.exports = router;
