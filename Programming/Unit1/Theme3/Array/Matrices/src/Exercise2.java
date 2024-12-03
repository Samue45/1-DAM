package Programming.Unit1.Theme3.Array.Matrices.src;

import java.util.Scanner;

public class Exercise2 {

    public void specialBuckle(){
        int lim = 10;
        int c = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Introduce a number:");
        c = input.nextInt();

        if (c != 0){
            for (int i = 0; i < lim; i++){
                System.out.println("Hello");
            }
        }else {
            System.out.println("Bye");
        }

    }

    public boolean isPrimeNumber(int number){
        boolean isPrime = false;

        if (number <= 1) return isPrime;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = true; // If divisible by any number other than 1 and itself, it's not prime
            }
        }
        return isPrime;
    }



}
