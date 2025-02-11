package Programming.Unit2.Lambda.Streams;


import java.util.*;
import java.util.stream.DoubleStream;


public class Main {
    public static void main(String[] args) {

        CrearDatos crearDatos = new CrearDatos();
        ArrayList<Persona> listaAlumnos = crearDatos.crearAlumnos();
        ArrayList<Curso> listaCursos = crearDatos.crearCursos();

        /*
        //1
        long totalAlumnos = listaCursos.stream()
                .filter((curso) -> curso.getListaAlumnos().size() > 5)
                .count();
        System.out.println("Cantidad de cursos que tienen más de 300 alumnos: " + totalAlumnos);

        //2
        System.out.println("----------Lista de títulos----------");
            listaCursos.stream()
                .filter(curso -> curso.getCantidadVideos() >= 10 && curso.getCantidadVideos() <= 50)
                .map(curso -> curso.getTitulo())
                .forEach(titulo -> System.out.println(titulo));

        //3
        listaCursos.stream()
                .filter((curso -> curso.getListaAlumnos().size() > 4))
                .forEach((curso -> {
                    System.out.println("Título del curso = " + curso.getTitulo() + "\nDuración del curso = " + curso.getDuracion());
                }));

        //4
       listaCursos.stream()
                .min((curso1, curso2) -> Integer.compare(curso1.getListaAlumnos().size(), curso2.getListaAlumnos().size()))
                .ifPresent((curso -> System.out.println(curso.getTitulo())));

       //5
        List<Integer> lista=listaCursos.stream()
                .map(curso -> curso.getCantidadVideos())
                .sorted()
                .toList();
        System.out.println(lista);

        //6
        listaCursos.stream()
                .filter(curso -> curso.getTitulo().contains("Curso") )
                .map(curso -> curso.getTitulo())
                .forEach(curso -> System.out.println(curso));

        //7
        boolean mayor100 =listaCursos.stream()
                .anyMatch( curso -> curso.getCantidadVideos() > 100 );
        System.out.println(mayor100);

        //8
        boolean duracionMayor1h = listaCursos.stream()
                .allMatch(curso -> curso.getDuracion() > 1 );
        System.out.println(duracionMayor1h);

        //9
        boolean cursoMenos10Al = listaCursos.stream()
                .noneMatch(curso -> curso.getListaAlumnos().size() < 10);
        System.out.println(cursoMenos10Al);

        //10
        List<String> listaTitulosCurso = listaCursos.stream()
                .map(curso -> curso.getTitulo())
                .toList();




        //11
        OptionalDouble promedioDuracion = listaCursos.stream()
                .mapToDouble(curso -> curso.getDuracion())
                .average();
        System.out.println(promedioDuracion);

        //12
        int totalAlumnos = listaCursos.stream()
                .mapToInt(curso -> curso.getListaAlumnos().size())
                .sum();
        System.out.println(totalAlumnos);

        //13
        OptionalDouble tiempoMax = listaCursos.stream()
              .mapToDouble(curso -> curso.getDuracion())
              .max();
        System.out.println(tiempoMax);

        //14
        OptionalDouble tiempoMin = listaCursos.stream()
                .mapToDouble(curso -> curso.getDuracion())
                .min();
        System.out.println(tiempoMin);

        //15
       OptionalDouble promedio = listaCursos.stream()
                .mapToDouble(curso -> curso.getDuracion())
                .average();

        List<Curso> mayorDuracion = listaCursos.stream()
                .filter(curso -> curso.getDuracion() > promedio.getAsDouble())
                .toList();
        System.out.println(mayorDuracion);

        //16
        listaCursos.stream()
                .filter(curso -> curso.getListaAlumnos().size() > 600)
                .sorted(Comparator.comparing(Curso::getTitulo).reversed())
                .forEach(curso -> curso.getTitulo());



        //17

        OptionalInt min = listaCursos.stream()
                .mapToInt(curso -> curso.getCantidadVideos())
                .min();

        listaCursos.stream()
                .filter(curso -> curso.getCantidadVideos() <= min.getAsInt())
                .forEach(curso -> System.out.println(curso.getTitulo()));

        //18
        int sumaTotal =listaCursos.stream()
                .filter(curso -> curso.getListaAlumnos().size() > 600)
                .mapToInt(curso -> curso.getDuracion())
                .sum();
        System.out.println(sumaTotal);

         */

        //19
        listaCursos.stream()
                .max(Comparator.comparing(curso -> curso.getTitulo().length()))
                .ifPresent(curso -> System.out.println(curso.getTitulo()));


        //20
        listaCursos.stream()
                .mapToDouble(curso -> curso.getDuracion())
                .sorted()
                .limit(3);


    }
}
