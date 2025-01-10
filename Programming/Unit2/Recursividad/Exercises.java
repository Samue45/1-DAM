package Programming.Unit2.Recursividad;

public class Exercises {

    //Crea un método que obtenga la suma de los números naturales desde 1 hasta N. Se debe pasar como parámetro el número N
    public static int sum(int number){
        if (number == 1){
            return 1;
        }else {
            return number + sum(number - 1);
        }
    }
    //Crea un método que imprima los dígitos desde 1 hasta N. Se debe pasar como parámetro el número N
    public static int imprimirNumbers(int n){
        if (n == 1){
            return 1;
        }else {
            return n + sum(n - 1);
        }
    }
}
