package Inmuebles.HijosInmuebles;

import Inmuebles.Inmuebles;

public abstract class Superficie extends Inmuebles {

    private double precioMetroCuadrado;

    public Superficie(String ubicaion, double metrosCuadrados, double precioMetroCuadrado) {
        super(ubicaion, metrosCuadrados);
        this.precioMetroCuadrado = precioMetroCuadrado;
    }

    public double getPrecioMetroCuadrado() {
        return precioMetroCuadrado;
    }

    public void setPrecioMetroCuadrado(double precioMetroCuadrado) {
        this.precioMetroCuadrado = precioMetroCuadrado;
    }

   @Override
    public String muestra(){
        return super.muestra() + "Superficie [" + "precioMetroCuadrado = " + precioMetroCuadrado;
    }

}
