package Programming.Unit2.Recursividad;

public class Exercises {

    //Crea un método que obtenga la suma de los números naturales desde 1 hasta N. Se debe pasar como parámetro el número N
    public static int sum(int inicio, int numFinal){
        // Caso base (número = limit)
        // Caso recursivo (Hacer suma del número más el siguiente)
        if (inicio == numFinal){
            return 0;
        }else {
            return 1 + sum(inicio + 1, numFinal);
        }
    }
}
