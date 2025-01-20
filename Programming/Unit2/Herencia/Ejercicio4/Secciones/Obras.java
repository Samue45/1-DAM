package Programming.Unit2.Herencia.Ejercicio4.Secciones;

import Programming.Unit2.Herencia.Ejercicio4.CatalogoMuseo;

import java.util.Date;
import java.util.Objects;

public  class Obras extends CatalogoMuseo {

    private String titulo;
    private int numeroInventario;
    private Artista artista;
    private Fecha fecha;

    //Constructor

    public Obras(String titulo, int numeroInventario, Artista artista, Fecha fecha) {
        super();
        this.titulo = titulo;
        this.numeroInventario = numeroInventario;
        this.artista = artista;
        this.fecha = fecha;
    }

    //GETTER and SETTER
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroInventario() {
        return numeroInventario;
    }

    public void setNumeroInventario(int numeroInventario) {
        this.numeroInventario = numeroInventario;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public Fecha getFechaCreacion() {
        return fecha;
    }

    public void setFechaCreacion(Fecha fechaCreacion) {
        this.fecha = fechaCreacion;
    }

    @Override
    public String toString() {
        return "\nObra {" +
                "Título ='" + titulo + '\'' +
                ", NumeroInventario =" + numeroInventario +
                ", Artista =" + artista +
                ", Fecha de Creación =" + fecha +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Obras obras = (Obras) o;
        return numeroInventario == obras.numeroInventario && Objects.equals(titulo, obras.titulo) && Objects.equals(artista, obras.artista) && Objects.equals(fecha, obras.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), titulo, numeroInventario, artista, fecha);
    }
}
