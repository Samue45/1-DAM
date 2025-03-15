// Importamos la conexión de la base de datos para poder reazlizar las consultas SQL con la base de datos
const db = require('../config/db.js');

// Creamos una constante con el mismo nombre de la entidad sobre la que va a realizar dichas consultas SQL
// Esta constante contiene un objet literal , donde cada key va a representar cada endpoint y va a contener
// como valor una función anónima que recibe los datos del controlador para llevar a cabo la consulta SQL e 
// informar sobre cómo ha ido dicha consulta al controlador
const Estudiantes = {
    getAll : (callback) => {
        db.get('SELECT * FROM Estudiantes',callback);
    },
    getId : (id,callback) => {
        db.get('SELECT * FROM Estudiantes WHERE id = ?',id,callback);
    },
    create : (data,callback) => {
        db.post('INSERT INTO Estudiantes SET ?', data, callback)
    },
    update : (id,data,callback) => {
        db.update('UPDATE Estudiantes SET ? WHERE id = ?',[data, id],callback);
    },
    delete : (id, callback) => {
        db.delete('DELETE FROM Estudiantes WHERE id = ?',[id],callback);
    }
};

// Exportamos la constante Estudiante para que el controlador puede importarla y hacer uso de ella
module.exports = Estudiantes;
