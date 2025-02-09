//Importamos las clases
import Receta from './receta.js';
import Ingredientes from './ingredientes.js';

// Debemos crear un instancia de cada clase
// Ejemplo 1: Crear ingredientes y receta
let ingrediente1 = new Ingredientes('Arroz', '200g', 260, [
    {PorcentajeHidratos: 90, PorcentajeProte: 9, PorcentajeGrasas: 2}
]);

let receta1 = new Receta(
    'Arroz con Pollo',
    [ingrediente1],
    'Un plato delicioso de arroz con pollo, perfecto para el almuerzo.',
    'Principal'
);

// Ejemplo 2: Crear ingredientes y receta
let ingrediente2 = new Ingredientes('Pollo', '150g', 330, [
    {PorcentajeHidratos: 0, PorcentajeProte: 100, PorcentajeGrasas: 0}
]);

let receta2 = new Receta(
    'Pollo Asado',
    [ingrediente2],
    'Pollo asado con un toque de hierbas y especias.',
    'Principal'
);

// Ejemplo 3: Crear ingredientes y receta
let ingrediente3 = new Ingredientes('Tomate', '100g', 18, [
    {PorcentajeHidratos: 95, PorcentajeProte: 5, PorcentajeGrasas: 0}
]);

let receta3 = new Receta(
    'Ensalada de Tomate',
    [ingrediente3],
    'Una ensalada fresca de tomate, perfecta como acompañamiento.',
    'Acompañamiento'
);

// Ejemplo 4: Crear ingredientes y receta
let ingrediente4 = new Ingredientes('Lechuga', '50g', 15, [
    {PorcentajeHidratos: 70, PorcentajeProte: 10, PorcentajeGrasas: 20}
]);

let receta4 = new Receta(
    'Ensalada Verde',
    [ingrediente4],
    'Ensalada de lechuga con vinagreta, ligera y saludable.',
    'Acompañamiento'
);

// Ejemplo 5: Crear ingredientes y receta
let ingrediente5 = new Ingredientes('Aguacate', '80g', 120, [
    {PorcentajeHidratos: 50, PorcentajeProte: 5, PorcentajeGrasas: 45}
]);

let receta5 = new Receta(
    'Tostada de Aguacate',
    [ingrediente5],
    'Tostada de pan integral con aguacate fresco, ideal para el desayuno.',
    'Desayuno'
);

// Imprimir en consola las recetas y sus ingredientes
console.log(receta1 + "Calorías de la receta = " + receta1.calcularCalorias());
console.log(receta2 + "Calorías de la receta = " + receta2.calcularCalorias());
console.log(receta3 + "Calorías de la receta = " + receta3.calcularCalorias());
console.log(receta4 + "Calorías de la receta = " + receta4.calcularCalorias());
console.log(receta5 + "Calorías de la receta = " + receta5.calcularCalorias());