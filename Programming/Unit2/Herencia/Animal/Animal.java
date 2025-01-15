package Programming.Unit2.Herencia.Animal;

public abstract class Animal {

    protected String nombre;
    protected String especie;
    protected String sexo;

    public Animal(String nombre, String especie, String sexo) {
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
    }

    //Método para calcular en rango de belleza de un animal
    public abstract Atractivo Atractivo();


    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public Animal() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
