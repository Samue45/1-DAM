package Programming.Unit1.Theme1.Exercises2;

import java.util.Scanner;

public class Exercise11 {

    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message;
        int number, sum = 0;

        do {
            //User data
            System.out.println("Introduce a weight:");
            number = input.nextInt();

            //Instructions
            //1º We save the number and then plus the next
            sum+= number;
            //2º We give a solution message
            message = "The total weight is now = " + sum;

            //ERRORS
            if(sum >= 200){
                message = "ERROR: The weight can be superior to 200 Kg :(";
            }

            //RESULT
            System.out.println(message);
        }while (sum <= 200);
    }
}
