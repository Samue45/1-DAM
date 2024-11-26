package Programming.PracticeExercises.ReviewAllThemes;

import java.util.Scanner;

public class Triangle {

    public static void createTriangle(){
        Scanner input = new Scanner(System.in);
        int answer;

        System.out.println("Introduce the number of rows of your Triangle:");
        answer = input.nextInt();

        createRowsTriangle(answer);
    }

    private static void createRowsTriangle(int rows){
        String rowsTriangle = "";

        for (int i = 1; i <= rows; i++){
            rowsTriangle += i;
            System.out.println(rowsTriangle);
        }
    }
}
