package Programming.PracticeExercises.Exam2;

import java.util.Scanner;

public class Exercise3 {

    public void appCoche() {
        //Propiedades
        Scanner input = new Scanner(System.in);
        String answer = "";

        String matricula, matriculaMasUsada= "", matriculaMasRentable="";
        double precioAlquiler, Km, mejorAlquiler = 0;
        int contadorClientes, dias, sumDia = 0, diaInicial = 0, menoresClientes = 0;

        //Empezamos el bucle
        while (!answer.equalsIgnoreCase("salir")) {
            //Pedimos los datos al usuario
            System.out.println("Ingresa los siguientes datos:");
            System.out.println("Matrícula:");
            matricula = input.next();
            System.out.println("Precio del alquiler por día");
            precioAlquiler = input.nextDouble();
            System.out.println("Número de clientes");
            contadorClientes = input.nextInt();

            //Datos por cada cliente
            for (int i = 0; i < contadorClientes; i++) {
                System.out.println("Km:");
                Km = input.nextDouble();

                System.out.println("Días alquilado");
                dias = input.nextInt();

                //Todos los días que ha sido alquilado
                sumDia += dias;
            }

            //Matrícula del coche más barato
            boolean start = true;
            if (start) {
                mejorAlquiler = precioAlquiler;
                start = false;
            }
            if (precioAlquiler < mejorAlquiler) {
                mejorAlquiler = precioAlquiler;
                matriculaMasRentable = matricula;
            }

            //Coche más veces alquilado
            boolean start1 = true;
            if (start1) {
                diaInicial = sumDia;
                start1 = false;
            }
            if (diaInicial < sumDia) {
                diaInicial = sumDia;
                matriculaMasUsada = matricula;
            }

            //Km de menor número de clientes
            boolean start2 = true;
            if (start2) {
                menoresClientes = contadorClientes;
                start2 = false;
            }
            if (contadorClientes < menoresClientes) {
                menoresClientes = contadorClientes;
            }

            System.out.println("Desea continuar");
            answer = input.next();
        }

        System.out.println("Km del coche con menos clientes: " + menoresClientes);
        System.out.println("Matrícula del coche más alquilado: " + matriculaMasUsada );
        System.out.println("Matrícula del coche más barato: " + matriculaMasRentable);
    }
}
