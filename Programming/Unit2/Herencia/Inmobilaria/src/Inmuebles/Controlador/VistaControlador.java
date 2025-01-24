package Inmuebles.Controlador;

import java.util.Scanner;

public class VistaControlador {

    private Scanner input = new Scanner(System.in);

    public VistaControlador(){}

    public void escribir(String mensaje){
        System.out.println(mensaje);
    }

    public int menu(String  ...opciones){
        int opcion;

        do {
            for (int i = 0; i < opciones.length ; i++) {
                System.out.println(i + 1 + " - " + opciones[i]);
            }

            System.out.println("\n Elija la opción");
            opcion = input.nextInt();


        }while (opcion < 0 || opcion > opciones.length + 1);

        return opcion;
    }
}
