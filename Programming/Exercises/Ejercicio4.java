package Programming.Exercises;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        //Bloque de instancias
        Scanner input = new Scanner(System.in);
        String message;
        int numberMen, numberWomen = 0;
        int porcentajeMen, porcentajeWomen = 0;
        int totalStudents = 0;


        //Petición de datos al usuario
        System.out.println("Ingrese el número de hombres: ");
        numberMen = input.nextInt();
        System.out.println("Ingrese el número de mujeres: ");
        numberWomen = input.nextInt();

        //Intrucciones del algortimo
        if (numberMen < 0 || numberWomen < 0){
            message = "No puede haber 0 hombres y 0 mujeres";
        }else {
            totalStudents = numberMen + numberWomen;
            porcentajeMen = numberMen * (totalStudents/100);
            porcentajeWomen = numberWomen * (totalStudents/100);

            message = "El total de estudiantes es = " + totalStudents + "\n Hombres = " + porcentajeMen + "%"+ "\n Mujeres = " + porcentajeWomen+ "%";
        }

        //Solución
        System.out.println(message);
    }
}
