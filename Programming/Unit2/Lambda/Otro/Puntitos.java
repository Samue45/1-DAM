package Programming.Unit2.Lambda.Otro;

import java.util.ArrayList;

public class Puntitos {

    private ArrayList<Punto> listaPuntos;

    public Puntitos(){
        this.listaPuntos = new ArrayList<>();
    }

    public ArrayList<Punto> getListaPuntos() {
        return listaPuntos;
    }

    public void setListaPuntos(ArrayList<Punto> listaPuntos) {
        this.listaPuntos = listaPuntos;
    }

    public void forEach(IPantalla pantalla){
        for (Punto punto: listaPuntos){
           pantalla.mostrarPunto(punto);
        }
    }

    public ArrayList<Punto> select (IFiltro filtro){
        ArrayList<Punto> listaFiltrada = new ArrayList<>();

        for (Punto punto : listaPuntos){
            if (filtro.comprobarPunto(punto)) {
                listaFiltrada.add(punto);
            }
        }
        return listaFiltrada;
    }

    @Override
    public String toString() {
        return "Puntitos{" +
                "listaPuntos=" + listaPuntos +
                '}';
    }
}
