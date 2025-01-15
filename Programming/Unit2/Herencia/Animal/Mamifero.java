package Programming.Unit2.Herencia.Animal;

public abstract class Mamifero extends Animal {
    // Propiedades (atributos) de la clase Mamífero
    private int edad;
    private boolean tienePelo;
    private boolean tieneGlándulasMamarias;
    private boolean esViviparo;

    // Constructor de la clase
    public Mamifero(String nombre, int edad, boolean tienePelo, boolean tieneGlándulasMamarias, boolean esViviparo) {
        super.nombre = nombre;
        this.edad = edad;
        this.tienePelo = tienePelo;
        this.tieneGlándulasMamarias = tieneGlándulasMamarias;
        this.esViviparo = esViviparo;
    }



    // Métodos para acceder a las propiedades (getters y setters)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean tienePelo() {
        return tienePelo;
    }

    public void setTienePelo(boolean tienePelo) {
        this.tienePelo = tienePelo;
    }

    public boolean tieneGlándulasMamarias() {
        return tieneGlándulasMamarias;
    }

    public void setTieneGlándulasMamarias(boolean tieneGlándulasMamarias) {
        this.tieneGlándulasMamarias = tieneGlándulasMamarias;
    }

    public boolean esViviparo() {
        return esViviparo;
    }

    public void setEsViviparo(boolean esViviparo) {
        this.esViviparo = esViviparo;
    }


    @Override
    public String toString() {
        return "Mamifero{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", sexo='" + sexo + '\'' +
                ", esViviparo=" + esViviparo +
                ", tieneGlándulasMamarias=" + tieneGlándulasMamarias +
                ", tienePelo=" + tienePelo +
                ", edad=" + edad +
                '}';
    }

    @Override
    public Atractivo Atractivo() {
        return null;
    }

}
