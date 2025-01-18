
window.addEventListener('load', main);

function main(){

    document.querySelector("button").addEventListener('click', viajarForm);
    document.getElementById("create-task").addEventListener('click', viajarHome);
    document.getElementById("cancel-task").addEventListener('click', viajarHome);

}





//Funciones para viajar entre páginas
function viajarForm(){
    window.location.href = "form.html";
}

function viajarHome(){
    window.location.href = "index.html";
}