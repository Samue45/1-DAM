package Programming.Theme2Exercises;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message= "";
        int number1,number2;

        //Use data
        System.out.println("Discover the odd numbers among N1 and N2:");
        System.out.println("Introduce the number N1");
        number1 = input.nextInt();
        System.out.println("Introduce the number N2");
        number2 = input.nextInt();

        //Algorithm instructions
        if (number1 > number2){
            message = "ERROR: N2 must be bigger or equal than N1";
        } else if (number1 == number2) {
            message = "ERROR: There aren't  integer numbers between both numbers";
        }
        System.out.println(message);

        for (int i = number1; i <= number2;i++){

            if ((i % 2)!=0){
                message = "Odd number = " + i;

                //Solution
                System.out.println(message);
            }
        }

    }
}
