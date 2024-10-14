package Programming.Theme1.Exercises2;

import java.util.Scanner;

public class Exercise8 {

    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message="";
        int number;
        int sum= 0;

        do {

            //User data
            System.out.println("Introduce a number to know its summation:");
            number = input.nextInt();

            //Instructions
            for (int i=0; i <=number; i++){
                sum+=i;// Here, we calculate the solution
                message = "The sum of all numbers is = " + sum;
            }

            //ERRORS
            if (number == 20){
                message ="ERROR: THe number can't be 20";
            } else if (sum > 300) {
                message="ERROR: The summation is bigger than 300 :(";
            }
            //SOLUTION
            System.out.println(message);

        }while (number != 20 && sum < 300);
    }
}
