import java.util.Scanner;

public class Exercise2 {

    static Scanner input = new Scanner(System.in);

    //METHODS
    public static int[] saveNumbers(){

        int[] collectionsNumber = new int[10];
        int number = 0;

        for (int i=0; i< collectionsNumber.length; i++){
            int counter = i;
            //Here we solicit the number
            System.out.println("Introduce the "+ (counter + 1) + "º number:");
            number = input.nextInt();
             //Here we save the number in the Array
            collectionsNumber[i] = number;
        }
        //And finally we return the Array with 10 numbers
        return collectionsNumber;
    }
}
