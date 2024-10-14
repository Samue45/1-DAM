package Programming.Theme1.Exercises2;

import java.util.Scanner;

public class Exercise15 {

    public static void main(String[] args) {

        //BLOCK INSTANCE
        Scanner input = new Scanner(System.in);
        String message="";
        int number;

        //INTRODUCTION
        System.out.println("Introduce a number to know its divisors");


        //USER DATA
        System.out.print("Introduce the number: ");
        number = input.nextInt();


        //INSTRUCTIONS
        for (int i=1; i < number; i++){

            if ((number % i) == 0){

                message = i + " is divisor of " + number;

                //SOLUTION
                System.out.println(message);
            }
        }
    }
}
