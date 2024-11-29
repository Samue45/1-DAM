package Programming.PracticeExercises.HangedGame;

import java.util.Random;
import java.util.Scanner;

public class HangedGame {

    //Properties
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    String [] secretWord = {"Tortilla","Quebrantahuesos","Zaino","Zonzo","Melifluo"};


    public void play(){






    }

    //Generate a random word to can play
    private String randomWord(){
        String word;
        int randNumber = random.nextInt(0,4);

        word = secretWord[randNumber];

        return word;
    }

    //Ask user a letter
    private char answerUser(){
        String  answer;
        char letter;
        //We ask a word
        System.out.println("Introduce a letter");
        answer = input.next();
        //Take the letter
        letter = answer.charAt(0);

        return letter;
    }

    //Check if the random word have the letter that user give us
    private boolean compareValues(String word, char letter){
        boolean result = false;

        for (int i = 0; i < word.length() ; i++) {
            if (word.charAt(i) == letter){
                result = true;
            }

        }

        return result;
    }

    //Check if the user already say the letter
    private boolean checkLetter(char letter){
        boolean result = false;
        char[] abecedario = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        for (int i = 0; i < abecedario.length ; i++) {
            if (abecedario[i] == letter) {
                result = true;
            }
        }
        return  result;
    }


    private void saveAnswer(String word,char letter){
        char[] answer = new char[word.length()];

        for (int i = 0; i < answer.length; i++) {

        }
    }
}
