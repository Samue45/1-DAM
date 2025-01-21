package Inmuebles.HijosInmuebles.HijosConstrucciones;

import Inmuebles.HijosInmuebles.Construccion;
import Inmuebles.HijosInmuebles.TiposConstrucciones;

public class LocalesComerciales extends Construccion {

    private double precioMetrosCuadrados;


    public LocalesComerciales(String ubicaion, double metrosCuadrados, TiposConstrucciones tiposConstrucciones, double precioMetrosCuadrados) {
        super(ubicaion, metrosCuadrados, tiposConstrucciones);
        this.precioMetrosCuadrados = precioMetrosCuadrados;

    }

    public double getPrecioMetrosCuadrados() {
        return precioMetrosCuadrados;
    }

    public void setPrecioMetrosCuadrados(double precioMetrosCuadrados) {
        this.precioMetrosCuadrados = precioMetrosCuadrados;
    }

    @Override
    public String muestra(){
        return super.muestra() + "TIPO DE CONSTRUCCIÓN = Local Comercial [ Precio por m2 = " + precioMetrosCuadrados +" ]" ;
    }
}
