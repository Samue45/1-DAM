package Programming.Theme2Exercises;


import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {

        //INSTANCE BLOCK
        Scanner input = new Scanner(System.in);
        String message;
        int number, counter = 0;
        double randomNumber;

        //PRESENTATION
        System.out.println("----WELCOME to the enigma game---- \nYou have 5 opportunities to can guess the number");

        do {
            //USER DATA
            System.out.println(" Write a number:");
            number = input.nextInt();

            //INSTRUCTIONS
            randomNumber = Math.random();

            if(number > randomNumber){
                message = "The enigma number is less {:-/}";
            } else if (number < randomNumber) {
                message = "The enigma number is bigger {:|}";
            }else {
                message = "CONGRATULATION!! You win the game {:)}";
            }

            //We increment the value of the counter to can finish the buckle
            counter++;

            //SOLUTION
            System.out.println(message + "\n Your attempts was = " + counter);

        }while (counter < 5 && !message.equals("CONGRATULATION!! You win the game {:)}"));

    }
}
