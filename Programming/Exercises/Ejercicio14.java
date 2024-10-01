package Programming.Exercises;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        //Bloque de instancias
        Scanner input = new Scanner(System.in);
        String message ="";
        double timeWork, salary = 0;

        //Petición de datos
        System.err.println("Indique cuantas horas ha trabajado:");
        timeWork = input.nextDouble();

        //Intrucciones
        if (timeWork <= 0){
            message = "ERROR: Datos no válidos ";
        }
        if (timeWork <= 40){
            salary += 16;
            message = "Su salario es = " + salary;
        }
        if (timeWork > 40){
            salary = (timeWork - 40) * 20;
            message = "Su salario es = " + salary;
        }

        //Solución
        System.out.println(message);

    }
}
