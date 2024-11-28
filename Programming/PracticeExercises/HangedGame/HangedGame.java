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

    public String randomWord(){
        String word;
        int randNumber = random.nextInt(0,4);

        word = secretWord[randNumber];

        return word;
    }

    public char answerUser(){
        String  answer;
        char letter;
        //We ask a word
        System.out.println("Introduce a letter");
        answer = input.next();
        //Take the letter
        letter = answer.charAt(0);

        return letter;
    }

    public boolean compareValues(String word, char letter){
        return false;
    }
}
