package Programming.Unit2.Lambda.Otro;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Puntitos puntitos = new Puntitos();

        ArrayList<Punto> listaPuntos= puntitos.getListaPuntos();
        listaPuntos.add(new Punto(2,2));
        listaPuntos.add(new Punto(2,3));
        listaPuntos.add(new Punto(2,2));
        listaPuntos.add(new Punto(2,3));
        listaPuntos.add(new Punto(2,2));

        //Guardamos la referencia en pantalla
        // IPantalla pantalla = p -> p.getX() + " , " + p.getY();

        //Pasamos directamente la referencia
        puntitos.forEach(p -> System.out.println(p.getX() + " , " + p.getY()));


        IFiltro filtro = f -> f.getX() == f.getY();
        puntitos.select(filtro);

    }
}
