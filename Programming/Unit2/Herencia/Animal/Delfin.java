package Programming.Unit2.Herencia.Animal;

import java.awt.*;

public class Delfin extends Mamifero {

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
        return "Delfin{" +
                "color=" + color +
                ", especie='" + especie + '\'' +
                ", nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                "} " + super.toString();
    }

    @Override
    public Atractivo Atractivo() {
        Atractivo nivel = null;

        if (color == Color.BLACK){
            nivel = Atractivo.GUAPO;
        } else if (color == Color.GRAY) {
            nivel = Atractivo.FEO;
        } else if (color == Color.WHITE) {
            nivel = Atractivo.NORMAL;
        }
        return nivel;
    }
}
