package Programming.Unit2.ArrayList;


import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {


        Random random = new Random();
        ArrayList<Integer> enteros = new ArrayList<>();
        int cont = 0;
        do {
            enteros.add(random.nextInt(0,5));
            cont++;
        }while (cont < 10);

        System.out.println(enteros);
        Recursividad.sustituirIter(enteros,2,3);
        System.out.println(enteros);

    }
}
