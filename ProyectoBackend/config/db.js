const mysql = require('mysql');
require('dotenv').config(); // Cargar variables de entorno


//Creamos la conexión con la base de datos
const connection = mysql.createConnection({
    host: process.env.DB_HOST,
    user: process.env.DB_USER,
    password: process.env.DB_PASSWORD,
    database: process.env.DB_NAME
});

connection.connect(err => {
    if(err){
        console.error("Error al conectarse a la base de datos");
        return;
    }

    console.log("Conexión exitosa");
})

// Exportamos la constante que almacena la instancia que establece la conxeión con la base de datos
module.exports = connection ;