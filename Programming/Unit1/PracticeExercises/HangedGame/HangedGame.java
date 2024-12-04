package Programming.Unit1.PracticeExercises.HangedGame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HangedGame {

    //Properties
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    String [] secretWord = {"Tortilla","Quebrantahuesos","Zaino","Zonzo","Melifluo"};
    char[]  solution;


    public void play(){
       char[] randomLetters;
       char answerUser;

        //1º Generate a random word
        randomLetters = randomWord();

        //2º Allow to user write a letter
        answerUser = answerUser();

        //3º Work with the word and the letter
        workLetter(answerUser,randomLetters);

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
    private void workLetter (char answerUser, char[] randomWord){
        //Array to the results
        solution = new char[randomWord.length];
        String drawing = "";

        //We set lines to can watch better how many letters have our word
        Arrays.fill(solution, '_');

        boolean equals = equalsLetters(randomWord,answerUser);

        //We can have 2 results:
        //1º The letter of the user there is in the random word
        if (equals){
            //Now we need to know if the user had already said that letter
            for (int i = 0; i < solution.length; i++) {
                // 1º Case: It's a new letter
                if (randomWord[i] == answerUser){
                    //We need to know in what position there is the letter and then save into our new Array
                    solution[i] = answerUser;

                }

                //2º Case: It's not new
                if (solution[i] == answerUser) {
                    System.out.println("The letter had already said");
                    drawing = drawHanged();
                }
            }
        }

        //2º The letter there's not in the random word
        if (!equals){
            //We draw a part of the Hanged
            drawing =drawHanged();
        }

        System.out.println(drawing);
    }

    //Draw the Hanged
    private String drawHanged(){
        // Hangman stages, each string represents a different stage of the hangman figure
        String[] hangmanStages = {
                "",               // Stage 0: No body drawn yet
                " O",             // Stage 1: Head
                " O\n |",          // Stage 2: Head + Body
                " O\n/|",          // Stage 3: Head + Body + Left Arm
                " O\n/|\\",        // Stage 4: Head + Body + Arms
                " O\n/|\\\n/",     // Stage 5: Head + Body + Arms + Left Leg
                " O\n/|\\\n/ \\"   // Stage 6: Complete Hangman (Head, Body, Arms, Legs)
        };

        //We draw a part of the Hanged
        int counter = 0;
        String draw = "";
        hangmanStages[counter] += draw;

        return draw;
    }

    //Check if the random word have the letter that user give us
    private boolean equalsLetters(char[] randomLetter, char answerUser){
        boolean equals= false;

        for (int i = 0; i < randomLetter.length; i++) {
            if (randomLetter[i] == answerUser) equals = true;
        }
        return equals;
    }



}
