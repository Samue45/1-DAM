import java.util.Scanner;

public class Exercise4 {
    //PROPERTIES
    Scanner input = new Scanner(System.in);


    //METHOD
    public int[] numbersArray(){
        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("Introduce 5 numbers");

        for (int i = 0; i < numbers.length; i++){

            if (i <= numbers.length -2){
                System.out.println("Write the number:");
                int number = input.nextInt();
                numbers[i] = number;

                sum += number;
            }

            if (i == numbers.length - 1){
                numbers[i] = sum;
            }
        }
        return numbers;
    }
}
