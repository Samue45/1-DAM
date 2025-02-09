//Importamos las clases
import Receta from './receta.js';
import Ingredientes from './ingredientes.js';

// Debemos crear un instancia de cada clase
// Ejemplo 1
let ingrediente1 = new Ingredientes('Arroz', '100g', 260, [
    {PorcentajeHidratos: 90, PorcentajeProte: 9, PorcentajeGrasas: 2}
]);
let ingrediente1_2 = new Ingredientes('Pollo', '200g', 260, [
    {PorcentajeHidratos: 0, PorcentajeProte: 59, PorcentajeGrasas: 15}
]);

let receta1 = new Receta(
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
    'Tostada de Aguacate',
    [ingrediente5_1, ingrediente5_2 ],
    'Tostada de pan integral con aguacate fresco, ideal para el desayuno.',
    'Desayuno'
);

// Imprimir en consola las recetas y sus ingredientes
console.log(receta1.nombre + " => Calorías de la receta = " + receta1.calcularCalorias());
console.log(receta2.nombre + " => Calorías de la receta = " + receta2.calcularCalorias());
console.log(receta3.nombre + " => Calorías de la receta = " + receta3.calcularCalorias());
console.log(receta4.nombre + " => Calorías de la receta = " + receta4.calcularCalorias());
console.log(receta5.nombre + " => Calorías de la receta = " + receta5.calcularCalorias());