package Programming.Unit2.Herencia.Figuras;

public class Circunferencia extends Figuras{

    private int radio;

    public Circunferencia(int radio, Punto punto) {
        super(punto);
        this.radio = radio;
    }
    public Circunferencia(int radio) {
        this.radio = radio;
    }


    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return (radio * radio) * Math.PI ;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * radio * Math.PI;
    }
}
