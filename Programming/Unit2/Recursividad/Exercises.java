package Programming.Unit2.Recursividad;

import java.util.ArrayList;

public class Exercises {

    //Crea un método que obtenga la suma de los números naturales desde 1 hasta N. Se debe pasar como parámetro el número N
    public static int sum(int number){
        if (number == 1){
            return 1;
        }else {
            return number + sum(number - 1);
        }
    }
    //Crea un método que imprima los dígitos desde 1 hasta N. Se debe pasar como parámetro el número N
    public static void imprimirNumbers(int n){
        //Caso base -> La llama recursiva termina cuando n deja de ser mayor a 0
       if (n > 0){
           imprimirNumbers(n - 1); // Caso recursivo -> Se va a quedar aquí suspendido hasta que n sea menor o igual a 0
           System.out.print(n + " "); // Cuando acaba la llamada recursiva regresa hacia atrás y ejecuta esta parte
       }
    }

    //Crea un método que imprima los dígitos desde N hasta 1. Se debe pasar como parámetro el número N
    // Caso base (N == 1) La llamada recursiva termina
    // Caso recursivo (N va disminuye de 1 en 1)
    public static void imprimirNumbers2(int n){
        if (n > 0){
            System.out.print(n + " ");
            imprimirNumbers2(n - 1);
        }
    }

    //Crea un método que obtenga la cantidad de dígitos de un número N. Se debe pasar como parámetro el número N
    public static int cantidadDigitos(int n, int indice){
        String number = String.valueOf(n);

        if (indice == number.length()){
            return 0;
        }else {
           return 1 + cantidadDigitos(n,indice + 1);
        }
    }

    //Crea un método que obtenga el factorial de un número N. Se debe pasar como parámetro el número N
    //¿Qué tiene que devolver el método? El factorial de un número
    // Caso base -> El número es == 0
    // Caso recursivo -> Ir decrementando el número y que a la vuelta sume todos los números
    // Resultado final -> El total de la suma de todos los números
    public static  int factorial (int number){
        if (number == 1){
            //Caso base = Cuando se rompe la llamada recursiva e inicializamos el factorial
            return 1;
        }else {
            //Llamada recursiva donde por cada nueva llamada se va restando 1 al número dado
            return number * factorial(number - 1 );
            // Al regresar se suman todos los números calculados
        }
    }

    //Crea un método que calcule el número de fibonacci a partir de un número pasado como parámetro
    // Fibonacci comienza con 0 y 1, luego se suman y dan 2 y después se le suma el siguiente, es decir, 2+3 = 5. Así consecutivamente
    // Parámetro = 90, debemos ir decrementando de modo que cuando termine la llamada recursiva empiece desde 0 y 1
    // Caso base = 0
    // Caso recursivo = Tenemos que sumar el 1º número y el siguiente a él
    public static int fibonacci (int number){
        if (number > 1){
            return fibonacci(number - 1) + fibonacci(number - 2);
            //1 + 0 = 2, 3 + 2 = 5, 6 + 5 = 11

        } else if (number == 1){
            return 1; // Se inicializa el 2º número
        }
        else {
            return 0; // Se inicializa el 1º número
        }
    }

    //Crear un método que obtenga el resultado de elevar un número a otro. Ambos números se deben pasar como parámetros
    // Parámetros = base, exponente
    // Caso base = Cuando el exponente sea 0, la base se inicializa a 1
    // Caso recursivo = Debido a que se hace al revés que en el caso iterativo
    // El exponente es el número de veces que la base se debe multiplicar así misma, por eso cuando el exponente llega a 0 se termina
    // la llamada recursiva e inicializamos a 1. De modo que al regresar haría esto: 2 * 1 = 2, 2 * 2 = 4(Vamos al revés)
    // - Vamos decrementando los números -1 hasta llegar al caso base y cuando regrese hacia atrás hará la operación
    public static int upperNumber(int base, int exponente){
        if (exponente == 0){
            return 1; // Caso base: Se inicializa el valor inicial de la variable base
        }else {
            return  base * upperNumber(base,exponente - 1);
            //Caso recursivo: Vamos decrementando el exponente para avanzar y multiplicando la base por sí misma
        }
    }

    //EJERCICIOS DE CLASE
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
