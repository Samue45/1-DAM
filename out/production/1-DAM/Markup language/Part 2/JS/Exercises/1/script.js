
window.addEventListener('load', main);

function main(){

    document.querySelector('button').addEventListener('click',addTexto);

    let img = document.createElement('img');
    img.setAttribute('src', 'https://i.blogs.es/0ca9a6/aa/1366_2000.webp'); // Se coge bien la imágen
    document.getElementsByTagName('body')[0].appendChild(img);
}

function addTexto(){
    
    let parrafo = document.createElement('p');
    parrafo.appendChild(document.createTextNode("Hola, soy un nuevo párrafo"));

    document.body.appendChild(parrafo);

}