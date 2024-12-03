package Programming.Unit1.Theme1.Exercises2;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message1, message2= "", answer;
        int number, counter = 0;
        int minim = 0,sum= 0, media;
        boolean firstTime = true;

        do {

            //User data
            System.out.println("Introduce a number:");
            number = input.nextInt();


            //Instructions
            //1º We initialize the values
            if (firstTime){
                minim = number;
                sum = number;
                counter = 1;
                firstTime = false;
            }
            //2º We calculate what is the number less
            if (minim > number){
                minim = number;
            }

            //3º We calculate the media of the numbers using the sum of all numbers and with the number of numbers
            counter++;
            sum+=number;
            media = sum / counter;

            message1 = "The minimum number is " + minim + "\nThe media is " + media;

            //SOLUTION
            System.out.println(message1);
            do {
                //Continue
                System.out.println("Do you want to continue?");
                answer = input.next();

                if (answer.equalsIgnoreCase("N")){
                    message2 = "The program closed";
                }else if (!answer.equalsIgnoreCase("S") && !answer.equalsIgnoreCase("N")){
                    message2 = "ERROR. Invalid data";
                }

                //SOLUTION
                System.out.println(message2);
            }while (!answer.equalsIgnoreCase("S") && !answer.equalsIgnoreCase("N"));

        }while (answer.equalsIgnoreCase("S"));
    }
}
