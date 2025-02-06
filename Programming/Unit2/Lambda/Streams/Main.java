package Programming.Unit2.Lambda.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        List<String> palabras = Arrays.asList("java", "stream", "example", "pa");

        //1
        int integerStream = numeros.stream()
                .filter(number -> number % 2 == 0)
                .reduce(0, (number1, number2) -> number1 + number2);

        System.out.println( "Suma de números pares = " + integerStream);

        //2
        int integerStream1 = numeros.stream().max(Comparator.naturalOrder()).orElseThrow();
        System.out.println("El número más grande = " + integerStream1);

        //3
        List<String> nameToUpperCase = palabras.stream().map( palabra -> palabra.toUpperCase()).toList();
        System.out.println("Nombres a mayúscula = " + nameToUpperCase);

        //4
        long numbers3 = numeros.stream().limit(3).count();
        System.out.println("3 primeros números de la lista = " + numbers3);

        //5
        List<String> palabrasLargas = palabras.stream().filter(palabra -> palabra.length() > 3).toList();
        System.out.println("Palabras con más de 3 letras = " + palabrasLargas);
    }
}
