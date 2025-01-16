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
        Artista artista1 = new Artista("Pablo Picasso", "España", 1881, 1973);
        Date fecha1 = new Date(1904, 6, 1);
        Dimensiones dimensiones1 = new Dimensiones(120, 90); // 120cm de ancho y 90cm de alto
        Pintura obra1 = new Pintura("Guernica", 12345, artista1, fecha1, dimensiones1, "Lienzo");
        listaObras.add(obra1);

        listaObras.add(new Pintura("La noche estrellada", 67890, new Artista("Vincent van Gogh", "Países Bajos", 1853, 1890), new Date(1889, 7, 15), new Dimensiones(70, 50), "Óleo sobre lienzo"));
        listaObras.add(new Pintura("La Mona Lisa", 54321, new Artista("Leonardo da Vinci", "Italia", 1452, 1519), new Date(1503, 5, 1), new Dimensiones(77, 53), "Óleo sobre tabla"));
        listaObras.add(new Pintura("Las dos Fridas", 13579, new Artista("Frida Kahlo", "México", 1907, 1954), new Date(1940, 3, 12), new Dimensiones(60, 50), "Óleo sobre lienzo"));
        listaObras.add(new Pintura("La persistencia de la memoria", 24680, new Artista("Salvador Dalí", "España", 1904, 1989), new Date(1931, 4, 1), new Dimensiones(100, 80), "Óleo sobre lienzo"));

        // Añadir Esculturas
        listaObras.add(new Escultura("David", 12345, new Artista("Michelangelo Buonarroti", "Italia", 1475, 1564), new Date(1504, 1, 1), "Mármol", 5.17));
        listaObras.add(new Escultura("El Pensador", 67890, new Artista("Auguste Rodin", "Francia", 1840, 1917), new Date(1904, 7, 1), "Bronce", 1.88));
        listaObras.add(new Escultura("La Sagrada Familia", 54321, new Artista("Antonio Gaudí", "España", 1852, 1926), new Date(1904, 9, 15), "Piedra", 70));
        listaObras.add(new Escultura("Reclining Figure", 13579, new Artista("Henry Moore", "Reino Unido", 1898, 1986), new Date(1962, 5, 10), "Bronce", 3.5));
        listaObras.add(new Escultura("Figura en movimiento", 24680, new Artista("Barbara Hepworth", "Reino Unido", 1903, 1975), new Date(1961, 4, 2), "Madera", 1.2));

        CatalogoMuseo catalogoMuseo = new CatalogoMuseo(listaObras);

        System.out.println("Escultura más alta = " + catalogoMuseo.buscarEsculturaMasAlta());
        System.out.println("Calcular superficie de todas las pinturas = " + catalogoMuseo.calcularSuperficiePinturas());
        System.out.println("Añadir una obra nueva = " + catalogoMuseo.sumarObras(new Pintura("Guernica", 12345, new Artista("Vincent van Gogh", "España", 1881, 1973), new Date(1504, 6, 1), new Dimensiones(120, 90), "Lienzo")));
        System.out.println("Buscar obra = " + catalogoMuseo.buscarObra(67890));
        System.out.println("Eliminar obra = " + catalogoMuseo.eliminarObra(obra1));





    }
}
