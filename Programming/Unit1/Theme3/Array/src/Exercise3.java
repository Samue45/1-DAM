package Programming.Unit1.Theme3.Array.src;

import java.util.Scanner;

public class Exercise3 {

    //PROPERTIES
    Scanner input = new Scanner(System.in);

    public  void numberArray (int[] numbers){
        //We save numbers until the user try to save the number 0
        saveNumbers(numbers);

        //We allow the user
        changeNumber(numbers);
    }

    public void saveNumbers(int[] numbers){
        int number;

        for (int i=0; i < numbers.length; i++){
            System.out.println("Introduce a number:");
            number = input.nextInt();
            numbers[i] = number;

            if (numbers[i] == 0){
                break;
            }
        }
    }

    public String changeNumber(int [] numbers){
        int number, newNumber,counter= 0;

        System.out.println("Indicate a number to change");
        number = input.nextInt();

        for (int i=0; i < numbers.length; i++){
            if (numbers[i] == number){
                System.out.println("What is the new number?");
                newNumber = input.nextInt();

                numbers[i] = newNumber;
                counter++;
            }else {
                System.out.println("The number doesn't exist");
            }
        }

        return "The number that you want change appear " + counter + " times";

    }
}
