package Programming.Unit1.PracticeExercises.ReviewAllThemes;

import java.util.Scanner;

public class Factorial {

    public static String calculatorOfFactorial(){
        Scanner input = new Scanner(System.in);
        int answer;
        String message;

        System.out.println("Introduce the number to calculate its factorial:");
        answer = input.nextInt();

        message = "The factorial of the number is = " +calculateFactorial(answer);

        return message;
    }

    private static float calculateFactorial(int number){
        int factorial = 1;

        for (int i = 1; i <= number; i++){
            factorial *= i;
        }

        return (float) factorial;
    }
}
