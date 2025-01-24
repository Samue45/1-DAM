package Inmuebles.Controlador;

import Inmuebles.AgenciaInmobiliaria;

public class Controlador {
    private AgenciaInmobiliaria agencia;
    private VistaControlador vistaControlador;

    public Controlador(){
        agencia = new AgenciaInmobiliaria();
        vistaControlador = new VistaControlador();
    }

    //Aquí se ejecuta nuestra app
    public void ejecutar(){

        boolean salir = false;
        int opcion;
        vistaControlador.escribir("Hola, bienvenido");
        do {
            opcion = vistaControlador.menu("Introducir","Mostrar","Segunda Mano","Fusionar", "Salir");

            switch (opcion){
                case 1:
                    System.out.println("Caso 1");
                    break;
                case 2:
                    System.out.println("Caso 2");
                    break;
                case 3:
                    System.out.println("Caso 3");
                    break;
                case 4:
                    System.out.println("Caso 4");
                    break;
                case 5:
                    System.out.println("Caso 5");
                    salir = true;
                    break;
            }

        }while (!salir);

    }



}
