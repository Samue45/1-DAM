package Programming.Theme1Exercises;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message;
        float moneyGyne, moneyTrauma, moneyPedi;
        float annualSalary;

        //Users data
        System.out.println("Give the annual salary of the hospital: ");
        annualSalary = input.nextFloat();

        //Intrucciones del algortimo
        if (annualSalary < 0 ){
            message = "ERROR: Invalid data :(";
        }else {
            moneyGyne = annualSalary * 0.4F;
            moneyTrauma = annualSalary * 0.3F;
            moneyPedi = annualSalary * 0.3F;

            message = "The money will be divide in this percentage  :" + "\n Gynecologic = " + moneyGyne + "%" + "\n Traumatically = " + moneyTrauma+ "%" + "\n Pediatric = " + moneyPedi+ "%" ;
        }
        //Solución
        System.out.println(message);
    }
}
