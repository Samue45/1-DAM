package Programming.Unit2.Herencia.Figuras;

public class Rectangulo extends Figuras {

    private int base;
    private int altura;

    public Rectangulo(int base, int altura, Punto punto) {
        super(punto);
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    //Puede haber fallos como que el radicando sea menor a 0
    public String calcularCentro() {
        return "(" + (super.getPunto().getX() + (base / 2)) + "," + (super.getPunto().getY() + (altura / 2)) + ")";
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
