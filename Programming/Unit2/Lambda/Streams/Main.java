package Programming.Unit2.Lambda.Streams;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CrearDatos crearDatos = new CrearDatos();
        ArrayList<Persona> listaAlumnos = crearDatos.crearAlumnos();
        ArrayList<Curso> listaCursos = crearDatos.crearCursos();

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
    }
}
