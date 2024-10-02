package Programming.Theme1Exercises;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        
        //Instance block
        int startHour,startMinute, finalHour, finalMinute;
        int startSolution, finalSolution, minuteDifference, hourDifference, totalDifference;
        Scanner input = new Scanner(System.in);
        String message ;
        
        //Users data
        System.out.println("Give the start hour");
        startHour = input.nextInt();
        System.out.println("Give the start minutes");
        startMinute = input.nextInt();

        System.out.println("Give the final hour");
        finalHour = input.nextInt();
        System.out.println("Give the final minutes");
        finalMinute = input.nextInt();

        //Algorithm instructions
            // Look for all possible errors
        if (startHour < 0  || startHour > 23 ||startMinute < 0  || startMinute > 59|| finalHour < 0 || finalHour > 23 || finalMinute  < 0 || finalMinute > 59){
            message = "ERROR: Invalid data :(";
        }else if ((startHour > finalHour) || (startHour == finalHour && startMinute > finalMinute)){
            message = "ERROR: The final hour or minutes are bigger than start hour or minutes ";
        } else {
            // Resolve the problem

            //Pass all date to minutes
            startSolution = startHour * 60 + startMinute;
            finalSolution = finalHour * 60 +finalMinute;
            totalDifference = finalSolution - startSolution;

            //Pass the result of minute to hh:mm format
            hourDifference = totalDifference / 60;
            minuteDifference = totalDifference % 60;

            //Save the solution
            message = "The difference of time between the two hours is  " + hourDifference +"h y "+ minuteDifference + "min" ;
        }

        //Solution
        System.out.println(message);

    }
}
