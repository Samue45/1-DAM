package Programming.Theme1.Exercises1;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {

        //Instance block
        double base, high, area;
        Scanner input = new Scanner(System.in);
        String message;

        //Users data
        System.err.println("Write the triangle base");
        base = input.nextDouble();
        System.err.println("Write the triangle high");
        high = input.nextDouble();


        //Algorithm instructions
        if (base < 0 || high < 0){
            message = "ERROR: Invalid data :(";
        }else {
            area = (base * high) / 2;
            message = "The triangle area = " + area;
        }

        //Solution
        System.out.println(message);



    }
}
