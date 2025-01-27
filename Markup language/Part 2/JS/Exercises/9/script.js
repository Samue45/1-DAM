let table;
let arrayCoches = [];


//1º Crear función main y añadir un manejador de evento al objeto window
window.addEventListener('load',main);

function main(){

    //2º Rellenar el array con objetos literales en cuanto cargue la página
    arrayCoches = [
        {
            matricula: "1234ABC",
            marca: "Toyota",
            modelo: "Corolla",
            fechaCompra: "2020-05-15"
        },
        {
            matricula: "5678DEF",
            marca: "Ford",
            modelo: "Focus",
            fechaCompra:"2019-08-22"
        },
        {
            matricula: "9101GHI",
            marca: "BMW",
            modelo: "Serie 3",
            fechaCompra:"2021-03-30"
        },
        {
            matricula: "1122JKL",
            marca: "Audi",
            modelo: "A4",
            fechaCompra: "2022-11-11"
        }
    ];

    //3º Mostramos la tabla con todos los datos
    mostrarTabla();

    //4º Eliminamos el coche al pulsar  el valor matrícula
    document.querySelector('table').addEventListener('click', eliminarCoche);
}

function crearTabla(){
    
    //1º Creamos la tabla
    table = document.createElement('table');

    //2º Creamos su cabecera
    crearCabecera();

    //3º Creamos el resto de filas y columnas
    crearFilas();
}
function crearCabecera(){

    //Creamos un array con todos los títulos de cada columna
    let arrayTitulos = ["Matrícula","Marca","Modelo","Fecha de Compra"];

    //Creamos la 1º fila de la tabla
    let trHead = document.createElement('tr');

    //Por cada elemento del array se crea una columna, es decir, un th y se añade a la 1º fila
    arrayTitulos.forEach((titulo => {

        let thHead = document.createElement('th');
        thHead.textContent = titulo;
        trHead.appendChild(thHead);

    }))

    //Finalmente añadimos la cabecera a la tabla
    table.appendChild(trHead);


}
function crearFilas(){

     //1º Primero obtenemos el coche
    arrayCoches.forEach((coche) => {
        // 2º Por cada coche se crea una fila
        let trBody = document.createElement('tr');

        //3º Creamos las columnas de la fila
        crearColumnas(coche,trBody);

        //4º Añadimos la fila a la tabla
        table.appendChild(trBody);
    });

    
}
function crearColumnas(coche, trBody){

     //1º Accedemos a las propiedades de dicho coche
     Object.keys(coche).forEach((propiedad => {
        // 2º Creamos una columna para cada propiedad 
        let tdBody = document.createElement('td');

        // 3º Le damos una clase a la columna matrícula para luego poder eliminarla
        if(propiedad == "matricula"){
            tdBody.classList.add("nieto");
        }

        // 4º Le damos el valor guardado en el array
        tdBody.textContent = coche[propiedad];
        //3º Añadimos cada columna a la fila
        trBody.appendChild(tdBody);
     }))

}
function mostrarTabla(){

    // Creamos la tabla con todos los datos del arrayCoches
    crearTabla();

    // Finalmente, la añadimos al DOM
    document.body.appendChild(table);
}

function eliminarCoche(e){
    // Nos aseguramos que el evento ha ocurrido sobre la columna Matrícula
    if(e.target && e.target.classList.contains("nieto")){

      // Eliminamos la fila del DOM
      // La propiedad target nos devuelve el objeto sobre el que ha tenido lugar el evento, es decir, el td
      // Pero al usar el método closest le estamos pidiendo la (tr)fila y no la (td)columna. Sin embargo, funciona porque busca el familiar 
      // más cercano al td(Columna) donde ha ocurrido el evento
      e.target.closest('tr').remove();// Usamos closest para obtener el tr que contiene al target
      e.stopPropagation(); // No se propaga hacia arriba una vez llega al origen
        
      // Eliminar de la lista de coches
      // Al usar filter creamos un nuevo array pero no contiene el coche eliminado
      // Finalmente, cambiamos el contenido de la lista de coches vieja por la nueva
      arrayCoches = arrayCoches.filter((coche) => coche.matricula !== e.target.textContent);
    }
}