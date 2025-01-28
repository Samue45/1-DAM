package Programming.Unit2.Lambda;

public class Main {
    public static void main(String[] args) {

        //Operaciones lambda
        Operable suma = (a, b) -> a+b;

        Operable resta = (a, b) -> a-b;

        Operable multi = (a, b) -> a*b;

        Operable div = (a, b) -> a/b;

        Operable mod = (a, b) -> a%b;

        SuperOperable operable = (a) -> {
            double sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum += a[i];
            }

            return sum;
        };

        int a = 5;
        int b = 10;



        System.out.println("Suma = " + suma.operar(a,b) + "\nResta = "
                + resta.operar(a,b)+ "\nMulti = " + multi.operar(a,b)+ "\nDiv = " + div.operar(a,b)+ "\nModulo = " + mod.operar(a,b));

        System.out.println(operable.operar(1,2,3,4,5,6,7,8));
    }
}
