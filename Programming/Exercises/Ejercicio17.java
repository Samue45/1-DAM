package Programming.Exercises;

import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {

        //Bloque de instancias
        Scanner input = new Scanner(System.in);
        String message = "";
        int temperature = 0;

        //Petición de datos
        System.out.println("Descubre qué deporte realizar en función de la temperatura ambiental");
        System.out.println("Indica la temperatura(ºF)");
        temperature = input.nextInt();

        //Instrucciones
        if (temperature <=10){
            message ="Es recomendable hacer deporte de interior";
        } else if (temperature > 10 && temperature <= 32) {
            message = "Es recomendable hacer Esquí";
        } else if (temperature > 32 && temperature <= 70) {
            message = "Es recomendable hacer Golf";
        } else if (temperature > 70 && temperature <= 85) {
            message = "Es recomendable hacer Tenis";
        } else if (temperature > 85) {
            message = "Es recomendable hacer Natación";
        }else {
            message = "ERROR: Dato no válido :(";
        }

        //Solución
        System.out.println(message);

    }
}
