import Receta from "./receta.js";
import Ingrediente from "./Ingrediente.js";

//Los mensajes por consola no deberían estar en el servidor a no ser que sean informativos sobre si la operación falla o es exitosa
class Servicio {

    //Sirve para crear propiedades privadas
    #listaRecetas

    constructor(){
        this.listaRecetas = [];
        this.rellenarLista();
    }

    //Simulación del modelo(BASE DE DATOS)
    rellenarLista(){
        
       //Ejemplo 1
       // Ingredientes
        const pollo = new Ingredientes('Pollo', 0, { porcentajeHidratos: 0, porcentajeProte: 80, porcentajeGrasa: 20 });
        const lechuga = new Ingredientes('Lechuga', 0, { porcentajeHidratos: 5, porcentajeProte: 1, porcentajeGrasa: 0 });
        const tomate = new Ingredientes('Tomate', 0, { porcentajeHidratos: 5, porcentajeProte: 1, porcentajeGrasa: 0 });
        const aceiteOliva = new Ingredientes('Aceite de oliva', 0, { porcentajeHidratos: 0, porcentajeProte: 0, porcentajeGrasa: 100 });

        // Crear receta
        const receta1 = new Receta('Ensalada de Pollo', [
        { ingrediente: pollo, cantidad: 200 },
        { ingrediente: lechuga, cantidad: 50 },
        { ingrediente: tomate, cantidad: 50 },
        { ingrediente: aceiteOliva, cantidad: 15 }
        ], 'Una ensalada ligera y saludable', 'Plato principal');

        //Ejemplo 2
       // Ingredientes
        const leche = new Ingredientes('Leche', 0, { porcentajeHidratos: 5, porcentajeProte: 3, porcentajeGrasa: 2 });
        const proteina = new Ingredientes('Proteína en polvo', 0, { porcentajeHidratos: 5, porcentajeProte: 80, porcentajeGrasa: 5 });
        const plátano = new Ingredientes('Plátano', 0, { porcentajeHidratos: 23, porcentajeProte: 1, porcentajeGrasa: 0 });
        const avena = new Ingredientes('Avena', 0, { porcentajeHidratos: 66, porcentajeProte: 16, porcentajeGrasa: 7 });

        // Crear receta
        const receta2 = new Receta('Batido de Proteínas', [
        { ingrediente: leche, cantidad: 250 },
        { ingrediente: proteina, cantidad: 30 },
        { ingrediente: plátano, cantidad: 100 },
        { ingrediente: avena, cantidad: 50 }
        ], 'Un batido para después de entrenar', 'Desayuno');
       

        //Ejemplo 3
        // Ingredientes
        const huevo = new Ingredientes('Huevo', 0, { porcentajeHidratos: 1, porcentajeProte: 12, porcentajeGrasa: 9 });
        const espinaca = new Ingredientes('Espinaca', 0, { porcentajeHidratos: 3, porcentajeProte: 2, porcentajeGrasa: 0 });
        const aceiteCoco = new Ingredientes('Aceite de coco', 0, { porcentajeHidratos: 0, porcentajeProte: 0, porcentajeGrasa: 100 });

        // Crear receta
        const receta3 = new Receta('Tortilla de Espinacas', [
        { ingrediente: huevo, cantidad: 3 },
        { ingrediente: espinaca, cantidad: 100 },
        { ingrediente: aceiteCoco, cantidad: 10 }
        ], 'Tortilla saludable rica en proteínas', 'Almuerzo');


        this.listaRecetas = [receta1,receta2,receta3]
    }

    //Método GET para ver todas las recetas
    obtenerListaRecetas(){
        this.listaRecetas.forEach(receta => {
            console.log(`Nombre receta = ${receta.nombre}, Ingredientes = ${receta.ingredientes.map(i => i.ingrediente.nombre).join(", ")}`);
        })
    }

    //Método GET para buscar una receta por su id
    obtenerRecetaId(recetaId){
        this.listaRecetas.forEach(receta => {

            if(receta.id === recetaId) console.log("Nombre receta = " + receta.nombre + " Ingredietes = " + receta.ingredientes );
        })

    }

    //Método DELETE para eliminar una receta por su id
    deleteRecetaId(recetaId){
        this.listaRecetas.forEach(receta => {
            if(receta.id === recetaId) {
                //Se actuliza el array y solo se guardan aquellos cuyo id no se quiere eliminar
                this.listaRecetas = this.listaRecetas.filter(receta => receta.id !== recetaId)
            }else {
                console.log("Lo sentimos :(, pero esa receta no existe");
            }
        })

    
    }

    //Método DELETE para eliminar todas las recetas
    deleteAllRecetas(){
        this.listaRecetas.splice(0, this.listaRecetas.length);
        console.log("Todas las recetas han sido eliminadas.");
    }

    //Método UPDATE para actualizar una receta 
    actualizarReceta(recetaNueva){
        /*
        index = this.listaRecetas.findIndex( r => r.id == recetaNueva.id)
        */

        
        this.listaRecetas.forEach(recetaVieja => {
            if(recetaVieja.id === recetaNueva.id) {
                //Modificamos los valores viejos de la receta por los nuevos
                recetaVieja.nombre = recetaNueva.nombre;
                recetaVieja.ingredientes = recetaNueva.ingredientes;
                recetaVieja.descripcion = recetaNueva.descripcion;
                recetaVieja.categoria = recetaNueva.categoria

                //Mensaje de éxito
                console.log("Receta actualizada con éxito :)");
            }else {
                console.log("Lo sentimos :(, pero esa receta no existe");
            }
        })
    }

    //Método CREATE para crear una receta 
    crearReceta(recetaNueva){
        
        this.listaRecetas.forEach(receta => {
            if(receta.id === id) {
                console.log("ERROR, ya existe una receta con el mismo id :/");
            }else {
                let nuevaReceta = new Receta(
                    recetaNueva.id,
                    recetaNueva.nombre,
                    recetaNueva.ingredientes,
                    recetaNueva.descripcion,
                    recetaNueva.categoria
                    );
                    this.listaRecetas.push(nuevaReceta);

                    //Mensaje de éxito
                console.log("Receta creada con éxito :)");
            }
        })
    }
}

export default Servicio;