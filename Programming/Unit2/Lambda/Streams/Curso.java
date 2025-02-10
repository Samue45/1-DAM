package Programming.Unit2.Lambda.Streams;

import java.util.ArrayList;

public class Curso {

    private int duracion;
    private int cantidadVideos;
    private String titulo;
    private ArrayList<Persona> listaAlumnos;

    public Curso(String titulo, int duracion, int cantidadVideos, ArrayList<Persona> listaAlumnos) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.cantidadVideos = cantidadVideos;
        this.listaAlumnos = listaAlumnos;
    }

    public Curso() {}

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public ArrayList<Persona> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<Persona> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantidadVideos() {
        return cantidadVideos;
    }

    public void setCantidadVideos(int cantidadVideos) {
        this.cantidadVideos = cantidadVideos;
    }
}
