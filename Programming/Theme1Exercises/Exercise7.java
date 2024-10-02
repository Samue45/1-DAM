package Programming.Theme1Exercises;

import java.util.Scanner;

public class Exercise7 {

    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message;
        float callTime,callCost;
        float PRICE_1= 10F, PRICE_2= 5F;

        //Users data
        System.out.println("Introduce how much time have you been having a call : ");
        callTime = input.nextFloat();

        //Algorithm instructions
        if (callTime > 0 ){
            callCost = PRICE_1;
            message = "You must pay  " + callCost + " cents";
            if (callTime > 3){
                callCost = PRICE_1 + (callTime - 3) * PRICE_2;
                message = "You must pay  " + callCost + " cents";
            }

        }else {
            message = "ERROR: Invalid data :(";
        }

        //Solution
        System.out.println(message);
    }
}
