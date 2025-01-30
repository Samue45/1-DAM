package Programming.Unit2.Lambda.Ajedrez;

import Programming.Unit2.Lambda.Otro.Punto;

public class Tablero {
    private Pieza[][] tablero;

    //Constructor para crear el tablero y lo inicialicé
    public Tablero(){
        tablero = new Pieza[10][10];
    }

    //Un método que nos devuelva la posición de una pieza si la encuentra y si no devuelve null
    public Punto conocerPosicion(TipoPieza tipoPieza){

        //Mostramos el tipo de pieza
        mensajeTipoPieza(tipoPieza);

        //1º Entramos en la fila
        for (int i = 0; i < tablero.length; i++){

            //2º Recorremos las columnas
            for (int j = 0; j < tablero[i].length; j++) {

                Pieza pieza = tablero[i][j];
                //Pasando el tipo de pieza quiero conocer las posiciones de todas las piezas de ese tipo
                if (pieza.getTipoPieza() == tipoPieza) {

                    //Mostramos las posiciones que están ocupadas por ese tipo de pieza
                    mensajePuntos(pieza.getPunto());
                    return pieza.getPunto();
                }
            }
        }
        return null;
    }

    private void mensajeTipoPieza(TipoPieza tipoPieza){
        System.out.println("Tipo de pieza = " + tipoPieza);
    }
    private void mensajePuntos(Punto punto){
        System.out.println("Posición = " + punto);
    }

    //Método que mueva una pieza del tablero, le pasamos el punto al que la queremos mover
    //Método que compruebe si ese punto está ocupado

}
