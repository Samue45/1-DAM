const Estudiante = require('../models/Estudiante'); // Importamos el "Repositorio" (DAO)

exports.getAll = (req, res) => {
    Estudiante.getAll((err, results) => {
        if (err) return res.status(500).json({ error: err.message });
        res.json(results);
    });
};

exports.create = (req, res) => {
    const nuevoEstudiante = req.body; // Capturamos los datos enviados por el frontend

    Estudiante.create(nuevoEstudiante, (err, result) => {
        if (err) return res.status(500).json({ error: err.message });
        res.status(201).json({ id: result.insertId, ...nuevoEstudiante });
    });
};
