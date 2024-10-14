package Programming.Theme1.Exercises2;

import java.util.Scanner;

public class Exercise12 {

    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message;
        int number;

        do {
            //User data
            System.out.println("CALCULATOR OF PAIR AND ODD NUMBERS");
            System.out.println("Write a number");
            number = input.nextInt();

            //Algorithm instructions
            if ((number % 2) == 0 ){

                message = "This number is PAIR: " + number;
            }else {

                message = "This number is ODD: " + number;
            }

            //SOLUTION
            System.out.println(message);
        }while (number != 0);



    }
}
