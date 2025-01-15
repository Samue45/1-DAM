package Programming.Unit2.Herencia.Animal;

public class Cocodrilo extends Reptil {

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
        return "Cocodrilo{" +
                "numberDientes=" + numberDientes +
                ", numberHuevos=" + numberHuevos +
                ", nombre='" + nombre + '\'' +
                ", especie='" + especie + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    @Override
    public Atractivo Atractivo() {
        Atractivo nivel = null;

        if (numberDientes <= 30){
            nivel = Atractivo.FEO;
        } else if (numberDientes > 30 || numberDientes < 60 ) {
            nivel = Atractivo.FEO;
        } else if (numberDientes >= 60) {
            nivel = Atractivo.GUAPO;
        }
        return nivel;
    }
}
