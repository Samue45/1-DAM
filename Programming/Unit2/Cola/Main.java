package Programming.Unit2.Cola;

import java.util.ArrayList;

public class Main {

    static ArrayList<String> colaSuper = new ArrayList<>();

    public static void main(String[] args) {

        //Entran clientes a la fila del supermercado
        rellenarCola();

        //Despachamos al primer cliente
        servirCliente();

    }


    private static void rellenarCola() {
        for (int i = 0; i <= 10 ; i++) {
            colaSuper.add("Cliente " + i);
        }
    }

    private static void servirCliente(){
        //Eliminamos el primer cliente de la fila
        colaSuper.removeFirst();
    }
}
