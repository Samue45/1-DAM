package Programming.Theme2.NestedLoops;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        //Block instance
        Scanner input = new Scanner(System.in);
        String nameStudent, sex, subject, sexStudent;
        int numberSubject,subjectTime = 0, numberStudents = 0, mediaTime = 0, sumTime= 0, timeStudy =0, counter1 = 0;
        float noteP,noteT, sumNotes = 0 ,mediaNote, bestNote = 0, noteStudent;
        boolean start = true;


        //START
        System.out.println("Introduce the number of subjects:");
        numberSubject = input.nextInt();

        //START THE 1º BUCKLE
        //We ask the information about the subject
        for (int counter = 0; counter < numberSubject; counter++){

            System.out.println("Introduce the information of the subject");

            System.out.println("Write the name of the subject");
            subject = input.next();

            System.out.println("Introduce the hours of the subject");
            subjectTime = input.nextInt();

            System.out.println("Introduce the number of students");
            numberStudents = input.nextInt();

            //START THE 2º BUCKLE
            //We ask the information of each student
            System.out.println("Introduce data of each student: ");
            for (int i = 0; i < numberStudents; i++){

                System.out.print("Write his name:");
                nameStudent = input.next();

                System.out.print("Write his sex:");
                sex = input.next();

                System.out.println("Introduce how many hours he have been studying");
                timeStudy = input.nextInt();

                System.out.print("Introduce his practise note:");
                noteP = input.nextInt();

                System.out.print("Introduce his theory note:");
                noteT= input.nextInt();


                //Logic to work with information student
                noteStudent = noteT + noteP;

                //Media of the notes
                if (subjectTime > 8){
                    sumNotes+= noteStudent;
                    mediaNote = sumNotes/2;

                    System.out.println("The media note in subject of more than 8 hours is = " + mediaNote);
                }

                //Best student
                if (start){
                    bestNote = noteStudent/2;
                    start = false;
                }
                if (noteStudent > bestNote){
                    bestNote = noteStudent;
                    sexStudent = sex;

                    System.out.println("The sex of the student with the best note in " + subject + "is = " + sexStudent);
                }

                if (timeStudy > 5 && timeStudy < 15){
                    counter1++;
                }

            }

            //Logic to work with information subject

            //Calculate the media of hours of all subjects
            sumTime += subjectTime;
            mediaTime = subjectTime/numberSubject;

            //SOLUTIONS
            System.out.println("The media time of all hours is = " + mediaTime);
            System.out.println("There are " + counter1 + " that have been studying between 5 and 15 hours");


        }

    }
}
