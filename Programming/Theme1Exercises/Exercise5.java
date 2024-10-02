package Programming.Theme1Exercises;

import java.util.Scanner;


public class Exercise5 {
    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message;
        double oldSalary, newSalary = 0;
        double INCREMENT = 0.25;

        //Users data
        System.out.println("Indicate your actual salary: ");
        oldSalary = input.nextDouble();

        //Algorithm instructions
        if (oldSalary <= 0){
            message = "ERROR :Invalid data:(";
        }else {
            newSalary = oldSalary + (oldSalary * INCREMENT);
            message = "Your actual salary has increment a 25%, so it's now = " + newSalary + " €";
        }

        //Solution
        System.out.println(message);
    }
}
