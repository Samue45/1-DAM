package Programming.Unit2.Herencia.Ejercicio4.Secciones.Objetos;

import Programming.Unit2.Herencia.Ejercicio4.Secciones.Artista;
import Programming.Unit2.Herencia.Ejercicio4.Secciones.Obras;

import java.util.Date;

public class Escultura extends Obras {

    private String material;
    private double altura;

    //Constructor
    public Escultura(String tematica, String titulo, int numeroInventario, Artista artista, Date fechaCreacion, String material, double altura) {
        super(tematica, titulo, numeroInventario, artista, fechaCreacion);
        this.material = material;
        this.altura = altura;
    }

    //GETTER and SETTER
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String muestra() {
        return "";
    }
}
