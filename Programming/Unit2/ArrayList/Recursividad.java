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
    public static int sucesionFibonacci(int number){
        if (number == 0) {
            return 0; // Primer número de Fibonacci
        } else if (number == 1) {
            return 1; // Segundo número de Fibonacci
        } else {
            return sucesionFibonacci(number - 1) + sucesionFibonacci(number - 2); // Suma de los dos anteriores
        }
    }
    public static int sumRec(int numb){
        if (numb > 0){
            return numb + sumRec(numb - 1);
        }else {
            return 0;
        }
    }
    public static int potenciaRec(int a, int b){
        if (b == 0){
            return 1;
        }
        else{
            return a * potenciaRec(a, b-1);
        }
    }
}
