package Programming.Unit2.Lambda;

@FunctionalInterface
public interface Operable {

    int operar(int a, int b);

    default int suma(int a, int b){
        return a+b;
    }

    default int resta(int a, int b){
        return a-b;
    }

}

