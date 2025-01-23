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
        vistaControlador.escribir("Hola, bienvenido");
        do {






        }while (!salir);

    }



}
