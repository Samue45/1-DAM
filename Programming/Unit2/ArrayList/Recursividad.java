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

    //Versión iterativa de un método que sustituye valores viejos por nuevos
    public static void sustituirIter(ArrayList<Integer>  lista, int viejo, int nuevo) {

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) == viejo) lista.set(i, nuevo);
        }
    }

    //Método que retorne un boolean que compruebe si hay dos números consecutivos
    public static boolean existenConsecutivos(ArrayList<Integer> lista , int indice){
        if (lista.size() == indice){
            //Si lo recorre entero y no hay dos números iguales consecutivos devuelve false y termina
            return false;
        } else if (pertenece(lista,indice, lista.get(indice))){
            //Si lo recorre entero y  hay dos números iguales consecutivos devuelve true y termina
            return true;
        }else {
            // Avanza hasta que termine de recorrer el ArraList o se cumpla la condición
           return existenConsecutivos(lista,indice + 1);
        }
    }

    private static boolean pertenece(ArrayList<Integer> lista, int indice, int number){
        if (lista.size() == indice){
            return false;
        } else if (lista.get(indice) == number) {
            return true;
        }else {
           return pertenece(lista,indice + 1,number);
        }
    }

    //Método que haga la media de una lista de números
    public static float media(ArrayList<Integer> lista , int indice, int suma){
        if (indice == lista.size()) {
            // Una vez que hemos procesado toda la lista, devolvemos la media
            return (float) suma / lista.size();
        } else {
            // Sumamos el valor actual y continuamos con la recursión
            suma += lista.get(indice);
            return media(lista, indice + 1, suma);
        }
    }

}
