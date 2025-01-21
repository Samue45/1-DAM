package Inmuebles.HijosInmuebles.HijosSuperficies;

import Inmuebles.HijosInmuebles.Superficie;

public class Solar extends Superficie {

    private Zona zona;


    public Solar(String ubicaion, double metrosCuadrados, double precioMetroCuadrado, Zona zona) {
        super(ubicaion, metrosCuadrados, precioMetroCuadrado);
        this.zona = zona;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    @Override
    public String muestra() {
        return super.muestra() + " TIPO -> Solar [" + " Zona = " + zona + "] ";
    }
}

