package Programming.Unit1.Theme1.Exercises1;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message = "";
        int numberClothes =0;
        double totalPrice ,priceClothes, discount ;
        double FIRST_DISCOUNT = 0.2,SECOND_DISCOUNT = 0.1;

        //User data
        System.out.println("Write how many clothes do you buy :");
        numberClothes = input.nextInt();
        System.out.println("Write the price of the clothes");
        priceClothes = input.nextDouble();

        //Program instructions
        if (numberClothes == 0 || priceClothes == 0){
            message ="Invalid data :(";
        } else if (numberClothes < 3) {
            totalPrice = (numberClothes * priceClothes);
            discount = totalPrice * FIRST_DISCOUNT;
            totalPrice -= discount;
            message ="You must pay = " + totalPrice + "€ (discount = 10%)";
        } else if (numberClothes >= 3) {
            totalPrice = (numberClothes * priceClothes);
            discount = totalPrice * SECOND_DISCOUNT;
            totalPrice -= discount;
            message ="You must pay = " + totalPrice + "€ (discount = 20%)";
        }

        //Solution
        System.out.println(message);
    }
}
