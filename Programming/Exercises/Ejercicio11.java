import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        
        //Bloque de instancias
        Scanner input = new Scanner(System.in);
        String figura;
        double PI = 3.14;
        double radioC, bR, hR;
        double areaC, areaR;
        String mensaje="";
        

        //Petición de datos
        System.out.println("Indica con 'C' = Círculo o 'R'= Rectángulo para calcular su área");
        figura = input.nextLine().toUpperCase();
        

        //Resolución del ejercicio 
    
         if (figura.equals("C")) { // Calculo del área de una circunferencia
            //Pedimos los datos necesarios
            System.out.println("Introduzca el radio de la circunferencia:");
            radioC = input.nextInt();

            //Calculamos el área
            areaC = PI * (radioC * radioC);

            //Damos una solución
            mensaje = "El área de la circunferencia es = " + areaC;
        } else if (figura.equals("R")) { // Calculo del área de un rectángulo
            //Pedimos los datos necesarios
            System.out.println("Introduzca la base del rectángulo:");
            bR = input.nextInt();
            System.out.println("Introduzca la altura del rectángulo:");
            hR = input.nextInt();

            //Calculamos el área
            areaR = bR * hR;
            
            //Damos una solución
            mensaje = "El área del rectángulo es = " + areaR;
        } else {
            System.out.println("No se puede calcular el área de dicha figura");
        }

        input.close();

        //Solución final
        System.out.println(mensaje);


    }
}
