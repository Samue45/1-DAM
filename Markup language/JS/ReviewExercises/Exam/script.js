//Exercise 1
let inputNumber, finalList;
let arrayNumbers = [];

//Exercise 2
let table;
let arrayStudents = [{
    name : "Manuel",
    nota1 : 5,
    nota2: 8,
    nota3: 9
},{
    name : "María",
    nota1 : 8,
    nota2: 8,
    nota3: 9
},{
    name : "Juan",
    nota1 : 6,
    nota2: 5,
    nota3: 5
}]


window.addEventListener('load',main);

function main(){

    //Exercise 1

    inputNumber = document.getElementById('inputNumber');
    finalList = document.getElementById('finalList');
    document.getElementById('button').addEventListener('click', () => {

        if(isNaN(parseInt(inputNumber.value))){
            document.getElementById('text').innerHTML = "Invalid data :(";
        }else{
            document.getElementById('text').innerHTML = "";

            //Para ingresar valores dentro de un Array vacío podemos usar el método push, es más cómodo de usar
            //También exite un método que nos permite agregar un número al final del Array, pero en este caso
            //no haría falta ya que estamos concatenando cada objeto li dentro de una variable String.
            arrayNumbers.push(parseInt(inputNumber.value));

            let list = "";
            arrayNumbers.forEach( (element) => {
                list += `<li>${element}</li>`;
            })

            finalList.innerHTML = list;
        }});

     //Exercise 2
     table = document.getElementById('table');
     let solution = "";
     let media = 0;
     solution = `<tr>
                    <th>Name</th>
                    <th>Media</th>
                </tr>`;

     arrayStudents.forEach((element) => {
        media = (element.nota1 + element.nota2 + element.nota3) / 3;
        solution += `<tr>
                    <td>${element.name}</td>
                    <td>${media.toPrecision(2)}</td>
                </tr>`;
     })

     table.innerHTML = solution;


}