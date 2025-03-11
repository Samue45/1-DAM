function promesa(){
    return new Promise((resolve, reject) => {

        setTimeout(() => {

            let exito = Math.random() < 0.7;

            if(exito){
                resolve("Llamada exitosa")
            }else{
                reject("Fallo")
            }
        }, 2000);

    })
}

promesa()
.then()
.catch()
.finally()