package Programming.Unit2.Herencia.Ejercicio4;

import Programming.Unit2.Herencia.Ejercicio4.Secciones.Artista;
import Programming.Unit2.Herencia.Ejercicio4.Secciones.Objetos.Dimensiones;
import Programming.Unit2.Herencia.Ejercicio4.Secciones.Objetos.Escultura;
import Programming.Unit2.Herencia.Ejercicio4.Secciones.Objetos.Pintura;
import Programming.Unit2.Herencia.Ejercicio4.Secciones.Obras;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ArrayList<Obras> listaObras = new ArrayList<>();
        // Añadir Pinturas
        Pintura obra1 = new Pintura("Guernica", 12345, new Artista("Vincent van Gogh", "España", 1881, 1973), new Date(1504, 6, 1), new Dimensiones(120, 90), "Lienzo");
        Pintura obra2 = new Pintura("Guernica", 12345, new Artista("Vincent van Gogh", "España", 1881, 1973), new Date(1504, 6, 1), new Dimensiones(120, 90), "Lienzo");

        listaObras.add(obra1);

        listaObras.add(new Pintura("La noche estrellada", 67690, new Artista("Vincent van Gogh", "Países Bajos", 1853, 1890), new Date(1889, 7, 15), new Dimensiones(70, 50), "Óleo sobre lienzo"));

        // Añadir Esculturas
        listaObras.add(new Escultura("David", 12345, new Artista("Michelangelo Buonarroti", "Italia", 1475, 1564), new Date(1504, 1, 1), "Mármol", 5.17));
        listaObras.add(new Escultura("El Pensador", 67890, new Artista("Auguste Rodin", "Francia", 1840, 1917), new Date(1904, 7, 1), "Bronce", 1.88));

        //Lista de obras
        CatalogoMuseo catalogoMuseo = new CatalogoMuseo(listaObras);

        //Métodos en funcionamiento de la clase Catálogo
        System.out.println("Escultura más alta = " + catalogoMuseo.buscarEsculturaMasAlta());
        System.out.println("Calcular superficie de todas las pinturas = " + catalogoMuseo.calcularSuperficiePinturas());
        System.out.println("Añadir una obra nueva = " + catalogoMuseo.sumarObras(obra2));
        System.out.println("Buscar obra = " + catalogoMuseo.buscarObra(67890));
        System.out.println("Eliminar obra = " + catalogoMuseo.eliminarObra(obra1));


        System.out.println(listaObras);




    }
}
