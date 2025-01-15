package Programming.Unit2.Herencia.Figuras;

public abstract class Figuras {

    private Punto punto;



    public Figuras(Punto punto) {
        this.punto = punto;
    }

    public Figuras() {
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();



}
