class Receta {
//Constructor
constructor (id, nombre,{ingredientes,cantidad},descripcion,categoria){
    this.id = id
    this.nombre = nombre;
    this.ingredientes = ingredientes,cantidad;
    this.descripcion = descripcion;
    this.categoria = categoria;
}

//El aporte calórico de la receta sería la suma del aporte calórico de cada ingrediente
calcularCalorias(){

    //Como ingredientes es un array, podemos recorrerolo y obtener las calorias de cada ingrediente
    // Para luego sumarlos todos y saber el aporte calórico de la receta
    let caloriasTotales = 0;

    //Debo obtener cada ingrediente del objeto literal
    this.ingredientes.forEach(ingrediente => {
        caloriasTotales += ingrediente.calorias;
        Object.keys(ingrediente).forEach(elemento => {
                //Debo 
        })
    });
    return caloriasTotales;
    
}

//Desde receta debo obtener la cantidad de cada ingrediente y llamar al método calcular calorías IMPORTANTE
obtenerCantidad(){
    let cantidadIngrediente = 0;

    this.ingredientes.forEach(ingrediente => {
        caloriasTotales += ingrediente.calorias;
    });
    return caloriasTotales;

}

}

export default Receta;