package Programming.Unit2.Herencia.Animal;

public abstract class Reptil extends Animal {

    protected int numberHuevos;

    public Reptil(String nombre, String especie, String sexo, int numberHuevos) {
        super(nombre, especie, sexo);
        this.numberHuevos = numberHuevos;
    }

    public int getNumberHuevos() {
        return numberHuevos;
    }

    public void setNumberHuevos(int numberHuevos) {
        this.numberHuevos = numberHuevos;
    }

    @Override
    public String toString() {
        return super.toString() +"Reptil{" +
                "numberHuevos=" + numberHuevos +
                '}';
    }
}
