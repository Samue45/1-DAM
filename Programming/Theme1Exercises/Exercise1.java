package Programming.Theme1Exercises;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        //Instance Block
        Scanner input = new Scanner(System.in);
        String message;
        int number;

        //Users data
        System.out.println("Give a number to calculate its absolute form:");
        number = input.nextInt();

        //Program instructions
        if (number >= 0) {
            message = "The absolute value of |"+ number +"| is = " +  number;
        } else {
            number = -(number);
            message = "The absolute value of |-"+ number +"| is = " +  number;
        }
        //Solution
        System.out.println(message);
    }
}
