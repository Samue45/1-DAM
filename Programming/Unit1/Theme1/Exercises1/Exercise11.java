package Programming.Unit1.Theme1.Exercises1;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        
        //Instance block
        Scanner input = new Scanner(System.in);
        String figure;
        double PI = 3.14;
        double radioC, bR, hR;
        double areaC, areaR;
        String message="";
        

        //Users data
        System.out.println("Indicate with 'C' = Circle o 'R'= Rectangle to calculate its area");
        figure = input.nextLine().toUpperCase();
        

        //Algorithm instructions
    
         if (figure.equals("C")) { // We calculate the Circle area
            // We ask the data
            System.out.println("Introduce the radio of the Circle(m):");
            radioC = input.nextInt();

            //We calculate the area
            areaC = PI * (radioC * radioC);

            //We finally give a solution message
             message = "The area of the Circumference is = " + areaC + " (m)2 ";
        } else if (figure.equals("R")) { // We calculate the Rectangle area
             // We ask the data
            System.out.println("Introduce the base of the Rectangle(cm):");
            bR = input.nextInt();
            System.out.println("Introduce the high of the  Rectangle(cm):");
            hR = input.nextInt();

             //We calculate the area
            areaR = bR * hR;

             //We finally give a solution message
             message = "The area of the Rectangle is = " + areaR + " (cm)2";
        } else {
            System.out.println(" ERROR: Invalid data");
        }

        //Solution
        System.out.println(message);
    }
}
