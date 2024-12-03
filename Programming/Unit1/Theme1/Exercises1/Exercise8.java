package Programming.Unit1.Theme1.Exercises1;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message;
        float number1, number2, solution = 0F;

        //Users data
        System.out.println("Give the A value:");
        number1 = input.nextFloat();
        System.out.println("Give the B value:");
        number2 = input.nextFloat();

        //Intrucciones del algortimo
        if (number1 > number2 ){
            solution = number1 + number2;
            message = "The solution is " + solution + ", because (A > B)";
        }else if (number1 < number2){
            solution = number1 * number2;
            message = "The solution is" + solution + "(A < B)";
        }else {
            message= "ERROR: Both numbers are the same";
        }

        //Solution
        System.out.println(message);
    }
}
