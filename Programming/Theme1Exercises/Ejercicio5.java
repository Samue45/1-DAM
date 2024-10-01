package Programming.Theme1Exercises;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        //Bloque de instancias
        Scanner input = new Scanner(System.in);
        String message;
        double oldSalary, newSalary = 0;
        double INCREMENTO = 0.25;

        //Petición de datos al usuario
        System.out.println("Indique su salario actual: ");
        oldSalary = input.nextDouble();

        //Intrucciones del algortimo
        if (oldSalary <= 0){
            message = "El dato que ha ingresado no es válido";
        }else {
            newSalary = oldSalary + (oldSalary * INCREMENTO);
            message = "Su salario actual ha sido incrementado en un 0,25% por lo tanto sería " + newSalary + " €";
        }

        //Solución
        System.out.println(message);
    }
}
