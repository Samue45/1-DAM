package Programming.Unit2.Herencia.Ejercicio4.Secciones.Objetos;

import Programming.Unit2.Herencia.Ejercicio4.Secciones.Artista;
import Programming.Unit2.Herencia.Ejercicio4.Secciones.Fecha;
import Programming.Unit2.Herencia.Ejercicio4.Secciones.Obras;

import java.util.Date;

public class Pintura extends Obras {

    private Dimensiones dimensiones;
    private String soporte;

    //Constructor


    public Pintura(String titulo, int numeroInventario, Artista artista, Fecha fechaCreacion, Dimensiones dimensiones, String soporte) {
        super(titulo, numeroInventario, artista, fechaCreacion);
        this.dimensiones = dimensiones;
        this.soporte = soporte;
    }

    //GETTER and SETTER
    public Dimensiones getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimensiones dimensiones) {
        this.dimensiones = dimensiones;
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }


}
