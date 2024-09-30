package Programming.Exercises;

import javax.swing.*;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        //Bloque de instancias
        double base, altura, area = 0;
        Scanner input = new Scanner(System.in);
        String message;

        //Petición de datos
        System.err.println("Ingresa la base del triángulo");
        base = input.nextDouble();
        System.err.println("Ingresa la altura del triángulo");
        altura = input.nextDouble();


        //Instrucciones del algoritmo
        if (base < 0 || altura < 0){
            message = "Los datos no son válidos :(";
        }else {
            area = (base * altura) / 2;
            message = "El área del triángulo es = " + area;
        }

        //Solución
        System.out.println(message);



    }
}
