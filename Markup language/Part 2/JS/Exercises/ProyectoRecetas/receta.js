class Receta {
//Identificador de la receta
static contador = 0;

//Constructor
constructor ( nombre,ingredientes,descripcion,categoria){
    this.id = contador;
    this.nombre = nombre;
    this.ingredientes = ingredientes;
    this.descripcion = descripcion;
    this.categoria = categoria;
    contador++;
}

//El aporte calórico de la receta sería la suma del aporte calórico de cada ingrediente

//Desde receta debo obtener la cantidad de cada ingrediente y llamar al método calcular calorías IMPORTANTE
calcularCalorias(){
    //Tengo que acceder a las cantidades de cada ingrediente y calcular sus calorías
    //Finalmente devolver la suma total de todas las calorías de cada ingrediente, que sería igual a las calorías de la receta
    let caloriasReceta = 0;

    this.ingredientes.forEach( elemento => {
        
        //Obtenemos las calorias de cada ingrediente
        elemento.ingrediente.calcularCantidadMacros(elemento.cantidad);

        //Vamos sumando las calorías de cada ingrediente
        caloriasReceta += elemento.ingrediente.getCalorias();
    });

    return caloriasReceta;
}

}

export default Receta;