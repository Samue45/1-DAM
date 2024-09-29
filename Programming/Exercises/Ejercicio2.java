package Programming.Exercises;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        //Bloque de instancias
        Scanner input = new Scanner(System.in);
        int age = 0;
        int numberPulsations= 0;
        int MAX_PULSACIONES = 220;
        int TIME_PULSACIONES = 6;
        String message;

        //Petición de datos al usuario
        System.out.println("Introduce tu edad para saber tu número de pulsaciones recomendado:");
        age = input.nextInt();

        //Intrucciones del algortimo
        if (age > 0 && age < 99){
            numberPulsations = (MAX_PULSACIONES - age) / TIME_PULSACIONES;
            message = "Tu número de pulsaciones debe ser = " +  numberPulsations + " pulsaciones por segundo";
        }else{
            message = "El dato introducido no es válido";
        }

        //Solución
        System.out.println(message);
    }
}
