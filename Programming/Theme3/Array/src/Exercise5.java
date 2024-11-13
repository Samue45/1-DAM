import java.util.Scanner;

public class Exercise5 {

    Scanner input = new Scanner(System.in);

    public int [] changePositionsArray(int[] listNumbers){
        int firstNumber;

        //1º We save different values inside on Array
        saveNumbers(listNumbers);

        //2º We change the positions of numbers
        for (int i = 0; i < listNumbers.length -1 ; i+= 2) {

            //We save the first value
            firstNumber = listNumbers[i];
            listNumbers[i] = listNumbers[i+1];
            listNumbers[i + 1] = firstNumber;

        }

        return listNumbers;
    }

    public void saveNumbers(int [] listNumbers){
        int answer;

        for (int i = 0; i < listNumbers.length; i++) {
            System.out.println("Introduce a number");
            answer = input.nextInt();

            listNumbers[i] = answer;

            if (answer == 0){
                break;
            }
        }
    }

}
