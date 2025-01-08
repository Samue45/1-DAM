package Programming.Unit2.ArrayList;

import java.util.ArrayList;

public class Recursividad {

    public static void mostrarRec (ArrayList<String > lista, int indice){
        if(indice >= 0){
            System.out.println(lista.get(indice));
            mostrarRec(lista, indice-1);
        }
    }
    public static void sumarRec (ArrayList<Integer> lista, int indice){
        if(indice >= 0){
            if (lista.get(indice) % 2 == 0){
                System.out.println(lista.get(indice));
            }
            sumarRec(lista, indice-1);
        }
    }
}
