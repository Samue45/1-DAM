const express = require('express');
const router = express.Router();
const inscripcionController = require('../controllers/inscripcionController');

// Definir rutas para Inscripciones
router.get('/', inscripcionController.getAll); // Obtener todas las inscripciones
router.get('/:id', inscripcionController.getById); // Obtener una inscripción por ID
router.post('/', inscripcionController.create); // Crear una nueva inscripción
router.delete('/:id', inscripcionController.delete); // Eliminar inscripción

module.exports = router;
