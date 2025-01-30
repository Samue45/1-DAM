package Programming.Unit2.Lambda.Ajedrez;

import Programming.Unit2.Lambda.Otro.Punto;

public class Pieza {

    private TipoPieza tipoPieza;

    private Punto punto;

    public Pieza(TipoPieza tipoPieza, Punto punto) {
        this.tipoPieza = tipoPieza;
        this.punto = punto;
    }

    public TipoPieza getTipoPieza() {
        return tipoPieza;
    }

    public void setTipoPieza(TipoPieza tipoPieza) {
        this.tipoPieza = tipoPieza;
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }
}
