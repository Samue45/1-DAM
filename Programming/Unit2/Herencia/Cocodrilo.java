package Programming.Unit2.Herencia;

public class Cocodrilo extends Reptil{

    private int numberDientes;

    public Cocodrilo(String nombre, String especie, String sexo, int numberHuevos, int numberDientes) {
        super(nombre, especie, sexo, numberHuevos);
        this.numberDientes = numberDientes;
    }

    public int getNumberDientes() {
        return numberDientes;
    }

    public void setNumberDientes(int numberDientes) {
        this.numberDientes = numberDientes;
    }

    @Override
    public String toString() {
        return super.toString() +"Cocodrilo{" +
                "numberDientes=" + numberDientes +
                '}';
    }
}
