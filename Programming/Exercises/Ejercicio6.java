package Programming.Exercises;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        //Bloque de instancias
        Scanner input = new Scanner(System.in);
        String message;
        float moneyGine, moneyTrauma, moneyPedi = 0F;
        float anualSalary = 0F;

        //Petición de datos al usuario
        System.out.println("Ingrese el presupuesto anual del hospital: ");
        anualSalary = input.nextFloat();

        //Intrucciones del algortimo
        if (anualSalary < 0 ){
            message = "El dato ingresado no es válido :(";
        }else {
            moneyGine = anualSalary * 0.4F;
            moneyTrauma = anualSalary * 0.3F;
            moneyPedi = anualSalary * 0.3F;

            message = "El dinero será repartido de la siguiente manera :" + "\n Ginecólogo = " + moneyGine + "%" + "\n Traumatólogo = " + moneyTrauma+ "%" + "\n Pediatría = " + moneyPedi+ "%" ;
        }
        //Solución
        System.out.println(message);
    }
}
