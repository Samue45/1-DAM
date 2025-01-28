package Programming.Unit2.Lambda.Ejercicios;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        //==================================================EJERCICIO 1======================================================
        int[] arrayNumbers = {1,2,3,4,5,6,7,5};

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
        claseEjer1.cacularPromedio(arrayNumbers);

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
    }
}
