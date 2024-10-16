package Programming.Theme2.NestedLoops;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        //Block instance
        Scanner input = new Scanner(System.in);
        int number, sumTotal = 0, mediaTotal, sum= 0, media, counter = 0;
        String message;


        //START
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

            if (number == 0){
                System.err.println("ERROR: Invalid data :/");
                System.out.println();
            }

        }while(number != 0);

    }
}
