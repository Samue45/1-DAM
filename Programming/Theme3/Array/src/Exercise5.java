import java.util.Scanner;

public class Exercise5 {

    Scanner input = new Scanner(System.in);

    public int[] changeFirstToSecondPosition(){

        int[] numbers =new int[10];
        int saveNumber;

        //1º We save values inside on the Array
        saveValues();

        for (int i = 0; i < numbers.length; i++){

            saveNumber = numbers[i];
            i++;
            numbers[i-1] = numbers[i];
            numbers[i] = saveNumber;
        }

        return numbers;
    }

    public int[] saveValues(){
        int[] listNumbers =new int[10];
        int number, counter = 0;

        do {
            System.out.println("Introduce a number:");
            number = input.nextInt();
            listNumbers[counter] = number;
            counter++;
        }while ( --counter < listNumbers.length && number != 0);
        return listNumbers;
    }
}
