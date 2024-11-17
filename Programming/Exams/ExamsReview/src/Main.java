import AllThemes.Course;
import AllThemes.CourseType;
import AllThemes.NoteType;
import AllThemes.Student;

public class Main {
    public static void main(String[] args) {

        Course course1 = new Course(CourseType.MATH, NoteType.EXCELLENT);
        Course course2= new Course(CourseType.BIOLOGY, NoteType.SUSPEND);
        Course course3 = new Course(CourseType.HISTORY, NoteType.GOOD);
        Course course4= new Course(CourseType.ENGLISH, NoteType.NOTABLE);
        Course course5= new Course(CourseType.PHYSIC, NoteType.NOTABLE);
        Course course6= new Course(CourseType.MATH, NoteType.NOTABLE);
        Course course7= new Course(CourseType.ART, NoteType.EXCELLENT);

        Course[] courses1 = {course1,course2,course3,course4};
        Course[] courses2 = {course5,course6,course7,course2};
        Course[] courses3 = {course1,course5,course6,course3};

        Student student1 = new Student("Samuel", 19, "Calle Castillo de Medina", courses1);
        Student student2 = new Student("Paco", 23, "Calle Castillo de Medina", courses2);
        Student student3 = new Student("Antonia", 26, "Calle Castillo de Medina", courses3);
        Student[] students = {student1,student2,student3};

        System.out.println(student1.getAllNotesOfCourses());
        System.out.println("Note = " + student1.getOneNote(course2.getType()));



    }
}
