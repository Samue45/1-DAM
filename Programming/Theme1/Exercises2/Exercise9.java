package Programming.Theme1.Exercises2;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message="",error="";
        int number;
        int sum= 0;

        do {

            //User data
            System.out.println("Introduce a number to know its summation(It start at 5 and not at 0):");
            number = input.nextInt();

            //Instructions
            if (number >=5 || number < 100){

                for (int i=5; i <=number; i++){
                    sum+=i;// Here, we calculate the solution
                    message = "The sum of all numbers is = " + sum;
                }
            }



            //ERRORS and CONTINUE
            while(number < 5|| number > 100){

                //Errors
                if (number < 5){
                    error ="ERROR: THe number can't be less than 5";
                } else if (number > 100) {
                    error="ERROR: The summation is bigger than 100 :(";
                }

                System.out.println(error);

                //Continue
                System.out.println("Try again ;):");
                number = input.nextInt();
            }


            //SOLUTION
            System.out.println(message);

        }while (number >= 5 || number <= 100);
    }
}
