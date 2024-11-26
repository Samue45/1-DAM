package Programming.PracticeExercises.ReviewAllThemes;

import java.util.Scanner;


public class Conditional {

    public static String compareNumberWith10(){
        Scanner input = new Scanner(System.in);
        int answer;
        String message = "";

        System.out.println("Introduce a number:");
        answer = input.nextInt();

        if (answer > 10){
            message = "The number is bigger than 10";
        } else if (answer < 10) {
            message = "The number is less than 10";
        }else {
            message = "The number is equal than 10";
        }

        return message;
    }
}
