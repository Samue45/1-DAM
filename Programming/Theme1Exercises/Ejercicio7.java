package Programming.Theme1Exercises;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        //Bloque de instancias
        Scanner input = new Scanner(System.in);
        String message= "";
        float callTime,callCost  = 0F;
        float PRECIO_1= 10F;
        float PRECIO_2= 5F;

        //Petición de datos al usuario
        System.out.println("Indique la cantidad de minutos de su llamada : ");
        callTime = input.nextFloat();

        //Intrucciones del algortimo
        if (callTime > 0 ){
            callCost = PRECIO_1;
            message = "Su saldo a cobrar por la llamada es de " + callCost + " céntimos";
            if (callTime > 3){
                callCost = PRECIO_1 + (callTime - 3) * PRECIO_2;
                message = "Su saldo a cobrar por la llamada es de " + callCost + " céntimos";
            }

        }else {
            message = "Error, dato no válido :(";
        }

        //Solución
        System.out.println(message);
    }
}
