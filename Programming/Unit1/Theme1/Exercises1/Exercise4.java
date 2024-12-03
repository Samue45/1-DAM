package Programming.Unit1.Theme1.Exercises1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message;
        int numberMen, numberWomen ,totalStudents;
        float percentageMen, percentageWomen;


        //Users data
        System.out.println("Give the number of men: ");
        numberMen = input.nextInt();
        System.out.println("Give the number of women: ");
        numberWomen = input.nextInt();

        //Algorithm instructions
        if (numberMen < 0 || numberWomen < 0){
            message = "It's impossible that there 0 man and 0 women";
        }else {
            totalStudents = numberMen + numberWomen;
            percentageMen = numberMen * ((float)totalStudents/100);
            percentageWomen = numberWomen * ((float)totalStudents/100);

            message = "The total of students is = " + totalStudents + "\n Men = " + percentageMen + "%"+ "\n Women = " + percentageWomen+ "%";
        }

        //Solution
        System.out.println(message);
    }
}
