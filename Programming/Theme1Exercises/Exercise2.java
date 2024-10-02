package Programming.Theme1Exercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        //Instance Block
        Scanner input = new Scanner(System.in);
        int age ,numberPulsations;
        int MAX_BEAT = 220,TIME_BEAT = 6;
        String message;

        //User data
        System.out.println("Give your age to know what are your recommend beat:");
        age = input.nextInt();

        //Instructions of the program
        if (age > 0 && age < 99){
            numberPulsations = (MAX_BEAT - age) / TIME_BEAT;
            message = "Your  beats number  must be = " +  numberPulsations + " beat per second";
        }else{
            message = "Invalid data :(";
        }

        //Solution
        System.out.println(message);
    }
}
