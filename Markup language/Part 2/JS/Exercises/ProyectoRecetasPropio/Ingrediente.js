class Ingredientes {

    
    constructor(nombre, calorias, porcentajeMacros){
        this.nombre = nombre;
        this.calorias = calorias;
        this.porcentajeMacros = porcentajeMacros // Es un array de objetos literales => {PorcentajeHidratos : 0,PorcenajeProte : 0,PorcenajeGrasas : 0 }
    }

//Métodos

//Paso la cantidad de cada ingrediente
calcularCantidadMacros(cantidad){
    // Cada ingrediente tiene un %Hidratos, %Proteína y %Grasa
    // El 100% = cantidad del ingrediente
    // Sabiendo el porcentaje de cada macro podemos calcular cuantos gramos de cada macro tiene
    // Para luego conocer el aporte calórico de cada macro y finalmente saber las calorís del ingrediente en base a la cantidad que se emplee de éste

    let gramosHidratos, gramosGrasa, gramosProte = 0;

    //1º Calculamos los gramos de cada macro
    gramosHidratos = (this.porcentajeMacros.porcentajeHidratos * cantidad) / 100;
    gramosProte = (this.porcentajeMacros.porcentajeProte * cantidad) / 100;
    gramosGrasa = (this.porcentajeMacros.porcentajeGrasa  * cantidad) / 100;

    // 2º Calculamos las calorías de cada macro
    this.calorias = calcularCaloriasIngredientes(gramosHidratos,gramosProte,gramosGrasa);
}

calcularCaloriasIngredientes(gramosHidratos, gramosProte, gramosGrasa){

    //1º Cada gramo de un macro aporta unas calorías
    // 1g de carbos = 4 cal
    // 1g de prote = 4 cal
    // 1g de grasa = 9 cal

    // Sumamos  todas la calorías aportadas por cada macro y asignamos el valor a las calorías del ingrediente 
    this.calorias = (gramosHidratos * 4) + (gramosProte * 4) + (gramosGrasa * 9)
}


getCalorias(){
    return this.calorias
}

}

export default Ingredientes;