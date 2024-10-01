package Programming.Theme1Exercises;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        
        //Bloque de instancias
        int startHour,startMinute, finalHour, finalMinute  = 0;
        int solutionHour, solutionMinute;
        Scanner input = new Scanner(System.in);
        String message;
        
        //Petición de datos
        System.out.println("Ingrese la hora de inicio");
        startHour = input.nextInt();
        System.out.println("Ingrese los minutos de inicio");
        startMinute = input.nextInt();

        System.out.println("Ingrese la hora de fin");
        finalHour = input.nextInt();
        System.out.println("Ingrese los minutos de fin");
        finalMinute = input.nextInt();

        //Intrucciones del algoritmo
        if (startHour > 24 || startMinute > 60 || finalHour > 24 || finalMinute > 60){
            message = "Los datos introducidos no son válidos :(";
        } else if (startHour < 0  || startMinute < 0 || finalHour < 0 || finalMinute  < 0) {
            message = "Los datos no pueden ser negativos";
        } else {
            solutionHour = finalHour - startHour;
            solutionMinute = finalMinute - startMinute;
            message = "La diferencia de tiempo entre ambas horas es de " + solutionHour +"h y "+ solutionMinute + "min" ;
        }

        //Solución
        System.out.println(message);

    }
}
