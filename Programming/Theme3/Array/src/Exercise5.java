import java.util.Scanner;

public class Exercise5 {

    Scanner input = new Scanner(System.in);

    public int[] numberArray(){

        int[] numbers =new int[10];
        int number, newNumber ,counter = 0;

        do {
            System.out.println("Introduce a number:");
            number = input.nextInt();
            numbers[0] = number;
            counter++;
        }while (--counter < numbers.length && number != 0);

        for (int i = 0; i < numbers.length; i++){
            //Use better two Array to solve this exercise
        }

        return numbers;
    }
}
