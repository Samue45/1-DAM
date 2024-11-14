package Theme3;

import java.util.Random;

public class Notes {

    private float[] notesStudent;

    public Notes(){}

    //Method to save randoms numbers inside on the Array
    public float[] saveNotes(){
        Random numbers = new Random();
        notesStudent = new float[10];

        for (int i = 0; i < notesStudent.length; i++){
            notesStudent[i] = numbers.nextFloat(10)  * 10;
        }
        return  notesStudent;
    }

    //Method to invert the Array
    public float[] invertArray(){
        float finalPositions = 0;
        for (int start = 0, end = notesStudent.length - 1; start < notesStudent.length / 2 ; start++, end--) {

            finalPositions = notesStudent[start];
            notesStudent[start] = notesStudent[end];
            notesStudent[end] = finalPositions;

        }
        return notesStudent;
    }



}
