package AllThemes;

import java.util.Arrays;

public class Student {

    /*
    * Some properties of a students can be: name, age, direction, courses.
    * I need to define: a constructor method with all parameters, a constructor without parameters, getter and setter and toString,
    * a method to can know his media note of all courses and one course, getBestStudent.
    * */

    //PROPERTIES
    private String name;
    private int age;
    private String direction;
    private Course[] course;

    //CONSTRUCTOR METHODS
    public Student(){};

    public Student(String name, int age, String direction, Course[] course) {
        this.name = name;
        this.age = age;
        this.direction = direction;
        this.course = course;
    }

    //GETTER and SETTER

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Course[] getCourse() {
        return course;
    }

    public void setCourse(Course[] course) {
        this.course = course;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //To String
    @Override
    public String toString(){
        return "Name: " + name +
                "\nAge: " + age +
                "\nDirection: " + direction +
                "\nCourse: " + Arrays.toString(course);
    }

    //METHOD TO KNOW HIS NOTES OF ALL COURSE
    // I need to create a list of courses and save the note of each course
    public String getAllNotesOfCourses(){
        String typeCourse = "";
        for (int i = 0; i < course.length ; i++) {
            typeCourse += "Course = " + course[i].getType() + ", Note = " +course[i].getNotes() + "\n";
        }

        return typeCourse;
    }

    //METHOD TO KNOW HIS NOTE OF A COURSE
    public NoteType getOneNote(CourseType courseType){
        NoteType noteType = NoteType.SUSPEND;

        for (int i = 0; i < course.length; i++) {
            if (courseType.equals(course[i].getType())){
                noteType = course[i].getNotes();
            }
        }
        return noteType ;
    }

    //Method to get the best student
    public Student getBestStudent(Student [] students){
        Student bestStudent = null;
        double bestMedia = 0;

        for (int i = 0; i < students.length ; i++) {
            double valueMedia = students[i].getCourse()[i].getNotes().getValue();
            if (valueMedia > bestMedia){
                bestMedia = valueMedia ;
            }
            double mediaStudent = students[i].getCourse()[i].calculateMediaStudent(students[i]);
            if (mediaStudent == bestMedia){
                bestStudent = students[i] ;
            }

        }
        return bestStudent;
    }
}
