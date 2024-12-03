package Programming.Unit1.Theme2.NestedLoops;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        //Block instance
        Scanner input = new Scanner(System.in);
        String name="", specialName="",message1, message2;
        final int NUMBERSTUDENTS = 3;
        float noteMath, noteHistory, noteEnglish, notePhysic, noteArt;
        float max=0,min=0, media, sum=0, minTotal=1;
        int counter=0;
        boolean start = true,start1 = true;

        //1º BUCKLE - START
        for (int student = 0; student< NUMBERSTUDENTS;student++){

            System.out.println("Indicate what are your notes of the different subjects : ");

            //2º BUCKLE - START
            for (int i= 0; i< NUMBERSTUDENTS; i++){

                //User data
                System.out.println("Introduce your name:");
                name = input.next();

                // We ask the notes to student
                System.out.print("Math = ");
                noteMath = input.nextFloat();

                System.out.print("History = ");
                noteHistory = input.nextFloat();

                System.out.print("English = ");
                noteEnglish = input.nextFloat();

                System.out.print("Physic = ");
                notePhysic = input.nextFloat();

                System.out.print("Art = ");
                noteArt = input.nextFloat();

                //Now we're working with the data
                //1º We need to start the variables max and min with the first note and then only compare with another
                if (start){
                    min = noteMath;
                    max = noteMath;

                    start = false;
                }
                //2º We calculate his max and min note
                //MAX
                if (max < noteHistory){max = noteHistory;}
                if (max < noteEnglish){max = noteEnglish;}
                if (max < notePhysic){max = notePhysic;}
                if (max < noteArt){max = noteArt;}
                //MIN
                if (min > noteHistory){min = noteHistory;}
                if (min > noteEnglish){min = noteEnglish;}
                if (min > notePhysic){min = notePhysic;}
                if (min > noteArt){min = noteArt;}

                //3º We calculate the sum of all first notes
                sum+= noteMath;

                //4º We calculate if someone of the note is bigger than 8, then we save that data with a counter
                if (noteMath > 8 || noteHistory > 8|| noteArt > 8|| noteEnglish> 8 || notePhysic > 8){
                    counter++;
                }

                message1 = "1º Solution - The max number is = " + max + " and the min number is = " + min;

                System.out.println(message1);
            }//2º BUCKLE - FINISH

            //3.1º We calculate the sum of all first notes(Now we calculate the media)
            media = sum / NUMBERSTUDENTS;
            //To can save the student with the less note we need to save all min and compare among they
            if (start1){
                minTotal = min;
                start1 = false;
            }
            if (min < minTotal){
                minTotal = min;
                name = specialName;
            }

            //Now we're going to show the solutions
           message2 = "2ºSolution - The sum of all first notes is = " + media + "\n3ºThe number of student with notes bigger than 8 are = " + counter
           + "\n4º The student with note less is " + name;

            System.out.println(message2);


        }//1º BUCKLE - FINISH

    }
}
