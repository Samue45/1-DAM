package Programming.Theme2.NestedLoops;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        //Instance block
        Scanner input = new Scanner(System.in);
        String message, errorMessage;
        final int NUMBERSUTENDTS = 10;
        String name;
        String[] subjects= {"Maths, Language, English, Physic, History"};
        float  notes[] = new float[5];

        //User data
        for (int student = 1; student < NUMBERSUTENDTS; student++){

            //We save the name of the student
            System.out.println("Introduce the student's name:");
            name = input.nextLine();

            //We do different operations with his notes
            for (int counterSubject = 0; counterSubject < subjects.length; counterSubject++){

                //The user give us his note
                System.out.println("Introduce the note of " + subjects[counterSubject]);
                notes[counterSubject] = input.nextFloat();

                //ERRORS
                if (notes[counterSubject] < 0){
                    errorMessage = "ERROR :/ Your note can't be less than 0";
                }



            }//Final of NotesLoop

        }// Final of StudentsLoop
    }
}
