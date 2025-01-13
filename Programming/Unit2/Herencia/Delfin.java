package Programming.Unit2.Herencia;

import java.awt.*;

public class Delfin extends Mamifero{

    private Color color;

    public Delfin(String nombre, int edad, boolean tienePelo, boolean tieneGlándulasMamarias, boolean esViviparo, Color color) {
        super(nombre, edad, tienePelo, tieneGlándulasMamarias, esViviparo);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +"Delfin{" +
                "color=" + color +
                '}';
    }
}
