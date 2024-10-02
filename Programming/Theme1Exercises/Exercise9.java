package Programming.Theme1Exercises;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        //Instances block
        Scanner input = new Scanner(System.in);
        String message;
        double a, b, c;
        double solution1, solution2, filing;

        //Users data
        System.out.println("Give the a value ");
        a = input.nextFloat();
        System.out.println("Give the b value ");
        b = input.nextFloat();
        System.out.println("Give the c value");
        c = input.nextFloat();

        //Algorithm instructions

        // 1º We calculate the filing
        filing = (b * b) - (4 * a * c);

        // 2º Answers to the different solutions
        if (a == 0){
            message = "ERROR: It's impossible divide by 0";
        } else if (filing < 0) {
            message = "The solution are two complex conjugate numbers";
        }else {
            solution1 = ((-b) + Math.sqrt(filing))/(2 * a);
            solution2 = ((-b) - Math.sqrt(filing))/(2 * a);
            message = "The first value of x = " + solution1 + "\nhe first value of x = " + solution2 ;
        }

        //Solution
        System.out.println(message);
    }
}
