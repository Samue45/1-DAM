import Receta from "./Receta.js";
import Ingrediente from "./Ingrediente.js";

class Servicio {

    constructor(){
        listaRecetas = [];
        this.rellenarLista();
    }

    rellenarLista(){
        
        // Ejemplo 1
        let ingrediente1 = new Ingredientes('Arroz', '100g', 260, [
        {PorcentajeHidratos: 90, PorcentajeProte: 9, PorcentajeGrasas: 2}
        ]);
        let ingrediente1_2 = new Ingredientes('Pollo', '200g', 260, [
        {PorcentajeHidratos: 0, PorcentajeProte: 59, PorcentajeGrasas: 15}
        ]);

        let receta1 = new Receta(
        1,
        'Arroz con Pollo',
        [ingrediente1, ingrediente1_2],
        'Un plato delicioso de arroz con pollo, perfecto para el almuerzo.',
        'Principal'
        );

        // Ejemplo 2
        let ingrediente2 = new Ingredientes('Pollo', '150g', 330, [
        {PorcentajeHidratos: 0, PorcentajeProte: 59, PorcentajeGrasas: 15}
        ]);

        let receta2 = new Receta(
        2,
        'Pollo Asado',
        [ingrediente2],
        'Pollo asado con un toque de hierbas y especias.',
        'Principal'
        );

        // Ejemplo 3
        let ingrediente3_1 = new Ingredientes('Lechuga', '300g', 18, [
        {PorcentajeHidratos: 3.92, PorcentajeProte: 0.88, PorcentajeGrasas: 0}
        ]);
        let ingrediente3_2 = new Ingredientes('Tomate', '80g', 18, [
        {PorcentajeHidratos: 3, PorcentajeProte: 0.9, PorcentajeGrasas: 0.14}
        ]);
        let ingrediente3_3 = new Ingredientes('Cebolla', '80g', 18, [
        {PorcentajeHidratos: 10, PorcentajeProte: 0.9, PorcentajeGrasas: 0}
        ]);

        let receta3 = new Receta(
        3,
        'Ensalada de Tomate',
        [ingrediente3_1, ingrediente3_2,ingrediente3_3],
        'Una ensalada fresca de tomate, perfecta como acompañamiento.',
        'Acompañamiento'
        );

        // Ejemplo 4
        let ingrediente4 = new Ingredientes('Lechuga', '50g', 15, [
        {PorcentajeHidratos:  3.92, PorcentajeProte: 0.88, PorcentajeGrasas: 0}
        ]);

        let receta4 = new Receta(
        4,
        'Ensalada Verde',
        [ingrediente4],
        'Ensalada de lechuga con vinagreta, ligera y saludable.',
        'Acompañamiento'
        );

        // Ejemplo 5
        let ingrediente5_1 = new Ingredientes('Aguacate', '80g', 120, [
        {PorcentajeHidratos: 50, PorcentajeProte: 5, PorcentajeGrasas: 45}
        ]);
        let ingrediente5_2 = new Ingredientes('Pan', '100g', 120, [
        {PorcentajeHidratos: 50, PorcentajeProte: 8, PorcentajeGrasas: 3}
        ]);

        let receta5 = new Receta(
        5,
        'Tostada de Aguacate',
        [ingrediente5_1, ingrediente5_2 ],
        'Tostada de pan integral con aguacate fresco, ideal para el desayuno.',
        'Desayuno'
        );
        this.listaRecetas = [receta1,receta2,receta3,receta4,receta5]
    }

    //Método GET para ver todas las recetas
    obtenerListaRecetas(){
        this.listaRecetas.forEach(receta => {
            console.log("Nombre receta = " + receta.nombre + " Ingredietes = " + receta.ingredientes );
        })
    }

    //Método GET para buscar una receta por su id
    obtenerRecetaId(recetaId){
        this.listaRecetas.forEach(receta => {

            if(receta.id === recetaId) console.log("Nombre receta = " + receta.nombre + " Ingredietes = " + receta.ingredientes );
        })

    }

    //Método DELETE para eliminar una receta por su id
    obtenerRecetaId(recetaId){
        this.listaRecetas.forEach(receta => {
            if(receta.id === recetaId) {
                console.log("Nombre receta = " + receta.nombre + " Ingredietes = " + receta.ingredientes );
            }else {
                console.log("Lo sentimos :(, pero esa receta no existe");
            }
        })

    
    }

    //Método UPDATE para actualizar una receta 
    actualizarReceta(id, nombre,ingredientes,descripcion,categoria){
        
        this.listaRecetas.forEach(receta => {
            if(receta.id === id) {
                //Modificamos los valores viejos de la receta por los nuevos
                receta.nombre = nombre;
                receta.ingredientes = ingredientes;
                receta.descripcion = descripcion;
                receta.categoria = categoria

                //Mensaje de éxito
                console.log("Receta actualizada con éxito :)");
            }else {
                console.log("Lo sentimos :(, pero esa receta no existe");
            }
        })
    }

    //Método CREATE para crear una receta 
    crearReceta(id, nombre,ingredientes,descripcion,categoria){
        
        this.listaRecetas.forEach(receta => {
            if(receta.id === id) {
                console.log("ERROR, ya existe una receta con el mismo id :/");
            }else {
                let nuevaReceta = new Receta(
                    id,
                    nombre,
                    ingredientes,
                    descripcion,
                    categoria
                    );
                    this.listaRecetas.push(nuevaReceta);

                    //Mensaje de éxito
                console.log("Receta creada con éxito :)");
            }
        })
    }
}

export default Servicio;