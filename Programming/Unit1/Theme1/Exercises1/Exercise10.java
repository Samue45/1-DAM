package Programming.Unit1.Theme1.Exercises1;
import java.util.Scanner;

public class Exercise10 {
    
    public static void main(String[] args) {
        
        //Instances block
        Scanner input = new Scanner(System.in);
        int number1 = 0;
        String message ;


        //Users data
        System.out.println("Introduce the day of the week:");
        number1 = input.nextInt();
        input.close();

        //Algorithm instructions
        switch (number1) {
            case 1:
                message = "Monday";
                break;
            case 2:
                message = "Tuesday";
                break;
            case 3:
                message = "Wednesday";
                break;
            case 4:
                message = "Thursday";
                break;
            case 5:
                message = "Friday";
                break;
            case 6:
                message = "Saturday";
                break;
            case 7:
                message = "Sunday";
                break;
        
            default:
                message = "ERROR: The value is out of range";
                System.out.println(message);
                break;
        }

        //Solution
        System.out.println("The number " + number1 + " = " + message);
    }
    



}
