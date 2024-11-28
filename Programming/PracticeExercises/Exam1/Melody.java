package Programming.PracticeExercises.Exam1;

import java.util.Arrays;
import java.util.Random;

public class Melody {

    public static String[] createCompas(){
        Random randomNumber = new Random();
        int random = randomNumber.nextInt(0,6);

        String [] compas = new String[4];
        String note= "";
        int counter = 0;

        while (counter < compas.length){
            switch (random){
                case 0: note = "do";
                        break;
                case 1: note = "re";
                    break;
                case 2: note = "mi";
                    break;
                case 3: note = "fa";
                    break;
                case 4: note = "sol";
                    break;
                case 5: note = "la";
                    break;
                case 6: note = "si";
                    break;
                default:
                    System.out.println("Doesn't exist");
                    break;
            }

            compas[counter]= note;
            counter++;
        }
        return compas;
    }

    public static String[] createMelody(){
        Random numbRand = new Random();
        int number = numbRand.nextInt(2,5);
        String[] melody = new String[6];

        for (int i=0; i< number; i++){
            melody[i] = createCompas()[i] + "|";
        }

        melody[melody.length - 1] = melody[0] + "|";

        return melody;
    }

    public static String toStringMelody(){
        return Arrays.toString(createMelody());
    }
}
