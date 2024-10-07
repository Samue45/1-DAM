package Programming.Theme2Exercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message = "", answer;
        int number1, number2;

        //Use data
        System.out.println("Discover the odd numbers among N1 and N2:");
        System.out.println("Introduce the number N1");
        number1 = input.nextInt();
        System.out.println("Introduce the number N2");
        number2 = input.nextInt();

        //Algorithm instructions
        do {

            if (number1 > number2) {
                message = "ERROR: N2 must be bigger or equal than N1";
            } else if (number1 == number2) {
                message = "ERROR: There aren't  integer numbers between both numbers";
            }
            System.out.println(message);

            if ((number1 % 2) != 0) {
                message = "Odd number = " + number1;

                //Solution
                System.out.println(message);
            }

            //Continue
            System.out.println("Do you want to continue?(S[YES] or N[NOT])");
            answer = input.nextLine().toUpperCase();

            //We increment the main value
            number1++;

        } while (answer.equals("S") && number1<= number2);

    }
}