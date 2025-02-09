class Receta {
//Constructor
constructor (nombre,ingredientes,descripcion,categoria){
    this.nombre = nombre;
    this.ingredientes = ingredientes;
    this.descripcion = descripcion;
    this.categoria = categoria;
}

//El aporte calórico de la receta sería la suma del aporte calórico de cada ingrediente
calcularCalorias(){

    let caloriasTotales = 0;
    //Como ingredientes es un array, podemos recorrerolo y obtener las calorias de cada ingrediente
    // Para luego sumarlos todos y saber el aporte calórico de la receta
    this.ingredientes.array.forEach(ingredientes => {
        caloriasTotales += ingredientes.getCalorias;
    });

    return caloriasTotales;
}

}

export default Receta;