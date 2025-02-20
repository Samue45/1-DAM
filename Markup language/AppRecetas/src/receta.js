import { Ingrediente } from './ingrediente.js';

export class Receta {
    static idCounter = 1;

    constructor(nombre, descripcion, categoria, ingredientes) {
        this.id = Receta.idCounter++;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.ingredientes = ingredientes;
    }

    calcularCalorias() {
        return this.ingredientes.reduce((total, item) => {
            return total + (item.ingrediente.caloriasPor100g * item.cantidad) / 100;
        }, 0);
    }
}
