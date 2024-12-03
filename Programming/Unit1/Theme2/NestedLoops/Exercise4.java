package Programming.Unit1.Theme2.NestedLoops;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        //Block instance
        Scanner input = new Scanner(System.in);
        int number, sumTotal = 0, mediaTotal, sum= 0, media= 0, counter = 0;



        //START
        System.out.println("To exit introduce the number 0");
        do {

            System.out.println("Introduce a number:");
            number = input.nextInt();

            //WORK WITH THE DATA
            //Sum of all numbers
            sumTotal+= number;

            //Media of all numbers
            mediaTotal = sumTotal /2;


            //LOGIC
            //The number of sum that are bigger than 100
            if (sumTotal > 100){
                counter++;
            }

            //The media of number less than 10
            if (number < 10){
                sum += number;
                media = sum /2;
            }

            //SOLUTION

            System.out.println("The sum of all number is = " + mediaTotal);

            if (number == 0){
                System.err.println("The program finish");
                System.out.println("The number of sum that are bigger than 100 is = " + counter);
                System.out.println("The media of number less than 10 is = " + media);
            }

        }while(number != 0);

    }
}
