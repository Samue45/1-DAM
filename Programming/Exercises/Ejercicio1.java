package Programming.Exercises;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        //Bloque de instancias
        Scanner input = new Scanner(System.in);
        String message;
        int number = 0;

        //Petición de datos al usuario
        System.out.println("Introducza el número para calcular su valor absoluto");
        number = input.nextInt();

        //Intrucciones del algortimo
        if (number >= 0) {
            message = "El valor absoluto de |"+ number +"| es = " +  number;
        } else {
            number = -(number);
            message = "El valor absoluto de |-"+ number +"| es = " +  number;
        }
        //Solución
        System.out.println(message);
    }
}
