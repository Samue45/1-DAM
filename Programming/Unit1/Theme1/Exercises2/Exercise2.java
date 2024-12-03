package Programming.Unit1.Theme1.Exercises2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message= "";
        int number,sum = 0;

        //User data
        System.out.println("Introduce a number to know the sum of all number until the number that you gave:");
        number = input.nextInt();

        //Algorithm instructions
        for (int i=0; i <=number; i++){
            sum+=i;
            message = "The sum of all numbers is = " + sum;
        }

        //The solution
        System.out.println(message);

    }
}
