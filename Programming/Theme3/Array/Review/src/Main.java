import java.util.Arrays;

public class Main {

    public static void main(String [] args){

        Review2 review2 = new Review2();

        int[][] numberMatrix = new int[3][3];
        review2.saveNumbers(numberMatrix);

        review2.sumRows(numberMatrix);
        review2.showMatrix(numberMatrix);
        System.out.println(review2.sumAllRows(numberMatrix));

    }



}
