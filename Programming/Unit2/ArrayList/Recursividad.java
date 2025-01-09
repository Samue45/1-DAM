package Programming.Unit2.ArrayList;

import java.util.ArrayList;
import java.util.Random;


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
    public static int contarPositivos(ArrayList<Integer> lista, int indice){
        if( indice == lista.size()) {
            return 0;
        }else if ( lista.get(indice) > 0){
            return 1 + contarPositivos(lista, indice + 1);
        }else {
            return contarPositivos(lista, indice + 1);
        }

    }


    public static ArrayList<Integer> generarTiradas (){
        int random = (int) (Math.random() * 6.99);

        if (random == 0){
            return new ArrayList<Integer>();
        } else {
            //Cada vez que se hace la llamada recursiva se queda parado esperando y cuando finalmente random es 0 a la variable lista se le asigna la instancia de un ArrayList
            ArrayList<Integer> lista = generarTiradas();
            //Cuanto vaya hacia atrás se ejecutará esta parte del código, debido a que ya no se queda colgado
            lista.add(random);
            return lista;
        }
    }

    public static int sustituirRec(ArrayList<Integer>  lista, int indice , int viejo, int nuevo){
        if( indice == lista.size()) {
            return nuevo;
        }else if ( lista.get(indice) == viejo){
            int number = sustituirRec(lista, indice + 1, viejo, nuevo);
            return lista.set(indice,number);
        }else {
            return sustituirRec(lista, indice + 1, viejo, nuevo);
        }

    }

    //Versión iterativa de un método que sustituye valores viejos por nuevos
    public static ArrayList<Integer> sustituirIter(ArrayList<Integer>  lista, int viejo, int nuevo){

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == viejo) lista.set(i,nuevo);
        }
        return lista;
    }
}
