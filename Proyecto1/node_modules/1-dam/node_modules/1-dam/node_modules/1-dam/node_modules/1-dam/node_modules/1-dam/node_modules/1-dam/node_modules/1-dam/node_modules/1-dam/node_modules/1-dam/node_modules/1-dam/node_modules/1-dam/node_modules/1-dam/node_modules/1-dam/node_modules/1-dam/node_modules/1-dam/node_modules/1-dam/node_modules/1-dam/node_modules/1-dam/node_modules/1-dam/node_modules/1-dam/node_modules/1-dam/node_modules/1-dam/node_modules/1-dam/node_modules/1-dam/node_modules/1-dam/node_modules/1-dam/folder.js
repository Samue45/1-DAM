// Función que se ejecuta cuando se envía el formulario
function enviarFormulario(event) {
    event.preventDefault(); // Prevenir el comportamiento predeterminado del formulario (recarga de la página)

    // Recoger los datos del formulario
    const nombre = document.getElementById('nombre').value;
    const email = document.getElementById('email').value;
    const edad = document.getElementById('edad').value;

    // Validar que los campos no estén vacíos
    if (!nombre || !email || !edad) {
      alert('Todos los campos (nombre, email, edad) son obligatorios');
      return;
    }

    // Crear el objeto con los datos del estudiante
    const estudiante = {
      nombre: nombre,
      email: email,
      edad: edad
    };

    // Realizar la solicitud POST usando fetch
    fetch('http://localhost:3000/estudiante', {  // Cambia la URL por la de tu servidor
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'  // Especificamos que estamos enviando JSON
      },
      body: JSON.stringify(estudiante)  // Convertimos el objeto en JSON
    })
    .then(response => response.json())  // Convertir la respuesta a JSON
    .then(data => {
      console.log(data); // Mostrar los datos de la respuesta
      alert(data.message || 'Estudiante creado con éxito');
    })
    .catch(error => {
      console.error('Error:', error);
      alert('Hubo un error al crear el estudiante.');
    });
}