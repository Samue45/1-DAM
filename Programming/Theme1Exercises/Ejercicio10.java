package Programming.Theme1Exercises;
import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        //Bloque de instancias
        Scanner input = new Scanner(System.in);
        int number1 = 0;
        String mensaje ="", mensajeError ="";


        //Petición de datos
        System.out.println("Ingrese el día de la semana:");
        number1 = input.nextInt();
        input.close();

        //Resolución del ejercicio
        switch (number1) {
            case 1:
                mensaje = "Lunes";
                break;
            case 2:
                mensaje = "Martes";
                break;
            case 3:
                mensaje = "Miércoles";
                break;
            case 4:
                mensaje = "Jueves";
                break;
            case 5:
                mensaje = "Viernes";
                break;
            case 6:
                mensaje = "Sábado";
                break;
            case 7:
                mensaje = "Domingo";
                break;
        
            default:
            mensajeError = "Error: valor fuera de rango";
            System.out.println(mensajeError);
                break;
        }

        //Solución
        System.out.println("El número " + number1 + " = " + mensaje);
    }
    



}
