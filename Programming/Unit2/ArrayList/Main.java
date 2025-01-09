package Programming.Unit2.ArrayList;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);

        Recursividad.sumarRec(lista, lista.size()-1);

        Random random = new Random();

        Recursividad.generarTiradas(random.nextInt(0,6));
    }
}
