package Programming.Theme1Exercises;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //Bloque de instancias
        Scanner input = new Scanner(System.in);
        String message;
        double cat1, cat2, sumcatetos = 0;
        double hipo = 0;

        //Petición de datos al usuario
        System.out.println("Introduzca el 1º cateto");
        cat1 = input.nextFloat();
        System.out.println("Introduzca el 2º cateto");
        cat2 = input.nextFloat();


        //Intrucciones del algortimo
        sumcatetos = Math.pow(cat1,2) + Math.pow(cat2,2) ;
        hipo = Math.sqrt(sumcatetos);
        message = "La hipotenusa del triángulo es = " + hipo;

        //Solución
        System.out.println(message);


    }
}
