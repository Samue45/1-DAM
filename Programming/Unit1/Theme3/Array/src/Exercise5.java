package Programming.Unit1.Theme3.Array.src;

import java.util.Scanner;

public class Exercise5 {

    Scanner input = new Scanner(System.in);

    public int[] numberArray(){

        int[] numbers =new int[10];
        int number, counter = 0, saveNumber;

        //Create a method to save values inside on the Array
        do {
            System.out.println("Introduce a number:");
            number = input.nextInt();
            numbers[counter] = number;
            counter++;
        }while ( counter-1 < numbers.length && number != 0);

        for (int i = 0; i < numbers.length; i++){

            saveNumber = numbers[i];
            i++;
            numbers[i-1] = numbers[i];
            numbers[i] = saveNumber;
        }

        return numbers;
    }
}
