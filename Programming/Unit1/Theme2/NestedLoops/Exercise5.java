package Programming.Unit1.Theme2.NestedLoops;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        //Block instance
        Scanner input = new Scanner(System.in);
        String message ="";
        int a,b, product=1;

        //Algorithm instructions
        System.out.println("Introduce the base number");
        a = input.nextInt();
        System.out.println("Introduce its potency");
        b = input.nextInt();

        //We just need to multiply the value A by itself, we repeat this process B times
        for (int i = 1; i <= b; i++){
            product = product * a;
            message = "The result is = " + product;
        }

        //SOLUTION
        System.out.println(message);
    }
}
