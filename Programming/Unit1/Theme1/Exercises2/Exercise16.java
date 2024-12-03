package Programming.Unit1.Theme1.Exercises2;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {

        //BLOCK INSTANCE
        Scanner input = new Scanner(System.in);
        String message1, message2="";
        int number, sum = 0;

        //INTRODUCTION
        System.out.println("Introduce a number to know its divisors");


        //USER DATA
        System.out.print("Introduce the number: ");
        number = input.nextInt();


        //INSTRUCTIONS
        for (int counter=1; counter < number; counter++){

            //We calculate divisors of the number
            if ((number % counter) == 0){

                message1 = counter + " is divisor of " + number;

                //We calculate if the number is perfect
                sum+=counter;

                //SOLUTION
                System.out.println(message1);
            }
        }

        //If the number is perfect, we will show a special message
        if (number == sum){
            message2 = number + " is a perfect number";
        }else {
            message2 = number + " isn't a perfect number";
        }

        //SOLUTION
        System.out.println(message2);
    }
}
