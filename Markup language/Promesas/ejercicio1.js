// 🍕 Analogía con pizzería para entender el métedo fetch

// Imagina que tienes hambre y decides pedir una pizza. Este proceso es exactamente igual a cómo funciona fetch() cuando hacemos una solicitud HTTP.

// Empleando then y catch

// 🔹 Paso 1: Hacer el pedido (Llamar a fetch())
function pedirPizza() {
    return fetch("https://api.pizzeria.com/pedido"); // 📞 Llamar a la pizzería y pides una pizza. = Enviar solicitud(paquete JSON) al backend
    // El método fetch envía una solicitud y devuelve un objeto Promesa
    
    // Ejemplo de lo que hace el método fetch de manera interna
    function miFetch(url) {
        return new Promise((resolve, reject) => {
            const xhr = new XMLHttpRequest(); // Crear objeto de solicitud HTTP
            xhr.open("GET", url, true); // Configurar la solicitud
    
            xhr.onload = () => { // Cuando la respuesta llega...
                if (xhr.status >= 200 && xhr.status < 300) {
                    resolve(new Response(xhr.responseText, { status: xhr.status, statusText: xhr.statusText }));
                } else {
                    reject(new Error(`Error: ${xhr.status}`));
                }
            };
    
            xhr.onerror = () => reject(new Error("Error de red")); // Si hay fallo en la conexión
            xhr.send(); // Enviar solicitud
        });
    }
}

// 🔹 Paso 2: La pizzería cocina la pizza (El servidor procesa la solicitud)

// 🔹 Paso 3: El repartidor trae la pizza (Recibes el Response)
pedirPizza()
    .then(response => {

        //🔴 Caso 1: La pizzería está cerrada (Error 404)
        if (!response.ok) {
            throw new Error("La pizzería está cerrada.");
        }

        console.log("📦 Caja recibida:", response); // 🚨 Ojo: Aún no podemos comer la pizza, porque sigue dentro de la caja (el Response todavía no es JSON).
        
        // 🔹 Paso 4: Abrimos la caja de la pizza (response.json())
        return response.json(); // 📦 Ahora abrimos la caja (Convertimos la respuesta a JSON)
        //🚨 Importante: .json() toma tiempo en ejecutarse, por eso devuelve otra promesa y necesitamos otro .then().
    })
    // 🔹 Paso 5: Te comes la pizza (Usamos los datos en el frontend)
    .then(pizza => console.log("🍕 Pizza lista para comer:", pizza)) // 🍕 Comemos la pizza

    // 🔴 Caso 2: Se equivocaron en tu pedido (Error en el JSON)
    .catch(error => console.error("🚨 Error:", error)); // Manejamos el error


// Empleando try y catch
async function pedirPizzaAsync() {
    try {
        // 🔹 Paso 1: Hacer el pedido (Llamar a fetch())
        const response = await fetch("https://api.pizzeria.com/pedido"); // 📞 Llamamos a la pizzería
        
        //🔴 Caso 1: La pizzería está cerrada (Error 404)
        if (!response.ok) {
            throw new Error("La pizzería está cerrada.");
        }
        // 🔹 Paso 2: La pizzería cocina la pizza (El servidor procesa la solicitud)
        // 🔹 Paso 3: El repartidor trae la pizza (Recibes el Response)

        // 🔹 Paso 4: Abrimos la caja de la pizza (response.json())
         //🚨 Importante: .json() toma tiempo en ejecutarse, por eso devuelve otra promesa y necesitamos otro .then().
        const pizza = await response.json(); // 📦 Abrimos la caja

         // 🔹 Paso 5: Te comes la pizza (Usamos los datos en el frontend)
        console.log("🍕 Pizza lista para comer:", pizza); // 🍕 Comemos la pizza

    } catch (error) {
        // 🔴 Caso 2: Se equivocaron en tu pedido (Error en el JSON)
        console.error("🚨 Error en la pizza:", error);
    }
}

pedirPizzaAsync();
