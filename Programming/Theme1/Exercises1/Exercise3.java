package Programming.Theme1.Exercises1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message;
        double cat1, cat2, sumcatetos = 0;
        double hipo = 0;

        //User data
        System.out.println("Introduce the  1º cateto");
        cat1 = input.nextFloat();
        System.out.println("Introduce the  2º cateto");
        cat2 = input.nextFloat();


        //Program instructions
        sumcatetos = Math.pow(cat1,2) + Math.pow(cat2,2) ;
        hipo = Math.sqrt(sumcatetos);
        message = "The hypotenuse of the triangle is = " + hipo;

        //Solution
        System.out.println(message);


    }
}
