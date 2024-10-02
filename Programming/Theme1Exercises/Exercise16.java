package Programming.Theme1Exercises;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message ,answer ;

        //User data
        System.out.println("¡Welcome to  CulturePlay! \n Discover how many do you know about culture (Answer with YES or NOT)");

        System.out.println("Discovered Colón América?");
        answer = input.nextLine().toUpperCase();

        if (answer.equals("YES")){
            System.out.println(" Is Paris the capital of Bélgica");
            answer = input.nextLine().toUpperCase();

            if (answer.equals("NOT")) {
                System.out.println("Were the Beatles a rock group?");
                answer = input.nextLine().toUpperCase();

                if (answer.equals("NOT")){
                    message ="¡CONGRATULATIONS! All your answer are correct";
                }else if (answer.equals("YES")) {
                    message = "SORRY :(, your answer is incorrect";

                }else {
                    message = "ERROR: Invalid dara :(";
                }
            }else if (answer.equals("YES")) {
                message = "SORRY :(, your answer is incorrect";

            }else {
                message = "ERROR: Invalid dara :(";
            }

        } else if (answer.equals("NOT")) {
            message = "SORRY :(, your answer is incorrect";

        }else {
            message = "ERROR: Invalid dara :(";
        }

        //Solution
        System.out.println(message);

    }
}
