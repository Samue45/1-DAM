package Programming.Unit2.Examenes.Theme3;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Ejercicio 1
        Sumar sumar = new Sumar();
        sumar.sumar(5,5);
        System.out.println(sumar);

        Operacion suma = (a,b) -> a + b ;
        System.out.println(suma);

        Operacion operacion = new Operacion() {
            @Override
            public int sumar(int a, int b) {
                return a + b;
            }
        };
        System.out.println(operacion);

        //Ejercicio 2
        System.out.println(sumar.ejecutarOperacion((a,b) -> a + b ,6,5));
        System.out.println(sumar.ejecutarOperacion((a,b) -> a * b ,6,5));
        System.out.println(sumar.ejecutarOperacion((a,b) -> a / b ,6,5));
        System.out.println( sumar.ejecutarOperacion((a,b) -> a - b ,6,5));

        //Ejercicio3
        System.out.println( sumar.operar(1,2,3,4,5,6,7,8,9,10));
        //Ejercicio 4
        Persona persona = new Persona("Samuel","xamuelx19@gmail.com",19);
        System.out.println(persona);

        //Ejercicio 5
        Validator validator = (a) -> a % 2 == 0;
        Validador validator1 = (a) -> a.length() > 5;
        System.out.println("Número par = " + validator);
        System.out.println("Cadena con más de 5 caracteres = " + validator1);

        //Ejercicio 7
        UsuarioDAO usuarioDAO =UsuarioDAO.obtenerInstancia();
        usuarioDAO.addUser(new User());
        usuarioDAO.getListaUsuarios();

        //Ejercicio 9
        ArrayList<Integer> listaNumbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            listaNumbers.add(random.nextInt(0,10));
        }

        int suma12 = listaNumbers.stream()
                .filter(a -> a % 2 == 0)    // Filtra los números pares
                .map(a -> a * a)            // Eleva al cuadrado
                .reduce(0, Integer::sum);   // Suma todos los valores

        System.out.println("Suma de los cuadrados de los números pares: " + suma12);

    }
}