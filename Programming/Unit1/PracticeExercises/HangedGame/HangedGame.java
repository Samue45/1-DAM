package Programming.Unit1.PracticeExercises.HangedGame;

import java.util.Random;
import java.util.Scanner;

public class HangedGame {

    //Properties
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    String [] secretWord = {"Tortilla","Quebrantahuesos","Zaino","Zonzo","Melifluo"};


    public void play(){






    }

    //Generate a random word to can play and return an Array with all its letters
    private char[] randomWord(){
        String word;
        char[] letters;
        int randNumber = random.nextInt(0,4);

        word = secretWord[randNumber];
        word = word.toUpperCase();
        letters = word.toCharArray();

        return letters;
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

    //Work with the results
    private void workLetter (char [] randomLetters, char answerUser){
        //Array to the results
        char[]  solution = new char[randomLetters.length];

        boolean equals = equalsLetters(randomLetters,answerUser);

        //We can have 2 results:
        //1º The letter of the user there is in the random word
        if (equals){
            //Now we need to know if the user had already said that letter
            for (int i = 0; i < solution.length; i++) {
                // 1º Case: It's a new letter
                if (solution[i] != answerUser) solution[i] = answerUser;

                //2º Case: It's not new
                if (solution[i] == answerUser) System.out.println("The letter had already said , try again");
                //Allow to user another chance
            }
        }

        //2º The letter there's not in the random word
        if (!equals){
            //We draw a part pf the Hanged
        }
    }

    //Draw the Hanged
    private void drawHanged(){}

    //Check if the random word have the letter that user give us
    private boolean equalsLetters(char[] randomLetter, char answerUser){
        boolean equals= false;

        for (int i = 0; i < randomLetter.length; i++) {
            if (randomLetter[i] == answerUser) equals = true;
        }
        return equals;
    }


}
