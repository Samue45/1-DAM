package Programming.Theme1.Exercises2;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {

        //Block instance
        Scanner input = new Scanner(System.in);
        String message= "", answer;
        int counter = 0;

        do {
            //User data
            System.out.println("Introduce a word to can calculate the number of 'a' \n(Write '$' if you want get out of the app)");
            answer = input.nextLine().toLowerCase();

            //Instructions

            //1º We study the word and look for the characters equals to "a"
            for (int i=0; i< answer.length();i++){

                if ( answer.charAt(i) == 'a'){
                    counter++;
                    message = "This word"+ answer +" has " + counter + " 'a'" ;
                }
            }

            //CLOSED MESSAGE
            if (answer.equalsIgnoreCase("$")){
                message = "The program finished :)";
            }

            //SOLUTION
            System.out.println(message);

        }while(!answer.equalsIgnoreCase("$"));


    }

}
