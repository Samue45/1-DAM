package Programming.Exercises;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        //Bloque de instancias
        Scanner input = new Scanner(System.in);
        String message;
        float number1, number2, solution = 0F;

        //Petición de datos al usuario
        System.out.println("Ingrese el valor de A:");
        number1 = input.nextFloat();
        System.out.println("Ingrese el valor de B:");
        number2 = input.nextFloat();

        //Intrucciones del algortimo
        if (number1 > number2 ){
            solution = number1 + number2;
            message = "La solución es " + solution + "(A > B)";
        }else if (number1 < number2){
            solution = number1 * number2;
            message = "La solución es " + solution + "(A < B)";
        }else {
            message ="Ambos números son iguales por lo que no se cumple ninguna condición";
        }

        //Solución
        System.out.println(message);
    }
}
