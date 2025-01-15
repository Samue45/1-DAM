package Programming.Unit2.ArrayList;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> listaNumbers1 = new ArrayList<>();
        ArrayList<Integer> listaNumbers2 = new ArrayList<>();
        Exercises.rellenarArrayList(listaNumbers1,10);
        Exercises.rellenarArrayList(listaNumbers2,10);
        System.out.println(listaNumbers1);
        System.out.println(listaNumbers2);
        System.out.println(Exercises.valoresIguales(listaNumbers1,listaNumbers2));


    }
}
