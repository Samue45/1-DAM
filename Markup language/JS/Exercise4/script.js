let input, productsBoard, cadena;
let arrayProducts = [
    {
        name: 'Table',
        price: 80,
        class: 'funiture'
    },{
        name: 'Chair',
        price: 30,
        class: 'funiture'
    },{
        name: 'Painting',
        price: 5,
        class: 'ornament'
    }];


function main(){

    //We look for the HTMLElement in the DOM
    input = document.getElementById('input');
    productsBoard = document.getElementById('products-board');

    document.getElementById('apply-filter').addEventListener('click', applyFilter);


    //By defect we show all available products

    cadena = `<ul>`;
    arrayProducts.forEach((elem)=>{ cadena += `<li> Name: ${elem.name}, Price:${elem.price} </li>`})
    cadena += `</ul>`;

    productsBoard.innerHTML = cadena;
 
}

function applyFilter(){

}












window.addEventListener('load',main);