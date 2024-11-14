public class Exercise1 {


    public void calculateMediaOfRowBiggest(int[][] matriz ){

        int sum,media = 0, solution = 0;

        for (int row = 0; row < matriz.length; row++){
            sum = 0;

            for (int column = 0; column < matriz[row].length; column++){
                //1º We calculate the sum of all numbers of each column
                sum += matriz[row][column];

            }
            //2º We calculate the media of each row
            media = sum / matriz[row].length;

            //3º We check what is the media higher
            if (solution < media){
                solution = media;

            }
            System.out.print(media + "\t") ;
            System.out.println();
        }
        System.out.println("The media biggest is = " + solution);
    }

    public boolean compareTwoMatrix(int[][] matrix1,int[][] matrix2 ) {

        boolean equalStructure = true;

        if (matrix1.length != matrix2.length) {
            equalStructure = false;
        } else {
            for (int row = 0; row < matrix1.length; row++) {
                if (matrix1[row].length != matrix2[row].length) {
                    equalStructure = false;
                }
            }
        }

        return equalStructure;
    }


}
