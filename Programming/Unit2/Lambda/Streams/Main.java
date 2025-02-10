package Programming.Unit2.Lambda.Streams;


import java.util.ArrayList;
import java.util.Comparator;

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
*/
        //4
       listaCursos.stream()
                .min((curso1, curso2) -> Integer.compare(curso1.getListaAlumnos().size(), curso2.getListaAlumnos().size()))
                .ifPresent((curso -> System.out.println(curso.getTitulo())));

    }
}
