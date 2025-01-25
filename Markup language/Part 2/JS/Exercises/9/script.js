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

    //4º Eliminamos el coche al pulsar la el valor matrícula
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
        // 2º Creamos una columna para cada propiedad y le damos el valor guardado en el array
        let tdBody = document.createElement('td');

        //Le damos una clase a la columna matrícula para luego poder eliminarla
        if(propiedad == "matricula"){
            tdBody.classList.add("nieto");
        }
        tdBody.textContent = coche[propiedad];
        //3º Añadimos cada columna a la fila
        trBody.appendChild(tdBody);
     }))

}
function mostrarTabla(){

    crearTabla();

    document.body.appendChild(table);
}

function eliminarCoche(e){
    if(e.target && e.target.classList.contains("nieto")){

      // Eliminar la fila del DOM
      e.target.closest('tr').remove(); // Usamos closest para obtener el tr que contiene al target
        
      // Eliminar de la lista de coches
      arrayCoches = arrayCoches.filter((coche) => coche.matricula !== e.target.textContent);
    }
}