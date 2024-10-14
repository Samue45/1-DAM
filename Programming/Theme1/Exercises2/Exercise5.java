package Programming.Theme1.Exercises2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message= "";
        int number1,number2;

        while (!message.equals("The program finished")) {

            //Use data
            System.out.println("Discover the odd numbers among N1 and N2:");
            System.out.println("Introduce the number N1");
            number1 = input.nextInt();
            System.out.println("Introduce the number N2");
            number2 = input.nextInt();

            //Algorithm instructions

            //ERRORS
            if (number1 > number2) {
                message = "ERROR: N2 must be bigger or equal than N1";
            } else if (number1 == number2) {
                message = "ERROR: There aren't  integer numbers between both numbers";
            }

            //BUCKLE
            for (int i = number1; i <= number2; i++) {
                if ((i % 2) != 0) {
                    message = "Odd number = " + i;

                    //SOLUTION
                    System.out.println(message);
                }
                if (number1 == 0 && number2 == 0) {message = "The program finished";}
            }

            //SOLUTION
            System.out.println(message);
        }

    }
}
