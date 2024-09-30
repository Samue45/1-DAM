package Programming.Exercises;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        //Bloque de instancias
        Scanner input = new Scanner(System.in);
        String message;
        double timeWork, salary = 0;

        //Petición de datos
        System.out.println("Indique cuantas horas ha trabajado:");
        timeWork = input.nextDouble();

        //Intrucciones
        if (timeWork <= 0){
            message = "ERROR: Datos no válidos ";
        } else {
            if (timeWork <= 40){
                salary += 16;
                if (timeWork > 40){

                }
            }
        }
    }
}
