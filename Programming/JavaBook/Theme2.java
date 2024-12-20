package Programming.JavaBook;

import java.util.Scanner;

public class Theme2 {

    public void listNumbers(){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = numbers.length - 1; i >= 0; i--){
            System.out.println("Introduce a number");
            int number = input.nextInt();

            numbers[i] = number;
        }

        for (int i : numbers){
            System.out.println(i);
        }
    }
}
