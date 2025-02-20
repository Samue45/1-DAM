export class Ingrediente {
    static idCounter = 1;

    constructor(nombre, caloriasPor100g) {
        this.id = Ingrediente.idCounter++;
        this.nombre = nombre;
        this.caloriasPor100g = caloriasPor100g;
    }
}
