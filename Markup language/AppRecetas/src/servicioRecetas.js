import { Ingrediente } from './ingrediente.js';
import { Receta } from './receta.js';

export class ServicioRecetas {
    constructor() {
        this.recetas = this.inicializarRecetas();
    }

    // Inicializa recetas de ejemplo
    inicializarRecetas() {
        const arroz = new Ingrediente("Arroz", 130);
        const pollo = new Ingrediente("Pollo", 165);
        const tomate = new Ingrediente("Tomate", 18);
        const aceite = new Ingrediente("Aceite de oliva", 884);
        const cebolla = new Ingrediente("Cebolla", 40);

        return [
            new Receta("Arroz con pollo", "Un delicioso arroz con pollo.", "Principal", [
                { ingrediente: arroz, cantidad: 200 },
                { ingrediente: pollo, cantidad: 150 },
                { ingrediente: cebolla, cantidad: 50 },
                { ingrediente: aceite, cantidad: 10 }
            ]),
            new Receta("Ensalada de tomate", "Fresca y saludable.", "Entrante", [
                { ingrediente: tomate, cantidad: 150 },
                { ingrediente: cebolla, cantidad: 50 },
                { ingrediente: aceite, cantidad: 15 }
            ]),
            new Receta("Pollo al horno", "Pollo jugoso al horno con aceite de oliva.", "Principal", [
                { ingrediente: pollo, cantidad: 200 },
                { ingrediente: aceite, cantidad: 20 }
            ]),
            new Receta("Arroz blanco", "Arroz hervido sin más.", "Acompañamiento", [
                { ingrediente: arroz, cantidad: 250 }
            ]),
            new Receta("Sofrito", "Base para muchas recetas.", "Salsa", [
                { ingrediente: tomate, cantidad: 200 },
                { ingrediente: cebolla, cantidad: 100 },
                { ingrediente: aceite, cantidad: 30 }
            ])
        ];
    }

    // CRUD API

    obtenerRecetas() {
        return this.recetas;
    }

    obtenerRecetaPorId(id) {
        return this.recetas.find(receta => receta.id === id);
    }

    agregarReceta(nombre, descripcion, categoria, ingredientes) {
        const nuevaReceta = new Receta(nombre, descripcion, categoria, ingredientes);
        this.recetas.push(nuevaReceta);
        return nuevaReceta;
    }

    actualizarReceta(id, nuevosDatos) {
        const index = this.recetas.findIndex(receta => receta.id === id);
        if (index !== -1) {
            this.recetas[index] = { ...this.recetas[index], ...nuevosDatos };
            return this.recetas[index];
        }
        return null;
    }

    eliminarReceta(id) {
        const recetasIniciales = this.recetas.length;
        this.recetas = this.recetas.filter(receta => receta.id !== id);
        return this.recetas.length < recetasIniciales;
    }
}
