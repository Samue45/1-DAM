let classes, productsBoard, chain;
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
    classes = document.getElementById('classes');
    productsBoard = document.getElementById('products-board');
    document.getElementById('apply-filter').addEventListener('click', applyFilter);


    //By defect we show all available products
    chain = "";
    arrayProducts.forEach((elem)=>{ chain += `<ul><li> Name: ${elem.name}, Price:${elem.price} </li></ul>`})
    
    productsBoard.innerHTML = chain;
 
}

function applyFilter(){

    //We clean the board
    chain = "";

    //Now, we show the product but using the filter
    arrayProducts.forEach((elem)=>{ 
        
        if(classes.value === elem.class){
            chain += `<ul><li> Name: ${elem.name},  Price:${elem.price} </li></ul>`
        }
        })

    //Finally we show all products that pass the filter
    productsBoard.innerHTML = chain;

    ////We can also use the filter method of the Array class to save the products that pass the filter into a new Array and finally display the new Array

}












window.addEventListener('load',main);