const express = require('express');
const connectDB = require('./config/db'); // Conexión a MySQL
const cors = require('cors');
require('dotenv').config(); // 📌 Cargar variables de entorno correctamente
const routes = require('./routes'); // Importar rutas

// Crear la aplicación Express
const app = express();

// Middleware para permitir JSON en las peticiones
app.use(express.json());

// Habilitar CORS
app.use(cors());

// Conectar a la base de datos
connectDB();

// Cargar las rutas
app.use('/api', routes); // 📌 Prefijo "/api" para organizar las rutas

// Iniciar el servidor en el puerto definido en .env o en 3000 por defecto
const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
    console.log(`✅ Servidor escuchando en el puerto ${PORT}`);
});