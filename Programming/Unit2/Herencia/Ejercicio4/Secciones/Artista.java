package Programming.Unit2.Herencia.Ejercicio4.Secciones;



public class Artista {

    private String nombre;
    private String ciudadOrigen;
    private int nacimiento;
    private int fallecimiento;

    //Constructor
    public Artista(String nombre, String ciudadOrigen, int nacimiento, int fallecimiento) {
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

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getFallecimiento() {
        return fallecimiento;
    }

    public void setFallecimiento(int fallecimiento) {
        this.fallecimiento = fallecimiento;
    }
}
