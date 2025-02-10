package Programming.Unit2.Lambda.Streams;

import java.util.ArrayList;

public class CrearDatos {
    public ArrayList<Persona> crearAlumnos() {
        ArrayList<Persona> alumnos = new ArrayList<>();
        alumnos.add(new Persona("Juan Pérez", 25));
        alumnos.add(new Persona("Ana Gómez", 30));
        alumnos.add(new Persona("Carlos López", 22));
        alumnos.add(new Persona("Laura García", 28));
        alumnos.add(new Persona("Pedro Martínez", 26));
        alumnos.add(new Persona("Isabel Torres", 24));
        alumnos.add(new Persona("Ricardo Ruiz", 29));
        alumnos.add(new Persona("Marta Sánchez", 33));
        alumnos.add(new Persona("David Díaz", 31));
        alumnos.add(new Persona("Lucía Fernández", 27));
        alumnos.add(new Persona("Javier Ramírez", 32));
        alumnos.add(new Persona("Oscar Molina", 35));
        alumnos.add(new Persona("Clara González", 23));
        alumnos.add(new Persona("Sofia López", 28));
        alumnos.add(new Persona("Héctor Sánchez", 30));
        alumnos.add(new Persona("Eva Jiménez", 25));
        alumnos.add(new Persona("José Martín", 27));
        alumnos.add(new Persona("Rosa Pérez", 26));
        alumnos.add(new Persona("Tomás Rodríguez", 33));
        alumnos.add(new Persona("Elena Ruiz", 29));
        return alumnos;
    }

    public ArrayList<Curso> crearCursos() {
        ArrayList<Persona> alumnos = crearAlumnos();
        ArrayList<Curso> cursos = new ArrayList<>();

        // Crear cursos con algunos alumnos seleccionados
        cursos.add(new Curso("Curso de Python", 30, 12, new ArrayList<>(alumnos.subList(0, 5))));
        cursos.add(new Curso("Curso de Java", 40, 15, new ArrayList<>(alumnos.subList(5, 10))));
        cursos.add(new Curso("Curso de JavaScript", 35, 10, new ArrayList<>(alumnos.subList(10, 15))));
        cursos.add(new Curso("Curso de Desarrollo Web", 45, 18, new ArrayList<>(alumnos.subList(15, 20))));
        cursos.add(new Curso("Curso de Diseño Gráfico", 40, 16, new ArrayList<>(alumnos.subList(0, 5))));

        // Agregar más cursos (6-20) de forma similar
        cursos.add(new Curso("Curso de Programación en C", 45, 20, new ArrayList<>(alumnos.subList(0, 5))));
        cursos.add(new Curso("Curso de Redes Neuronales", 50, 18, new ArrayList<>(alumnos.subList(5, 10))));
        cursos.add(new Curso("Curso de Angular", 40, 16, new ArrayList<>(alumnos.subList(10, 15))));
        cursos.add(new Curso("Curso de Ruby on Rails", 30, 12, new ArrayList<>(alumnos.subList(15, 20))));
        cursos.add(new Curso("Curso de Cloud Computing", 60, 25, new ArrayList<>(alumnos.subList(0, 10))));
        cursos.add(new Curso("Curso de Kubernetes", 50, 18, new ArrayList<>(alumnos.subList(10, 15))));
        cursos.add(new Curso("Curso de Linux", 45, 20, new ArrayList<>(alumnos.subList(5, 15))));
        cursos.add(new Curso("Curso de Docker", 40, 16, new ArrayList<>(alumnos.subList(10, 20))));
        cursos.add(new Curso("Curso de Diseño 3D", 35, 14, new ArrayList<>(alumnos.subList(0, 5))));
        cursos.add(new Curso("Curso de Photoshop", 40, 17, new ArrayList<>(alumnos.subList(5, 15))));
        cursos.add(new Curso("Curso de Big Data", 60, 22, new ArrayList<>(alumnos.subList(10, 20))));
        cursos.add(new Curso("Curso de Inteligencia Artificial", 50, 20, new ArrayList<>(alumnos.subList(0, 10))));
        cursos.add(new Curso("Curso de Blockchain", 45, 15, new ArrayList<>(alumnos.subList(5, 15))));
        cursos.add(new Curso("Curso de Seguridad Informática", 40, 18, new ArrayList<>(alumnos.subList(10, 20))));
        cursos.add(new Curso("Curso de Marketing Digital", 30, 12, new ArrayList<>(alumnos.subList(0, 5))));

        return cursos;
    }
}
