package Programming.Theme1Exercises;

import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message = "";
        int temperature = 0;

        //User data
        System.out.println("Discover what kind of sport you should to do");
        System.out.println("Indicate the temperature(ºF)");
        temperature = input.nextInt();

        //Instructions
        if (temperature <=10){
            message =" You should do indoor sport";
        } else if (temperature > 10 && temperature <= 32) {
            message = "You should do  Ski";
        } else if (temperature > 32 && temperature <= 70) {
            message = "You should do Golf";
        } else if (temperature > 70 && temperature <= 85) {
            message = "You should do Tennis";
        } else if (temperature > 85) {
            message = "You should do Swimming";
        }else {
            message = "ERROR:Invalid data :(";
        }

        //Solution
        System.out.println(message);

    }
}
