package Inmuebles.Interfaces;

import Inmuebles.Interfaces.Cimientos.AgenciaInmobiliaria;
import Inmuebles.Interfaces.Cimientos.Inmuebles;

import java.util.ArrayList;

public interface IAgencia {

    //Muestra todos los locales comerciales de segunda mano con una superficie superior a la pasada por parámetro
    ArrayList<Inmuebles> localesSegundaMano(double superficie);

    //Crea una agencia nueva fusionando el objeto Agencia que llama al método + la Agencia que se pasa por parámetro
    AgenciaInmobiliaria fusionarAgencias(AgenciaInmobiliaria agenciaInmobiliaria);
}
