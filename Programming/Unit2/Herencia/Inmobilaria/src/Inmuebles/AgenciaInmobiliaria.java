package Inmuebles;

import Inmuebles.HijosInmuebles.Construccion;
import Inmuebles.HijosInmuebles.HijosConstrucciones.LocalesComerciales;
import Inmuebles.HijosInmuebles.HijosConstrucciones.Vivienda;

import java.util.ArrayList;

public  class AgenciaInmobiliaria implements IAgencia, IAlquiler, IVenta {

    //Propiedades
    private ArrayList<Inmuebles> listaVentaInmuebles;
    private ArrayList<Inmuebles> listaAlquilerInmuebles;

    //Constructor
    public AgenciaInmobiliaria() {
        this.listaVentaInmuebles = new ArrayList<>();
        this.listaAlquilerInmuebles = new ArrayList<>();
    }


    // GETTER and SETTER
    public ArrayList<Inmuebles> getListaVentaInmuebles() {
        return listaVentaInmuebles;
    }

    public void setListaVentaInmuebles(ArrayList<Inmuebles> listaVentaInmuebles) {
        this.listaVentaInmuebles = listaVentaInmuebles;
    }

    public ArrayList<Inmuebles> getListaAlquilerInmuebles() {
        return listaAlquilerInmuebles;
    }

    public void setListaAlquilerInmuebles(ArrayList<Inmuebles> listaAlquilerInmuebles) {
        this.listaAlquilerInmuebles = listaAlquilerInmuebles;
    }

    //Métodos especiales

    //Muestra todos lo inmuebles que tengan un precio menor al que se pasa
    @Override
    public ArrayList<Inmuebles> inmueblesVentaMenores(double precio) {
        ArrayList<Inmuebles> inmueblesPrecioMenor = new ArrayList<>();

        for (Inmuebles inmuebles : listaVentaInmuebles){

            if (inmuebles instanceof Construccion construccion){
                addInmueblePrecioMenor(inmuebles,construccion,inmueblesPrecioMenor,precio);
            }
        }
        return inmueblesPrecioMenor;
    }

    private void addInmueblePrecioMenor(Inmuebles inmuebles,Construccion construccion, ArrayList<Inmuebles> inmueblesPrecioMenor, double precio){
        if (construccion instanceof LocalesComerciales localesComerciales){

            if (localesComerciales.getPrecioMetrosCuadrados() < precio) inmueblesPrecioMenor.add(inmuebles);

        } else if (construccion instanceof Vivienda vivienda) {

            if (vivienda.getPrecio() < precio) inmueblesPrecioMenor.add(inmuebles);
        }
    };


    //Añade un inmueble de venta a la lista de ventas
    @Override
    public String addVentaInmueble(Inmuebles inmueble) {
        return "";
    }

    //Devuelve el número de solares rústicos que están en venta
    @Override
    public int cacularSolaresRusticosEnVenta() {
        return 0;
    }


    //Muestra todos los locales comerciales de segunda mano con una superficie superior a la pasada por parámetro
    @Override
    public ArrayList<Inmuebles> localesSegundaMano(double superficie) {
        return null;
    }

    //Crea una agencia nueva fusionando el objeto Agencia que llama al método + la Agencia que se pasa por parámetro
    @Override
    public AgenciaInmobiliaria fusionarAgencias(AgenciaInmobiliaria agenciaInmobiliaria) {
        return null;
    }

    //Añade un inmueble de alquiler a la lista de alquileres
    @Override
    public String addAlquilerInmueble(Inmuebles inmueble) {
        return "";
    }
}
