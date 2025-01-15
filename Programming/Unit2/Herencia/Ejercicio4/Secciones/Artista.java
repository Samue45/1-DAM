package Programming.Unit2.Herencia.Ejercicio4.Secciones;


import java.util.Date;

public class Artista {

    private String nombre;
    private String ciudadOrigen;
    private Date nacimiento;
    private Date fallecimiento;

    //Constructor
    public Artista(String nombre, String ciudadOrigen, Date nacimiento, Date fallecimiento) {
        this.nombre = nombre;
        this.ciudadOrigen = ciudadOrigen;
        this.nacimiento = nacimiento;
        this.fallecimiento = fallecimiento;
    }

    //GETTER and SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Date getFallecimiento() {
        return fallecimiento;
    }

    public void setFallecimiento(Date fallecimiento) {
        this.fallecimiento = fallecimiento;
    }
}
