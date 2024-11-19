import java.util.Random;

public class Review4 {

    /*
    * method that create and save numbers in a Matrix
    * -Create a Random object between 1-10 and save in a variable
    * -Create a matrix and save the random numbers using a buckle for
    *
    *
    * method to can transposition the Matrix
    *-Have a matrix like parameter
    *- Create a matrix that save the values of the previous matrix, so
    * we need to use a buckle for where i=j and j=i to can change his order
    * */

    public int[][] createAMatrix(){
        //We generate randoms numbers and save them
        Random random = new Random();

        //We create the matrix to save the numbers
        int [][] matrix = new int[3][3];

        //We save the numbers
        for (int i =0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(10) + 1;
            }
        }

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        printMatrix(matrix);


        return matrix;

    }

    public void transpositionMatrix(int[][] matrixA){
        //We create a new matrix
        int[][] matrixB = new int[matrixA[0].length][matrixA.length];

        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length ; j++) {
                matrixB[j][i] = matrixA[i][j];
            }
        }

        // Print the transposed matrix
        System.out.println("Transposed Matrix:");
        printMatrix(matrixB);
    }

    // Helper method to print a matrix in a formatted way
    private void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing a row
        }
    }
}
