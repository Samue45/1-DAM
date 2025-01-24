package Inmuebles.HijosInmuebles;

import Inmuebles.Interfaces.Cimientos.Inmuebles;

public abstract class Superficie extends Inmuebles {

    private double precioMetroCuadrado;


    public Superficie(String ubicaion, double metrosCuadrados,int id, double precioMetroCuadrado) {
        super(ubicaion, metrosCuadrados,id);
        this.precioMetroCuadrado = precioMetroCuadrado;
    }

    public double getPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }

    public void setPrecioMetroCuadrado(double precioMetroCuadrado) {
        this.precioMetroCuadrado = precioMetroCuadrado;
    }

    // Calcular cuanto vale una superficie por cada m2
    double calcularPrecioSuperficie(){
        return precioMetroCuadrado * precioMetroCuadrado;
    }

   @Override
    public String muestra(){
        return super.muestra() + "Superficie [" + "precioMetroCuadrado = " + precioMetroCuadrado;
    }

}
