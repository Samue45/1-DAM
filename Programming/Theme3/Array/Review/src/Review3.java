import java.util.Scanner;

public class Review3 {

    Scanner input = new Scanner(System.in);

    public void sumMatrix(){
        //Properties
        int rowsA,columnsA, rowsB,columnsB, sum = 0, number;

        //Ask user about the size
        System.out.println("Introduce the size of matrix B");
        System.out.println("Rows:");
        rowsA = input.nextInt();
        System.out.println("Columns:");
        columnsA = input.nextInt();

        System.out.println("Introduce the size of matrix B");
        System.out.println("Rows:");
        rowsB = input.nextInt();
        System.out.println("Columns:");
        columnsB = input.nextInt();

        //Create the matrix
        int[][] matrixA = new int[rowsA][columnsA];
        int[][] matrixB = new int[rowsB][columnsB];

        //Work with the matrix
        for (int i = 0; i < matrixA.length; i++) {
            System.out.println("Introduce the numbers of the matrix A");
            number = input.nextInt();
            for (int j = 0; j < i; j++) {

                matrixA[i][j] = number;
                sum += number;
            }
        }

        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.println("Introduce the numbers of the matrix B");
                number = input.nextInt();
                matrixB[i][j] = number;
                sum += number;
            }
        }

        //Show the result
        System.out.println("The sum of two matrix is = " + sum);
        }


    }
