package Programming.Unit2.Herencia.Ejercicio4.Secciones;

import java.util.Date;
import java.util.Objects;

public abstract class Obras extends Sala {

    private String titulo;
    private int numeroInventario;
    private Artista artista;
    private Date fechaCreacion;

    //Constructor
    public Obras(String tematica, String titulo, int numeroInventario, Artista artista, Date fechaCreacion) {
        super(tematica);
        this.titulo = titulo;
        this.numeroInventario = numeroInventario;
        this.artista = artista;
        this.fechaCreacion = fechaCreacion;
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

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "Obras{" +
                "titulo='" + titulo + '\'' +
                ", numeroInventario=" + numeroInventario +
                ", artista=" + artista +
                ", fechaCreacion=" + fechaCreacion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Obras obras = (Obras) o;
        return numeroInventario == obras.numeroInventario && Objects.equals(titulo, obras.titulo) && Objects.equals(artista, obras.artista) && Objects.equals(fechaCreacion, obras.fechaCreacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), titulo, numeroInventario, artista, fechaCreacion);
    }
}
