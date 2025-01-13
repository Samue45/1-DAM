let arrayNumbers = [12,23,4,-12,-5,-7,90];


function main(){

  let evenNumbers = document.getElementById("evenNumbers");
  let multiplicate = document.getElementById("multiplicate");
  let finalSolution = document.getElementById("finalSolution");

  let even = arrayNumbers.filter(element => element % 2 == 0); //This return a new Array with even numbers
  let list1 = "";
  even.forEach(element => list1 += `<li>${element}</li>`);
  evenNumbers.innerHTML = list1;

  let by2 = arrayNumbers.map(element => element * 2); //This return a new Array with  numbers multiplicate by 2
  let list2 = "";
  by2.forEach(element => list2 += `<li>${element}</li>`);
  multiplicate.innerHTML = list2;

  let final = arrayNumbers.filter(element => element % 2 == 0).map(element => element * 2); //This return an Array with both change
  let list3 = "";
  final.forEach(element => list3 += `<li>${element}</li>`);
  finalSolution.innerHTML = list3;


}





window.addEventListener('load', main);