package Programming.Theme1Exercises;

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        //Bloque de instancias
        Scanner input = new Scanner(System.in);
        String message = "";
        int numberClothes =0;
        double totalPrice = 0,priceClothes = 0, descount = 0;
        double FIRST_DISCOUNT = 0.2,SECOND_DISCOUNT = 0.1;

        //Petición de datos
        System.out.println("Ingresa la cantidad de camisas que has comprado:");
        numberClothes = input.nextInt();
        System.out.println("Ingresa el precio de las camisas");
        priceClothes = input.nextDouble();

        //Instrucciones
        if (numberClothes == 0 || priceClothes == 0){
            message ="Los datos ingresados no son válidos :(";
        } else if (numberClothes < 3) {
            totalPrice = (numberClothes * priceClothes);
            descount = totalPrice * SECOND_DISCOUNT;
            totalPrice -= descount;
            message ="Se le ha aplicado un descuento del 10%, por lo tanto debe pagar = " + totalPrice + "€";
        } else if (numberClothes >= 3) {
            totalPrice = (numberClothes * priceClothes);
            descount = totalPrice * SECOND_DISCOUNT;
            totalPrice -= descount;
            message ="Se le ha aplicado un descuento del 20%, por lo tanto debe pagar = " + totalPrice + "€";
        }

        //Solución
        System.out.println(message);
    }
}
