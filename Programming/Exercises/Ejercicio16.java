package Programming.Exercises;

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {

        //Bloque de instancias
        Scanner input = new Scanner(System.in);
        String message = "", answer = "";
        int counter = 0;

        //Petición de datos e intrucciones
        System.out.println("¡Bienvenido a CulturePlay! \n Descubre cuanto sabes de cultura (Responde con SI o NO)");

        System.out.println("¿Colón descubrió América?");
        answer = input.nextLine().toUpperCase();

        if (answer.equals("YES")){
            System.out.println("¿Es París capital de Bélgica?");
            answer = input.nextLine().toUpperCase();

            if (answer.equals("NO")) {
                System.out.println("¿Los Beatles era un grupo de rock americano?");
                answer = input.nextLine().toUpperCase();

                if (answer.equals("NO")){
                    message ="¡FELICIDADES! Has acertado todas las preguntas";
                }else if (answer.equals("YES")) {
                    message = "Lo siento mucho :(, su respuesta es incorrecta";

                }else {
                    message = "ERROR: Dato no válido";
                }
            }else if (answer.equals("YES")) {
                message = "Lo siento mucho :(, su respuesta es incorrecta";

            }else {
                message = "ERROR: Dato no válido";
            }

        } else if (answer.equals("NO")) {
            message = "Lo siento mucho :(, su respuesta es incorrecta";

        }else {
            message = "ERROR: Dato no válido";
        }

        //Solución
        System.out.println(message);

    }
}
