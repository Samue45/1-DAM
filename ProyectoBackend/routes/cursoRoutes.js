const express = require('express');
const router = express.Router();
const cursoController = require('../controllers/cursoController');

// Definir rutas para Cursos
router.get('/', cursoController.getAll); // Obtener todos los cursos
router.get('/:id', cursoController.getById); // Obtener un curso por ID
router.post('/', cursoController.create); // Crear un nuevo curso
router.put('/:id', cursoController.update); // Actualizar curso
router.delete('/:id', cursoController.delete); // Eliminar curso

module.exports = router;
