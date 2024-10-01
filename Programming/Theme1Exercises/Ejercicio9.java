package Programming.Theme1Exercises;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        //Bloque de instancias
        Scanner input = new Scanner(System.in);
        String message;
        double a, b, c;
        double solution1, solution2 ;
        double radicando;

        //Petición de datos al usuario
        System.out.println("Ingrese el valor de a ");
        a = input.nextFloat();
        System.out.println("Ingrese el valor de b ");
        b = input.nextFloat();
        System.out.println("Ingrese el valor de c ");
        c = input.nextFloat();

        //Intrucciones del algortimo

        // 1º Calculamos el radicando
        radicando = (b * b) - (4 * a * c);

        // 2º Respondemos ante las diferentes soluciones
        if (a == 0){
            message = "Error: No se puede dividir entre 0";
        } else if (radicando < 0) {
            message = "La solución son dos números complejos conjugados";
        }else {
            solution1 = (-b) + (Math.sqrt(radicando)/2 * a);
            solution2 = (-b) - (Math.sqrt(radicando)/2 * a);
            message = "El primer valor de x = " + solution1 + "\nEl segundo valor de x = " + solution2 ;
        }

        //Solución
        System.out.println(message);
    }
}
