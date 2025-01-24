package Inmuebles;

import Inmuebles.HijosInmuebles.HijosConstrucciones.Vivienda;
import Inmuebles.HijosInmuebles.HijosSuperficies.Solar;
import Inmuebles.HijosInmuebles.HijosSuperficies.Zona;
import Inmuebles.HijosInmuebles.TiposConstrucciones;

import java.util.ArrayList;

//Simulación de una base de datos
public class DAO {

    private static DAO dao = null;
    private ArrayList<Inmuebles> lista;

    private DAO(){
        lista = new ArrayList<>();
        rellenarBase(lista);
    }

    //Método para comprobar si existe ya una instancia de la clase DAO
    public static DAO getInstance(){
        if (dao == null) dao = new DAO();
        return dao;
    }
    //Método para acceder a la lista
    public ArrayList<Inmuebles> getLista(){
        return lista;
    }

    //Método para rellenar lista
    private void rellenarBase(ArrayList<Inmuebles> lista){
        lista.add(new Solar("Jerez",56.78, 0,12.78, Zona.RUSTICA));
        lista.add(new Vivienda("Cádiz",43,1, TiposConstrucciones.NUEVOS,12,5,2));
        lista.add(new Solar("Jaén",2.78, 2,23.78, Zona.URBANA));
        lista.add(new Vivienda("Huelva",20,3, TiposConstrucciones.SEGUNDA_MANO,45,3,1));
    }

    //Métodos CRUD

    //Obtener todos lo datos de la falsa base de datos
    public ArrayList<Inmuebles> selectALL(){
        return lista;
    }
}
