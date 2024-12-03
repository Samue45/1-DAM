package Programming.Unit1.PracticeExercises.ReviewAllThemes;

public class Person {

    //Properties
    private String name;
    private int age;

    //Constructor
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Getter and Setter
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String welcome(){
        return "Hello, my name is " + name + " and I'm " + age + " years old";
    }
}
