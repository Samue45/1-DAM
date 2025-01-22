package Inmuebles.HijosInmuebles.HijosSuperficies;

import Inmuebles.HijosInmuebles.Superficie;

public class PlazaGaraje extends Superficie {
    private TipoGaraje tipoGaraje;


    public PlazaGaraje(String ubicaion, double metrosCuadrados, int id, double precioMetroCuadrado, TipoGaraje tipoGaraje) {
        super(ubicaion, metrosCuadrados, id, precioMetroCuadrado);
        this.tipoGaraje = tipoGaraje;
    }

    public TipoGaraje getTipoGaraje() {
        return tipoGaraje;
    }

    public void setTipoGaraje(TipoGaraje tipoGaraje) {
        this.tipoGaraje = tipoGaraje;
    }

    @Override
    public String muestra(){
        return super.muestra() +" TIPO -> Plaza de Garaje [" + " Tipo = " + tipoGaraje + "] ";
    }
}
