package Programming.Theme1.Exercises2;

import java.util.Scanner;

public class Exercise13 {


    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message= "";
        int number,sum = 1;

        //User data
        System.out.println("Introduce a number to know the factorial of the number that you gave:");
        number = input.nextInt();

        //Algorithm instructions
        for (int i=1; i <=number; i++){
            sum*=i;
            message = "The factorial of all numbers is = " + sum;
        }

        //The solution
        System.out.println(message);

    }
}
