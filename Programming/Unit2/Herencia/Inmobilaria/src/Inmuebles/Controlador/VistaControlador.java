package Inmuebles.Controlador;

import java.util.Scanner;

public class VistaControlador {

    private Scanner input = new Scanner(System.in);

    public VistaControlador(){}

    public void escribir(String mensaje){
        System.out.println(mensaje);
    }

    public void introducirValor(){
        System.out.println("Ingrese el valor");

        String valor = input.nextLine();
    }
}
