package Inmuebles.Interfaces;

import Inmuebles.Inmuebles;

import java.util.ArrayList;

public interface IVenta {

    //Añade un inmueble de venta a la lista de ventas
    String addVentaInmueble(Inmuebles inmueble);

    //Devuelve el número de solares rústicos que están en venta
    int cacularSolaresRusticosEnVenta();

    //Muestra todos lo inmuebles que tengan un precio menor al que se pasa
    ArrayList<Inmuebles> inmueblesVentaMenores(double precio);
}
