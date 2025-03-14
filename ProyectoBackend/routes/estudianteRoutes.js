const express = require('express');
const router = express.Router();
const estudianteController = require('../controllers/estudianteController');

// Definir rutas para Estudiantes
router.get('/', estudianteController.getAll); // Obtener todos los estudiantes
router.get('/:id', estudianteController.getById); // Obtener un estudiante por ID
router.post('/', estudianteController.create); // Crear un nuevo estudiante
router.put('/:id', estudianteController.update); // Actualizar estudiante
router.delete('/:id', estudianteController.delete); // Eliminar estudiante

module.exports = router;
