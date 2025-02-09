class Receta {
//Constructor
constructor (nombre,ingredientes,descripcion,categoria){
    this.nombre = nombre;
    this.ingredientes = ingredientes || [];
    this.descripcion = descripcion;
    this.categoria = categoria;
}

//El aporte calórico de la receta sería la suma del aporte calórico de cada ingrediente
calcularCalorias(){

    /*
    let caloriasTotales = 0;
    //Como ingredientes es un array, podemos recorrerolo y obtener las calorias de cada ingrediente
    // Para luego sumarlos todos y saber el aporte calórico de la receta
    this.ingredientes.array.forEach(ingrediente => {
        caloriasTotales += ingrediente.getCalorias();
    });

    return caloriasTotales;
*/
    console.log(this.ingredientes);  // Verifica qué contiene 'ingredientes'
    if (this.ingredientes && Array.isArray(this.ingredientes)) {
        let caloriasTotales = 0;
        this.ingredientes.forEach(ingrediente => {
            caloriasTotales += ingrediente.calorias;
        });
        return caloriasTotales;
    } else {
        console.error("Los ingredientes no son un arreglo válido.");
        return 0;
    }
}

}

export default Receta;