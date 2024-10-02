package Programming.Theme1Exercises;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message ="";
        double timeWork, salary = 0;

        //Users data
        System.err.println("Write how much time have you been working:");
        timeWork = input.nextDouble();

        //Algorithm instructions
        if (timeWork <= 0){
            message = "ERROR: Invalid data ";
        }
        if (timeWork <= 40){
            salary += 16;
            message = "Your salary is = " + salary;
        }
        if (timeWork > 40){
            salary = (timeWork - 40) * 20;
            message = "Your salary is= " + salary;
        }

        //Solution
        System.out.println(message);

    }
}
