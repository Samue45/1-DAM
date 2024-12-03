package Programming.Unit1.Theme3.Array.Review.src;

import java.util.Scanner;

public class Review2 {
    /*
    * Crea una matriz de enteros de tamaño 3x3.
    * Llena la matriz con números introducidos por el usuario.
    * Calcula la suma de cada fila utilizando un bucle for.
    * Muestra la matriz utilizando un bucle foreach.
    * Calcula la suma total de todos los elementos de la matriz y la muestra.*/

    public void saveNumbers(int[][] numberMatrix){
        Scanner input = new Scanner(System.in);
        int number;

        for (int row = 0; row < numberMatrix.length; row++){

            for (int column = 0; column < numberMatrix[row].length; column++){
                System.out.println("Introduce a number");
                number = input.nextInt();
                numberMatrix[row][column] = number;
            }
        }
    }

    public  void  sumRows(int[][] numberMatrix){


        for (int row = 0; row < numberMatrix.length; row++){
            int sum = 0;

            for (int column = 0; column < numberMatrix[row].length; column++){
                sum += numberMatrix[row][column];
            }
            System.out.println("Suma de la fila " + row + ": " + sum);
        }
    }

    public void showMatrix(int[][] numberMatrix) {
        System.out.println("Contenido de la matriz:");
        for (int[] row : numberMatrix) {
            for (int element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

    public  int sumAllRows(int[][] numberMatrix){
        int totalSum= 0;

        for (int row = 0; row < numberMatrix.length; row++){
            for (int column = 0; column < numberMatrix[row].length; column++){
                totalSum += numberMatrix[row][column];
            }
        }

        return totalSum;
    }

}
