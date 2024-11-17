package AllThemes;

public class Course {

    /*
    * I need to define some properties : name, type, note, student.
    * Furthermore, I need some methods like: constructor, GETTER and SETTER, toString, getAllStudents, getNote, getNotesOfAllCourses,
    * calculate mediaOfNotes.
    * */

    //PROPERTIES
    private CourseType type;
    private NoteType noteType;
    private Student student;

    //CONSTRUCTOR

    public Course(CourseType type, NoteType noteType, Student student) {
        this.type = type;
        this.noteType = noteType;
        this.student = student;
    }

    public Course(CourseType type, NoteType noteType) {
        this.type = type;
        this.noteType = noteType;
    }

    public Course() {
    }

    //GETTER and SETTER

    public CourseType getType() {
        return type;
    }

    public void setType(CourseType type) {
        this.type = type;
    }

    public NoteType getNotes() {
        return noteType;
    }

    public void setNotes(NoteType noteType) {
        this.noteType = noteType;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    //ToSTRING
    @Override
    public String toString() {
        return "Course{" +
                "\n, Type=" + type +
                "\n, Notes=" + noteType +
                "\n, Student=" + student +
                '}';
    }

    //Method to get all student of a course
    public Student[] getAllStudents(){
        return null;
    }

    //Method to get the note of one course
    public NoteType getNoteOfOneCourse(){
        return null;
    }

    //Method to get notes of all courses
    public NoteType[] getAllNotesOfCourses(){
        return null;
    }

    //Method to calculate the media of a student
    public double calculateMediaStudent(Student student){
        double media = 0;

        Course[] course = student.getCourse();
        for (int i = 0; i < course.length; i++) {
            media += course[i].noteType.getValue();
        }
        media /= course.length;

        return media;
    }

}
