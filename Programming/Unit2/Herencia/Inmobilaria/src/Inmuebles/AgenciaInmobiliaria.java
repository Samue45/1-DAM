package Inmuebles;

import Inmuebles.HijosInmuebles.HijosConstrucciones.LocalesComerciales;
import Inmuebles.HijosInmuebles.HijosConstrucciones.Vivienda;
import Inmuebles.HijosInmuebles.HijosSuperficies.Solar;
import Inmuebles.HijosInmuebles.HijosSuperficies.Zona;
import Inmuebles.HijosInmuebles.TiposConstrucciones;

import java.util.ArrayList;

public  class AgenciaInmobiliaria implements IAgencia, IAlquiler, IVenta {

    //Propiedades
    private ArrayList<Inmuebles> listaVentaInmuebles;
    private ArrayList<Inmuebles> listaAlquilerInmuebles;


    //Constructor
    public AgenciaInmobiliaria() {
        this.listaVentaInmuebles = DAO.getInstance().selectALL();
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
            addInmueblePrecioMenor(inmuebles,inmueblesPrecioMenor,precio);
        }
        return inmueblesPrecioMenor;
    }

    private void addInmueblePrecioMenor(Inmuebles inmuebles, ArrayList<Inmuebles> inmueblesPrecioMenor, double precio){
        if (inmuebles instanceof LocalesComerciales localesComerciales) {
            if (localesComerciales.getPrecioMetrosCuadrados() < precio) inmueblesPrecioMenor.add(inmuebles);
        } else if (inmuebles instanceof Vivienda vivienda) {
            if (vivienda.getPrecio() < precio) inmueblesPrecioMenor.add(inmuebles);
        }

    }

    //Añade un inmueble de venta a la lista de ventas
    @Override
    public String addVentaInmueble(Inmuebles inmueble) {
        boolean existeVenta = listaVentaInmuebles.contains(inmueble);
        String mensaje = "ERROR :(, ya existe el inmueble";
        if (!existeVenta) {
            listaVentaInmuebles.add(inmueble);
            mensaje = "Se ha añadido el inmueble exitosamente a la lista de venta";
        }

        return mensaje;
    }

    //Devuelve el número de solares rústicos que están en venta
    @Override
    public int cacularSolaresRusticosEnVenta() {
        int contador = 0;

        //Recorremos la lista de inmuebles en venta e incrementamos el contador
        // cada ver que encontremos una instancia de Solar y sea una Zona Rústica
        for (Inmuebles inmueble: listaVentaInmuebles){
            if (inmueble instanceof Solar solar){
                {if (solar.getZona() == Zona.RUSTICA) contador++;}
            }
        }
        return contador;
    }

    //Muestra todos los locales comerciales de segunda mano con una superficie superior a la pasada por parámetro
    @Override
    public ArrayList<Inmuebles> localesSegundaMano(double superficie) {
       ArrayList<Inmuebles> listaLocalesSegundaMano = new ArrayList<>();

       for (Inmuebles inmuebles: listaVentaInmuebles){
           addLocalSegundaMano(inmuebles, listaLocalesSegundaMano, superficie);
       }
       for (Inmuebles inmuebles: listaAlquilerInmuebles){
           addLocalSegundaMano(inmuebles, listaLocalesSegundaMano, superficie);
        }

        return listaLocalesSegundaMano;
    }

    private void addLocalSegundaMano(Inmuebles inmuebles, ArrayList<Inmuebles> listaLocalesSegundaMano, double superficie){

        if (inmuebles instanceof LocalesComerciales localesComerciales){
            if (localesComerciales.getTiposConstrucciones() == TiposConstrucciones.SEGUNDA_MANO && inmuebles.getMetrosCuadrados() > superficie){
                    listaLocalesSegundaMano.add(inmuebles);
            }
        }

    }

    //Añade un inmueble de alquiler a la lista de alquileres
    @Override
    public String addAlquilerInmueble(Inmuebles inmueble) {
        boolean existeVenta = listaAlquilerInmuebles.contains(inmueble);
        String mensaje = "ERROR :(, ya existe el inmueble";
        if (!existeVenta) {
            listaAlquilerInmuebles.add(inmueble);
            mensaje = "Se ha añadido el inmueble exitosamente a la lista de alquiler";
        }

        return mensaje;
    }


    //Crea una agencia nueva fusionando el objeto Agencia que llama al método + la Agencia que se pasa por parámetro
    @Override
    public AgenciaInmobiliaria fusionarAgencias(AgenciaInmobiliaria agenciaInmobiliaria) {
        listaAlquilerInmuebles.addAll(agenciaInmobiliaria.getListaAlquilerInmuebles());
        listaVentaInmuebles.addAll(agenciaInmobiliaria.getListaVentaInmuebles());

        return this;
    }
}
