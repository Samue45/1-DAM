package Programming.Unit2.Lambda.Ejercicios;

import java.lang.reflect.Array;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //==================================================EJERCICIO 1======================================================
        int[] arrayNumbers = {5,2,7,3,4,5,7,76,7,5,7,1,1,1,1,9};

        //Expresión lambda
        Ejer1 ejer1 = (a) -> {
            int sum = 0;
            for (int number: arrayNumbers){
                sum+= number;
            }
            return sum/ a.length;
        };

        //Clase anónima
        Ejer1 ejer12 = new Ejer1() {
            @Override
            public int cacularPromedio(int[] arrayNumbers) {
                int sum = 0;
                for (int number: arrayNumbers){
                    sum+= number;
                }
                return sum/ arrayNumbers.length;
            }
        };

        //Clase que implementa la interfaz
        ClaseEjer1 claseEjer1 = new ClaseEjer1();

        //==================================================EJERCICIO 2======================================================
       //Método abstracto que devuelve el factorial de un número
        Ejer2 ejer2 = (a) ->{
            int sum= 0;
            for (int i = 0; i <= a ; i++) {
                sum +=i;
            }
            return sum;
        };

        //==================================================EJERCICIO 3======================================================
        //Método abstracto que devuelve si un número es par
        Ejer3 ejer3 = (a) -> (a % 2) == 0;

        //==================================================EJERCICIO 4======================================================
        //Método abstracto que el número mayor
        Ejer4 ejer4 = (a) -> {
            Random random = new Random();
            int mayor = 0;

            //1º Buscar el mayor y guardarlo
            for (int number: a){
                if (number > mayor) mayor= number;
            }
            // 2º Retornar el mayor
            return mayor;

        };

        //==================================================EJERCICIO 5======================================================
        //Método abstracto que el número menor
        Ejer5 ejer5 = (a) -> {
            Random random = new Random();
            int menor = 0;

            //1º Buscar el mayor y guardarlo
            for (int number: a){
                if (number < menor) menor= number;
            }
            // 2º Retornar el mayor
            return menor;
        };

        //==================================================EJERCICIO 6======================================================
        //Método abstracto que devuelve el número que se repite más veces
        Ejer6 ejer6 = (a) -> {
            int contador= 0;
            int contadorMayor = 0;
            int numeroMasRepetido = 0;

            for (int number1 : a){
                for (int number2 : a){
                    if (number1 == number2) contador++;
                    //Guardamos el número de veces que aparece un número
                    //Comparamos su contador con el del siguiente número y siempre nos quedamos con el mayor y con el número
                    if (contador > contadorMayor){
                        contadorMayor = contador;
                        numeroMasRepetido = number2;
                    }
                    //Reiniciamos el contador
                    contador = 0;
                }
            }
            return numeroMasRepetido;
        };

    }
}
