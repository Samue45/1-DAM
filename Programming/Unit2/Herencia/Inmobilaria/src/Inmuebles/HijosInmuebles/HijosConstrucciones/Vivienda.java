package Inmuebles.HijosInmuebles.HijosConstrucciones;

import Inmuebles.HijosInmuebles.Construccion;
import Inmuebles.HijosInmuebles.TiposConstrucciones;

public class Vivienda extends Construccion {

    private double precio;
    private int nHabitaciones;
    private int nPisos;


    public Vivienda(String ubicaion, double metrosCuadrados, TiposConstrucciones tiposConstrucciones, double precio, int nHabitaciones, int nPisos) {
        super(ubicaion, metrosCuadrados, tiposConstrucciones);
        this.precio = precio;
        this.nHabitaciones = nHabitaciones;
        this.nPisos = nPisos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getnHabitaciones() {
        return nHabitaciones;
    }

    public void setnHabitaciones(int nHabitaciones) {
        this.nHabitaciones = nHabitaciones;
    }

    public int getnPisos() {
        return nPisos;
    }

    public void setnPisos(int nPisos) {
        this.nPisos = nPisos;
    }

    @Override
    public String muestra(){
        return super.muestra() + "TIPO DE CONSTRUCCIÓN = Vivienda [ Precio = " + precio + " Nº Habitaciones = " + nHabitaciones + " Nº Pisos = " + nPisos + " ]" ;
    }
}
