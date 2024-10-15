package Programming.Theme2.NestedLoops;


import java.util.Scanner;

public class Exercise1Array {
    public static void main(String[] args) {

        //Block instance
        Scanner input = new Scanner(System.in);
        String message1 = "",message2 = "",message3 = "",message4 = "", name;
        final int NUMBERSTUDENTS = 5;
        float notes[]= new float[5];
        String subjects[] ={"Math", "History", "Language", "Physic", "Art"};
        float max= 0,min= 0, media, firstNote= 0, sum = 0,counter = 0, minStudents = 0;
        boolean goodNotes = false;
        boolean start1 = true,start2 = true;


        for (int code =0; code< NUMBERSTUDENTS;code++){

            //User data
            System.out.println("Introduce your name:");
            name = input.nextLine();

            //Notes
            System.out.println("Introduce your notes ");
            for (int i =0; i< subjects.length;i++){

                //We show the subjects name and we ask his note
                System.out.println(subjects[i]);
                notes[i] = input.nextFloat();


                //Calculate the max note and the min note of the student
                if (start1){
                    min = notes[0];
                    max = notes[0];

                    if (notes[i] >8){
                        goodNotes = true;
                    }
                    //We save the first note
                    firstNote = notes[0];
                    start1 = false;
                }
                if (min > notes[i]){
                    min = notes[i];
                }
                if (max < notes[i]){
                    max = notes[i];
                }
            }

            //Solution 1
            message1 = "Student: "+ name +"\nThe max note is = " + max + "\nThe min note is = " +min;

            //We look for who is the student with the less note
            if (start2){
                minStudents = min;
                start2 = false;
            }

            if (min < minStudents){
                minStudents = min;
                message4 = name + " is the student with the less note of all";
            }

            //We save the number of student that have a note bigger than 8
            if (goodNotes){
                counter++;
                message3 = "There are " + counter + "students with notes bigger than 8";
            }
            //We calculate the sum of all first notes
            sum+=firstNote;
            //Then we calculate its media
            media = sum/NUMBERSTUDENTS;
            //Finally we save the solution
            message2 = "The media of all first subjects is = " + media;
        }

        System.out.println(message1 + "\n"+ message2 + "\n"+ message3+ "\n"+ message4);

    }
}
