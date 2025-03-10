// Array con números enteros
// Crear una función con un callback que tras 3 segundos de cáculo haga la media 
 const arrayEnteros = new Array(1,2,3,4,5,6,7,8);


function calcularMedia(array, callback){
    
    setTimeout(() =>{
        let suma = 0;
        let media = 0;

        array.forEach(number => {
            suma += number;
            media = suma / array.length;
        });

        callback(media);

    }, 3000);
}

calcularMedia(arrayEnteros,(media) => {
    console.log(media)
    document.getElementById('media').textContent = "Media = " + media;
});