package Theme2;

public class Person {

    //Properties
    private String name;
    private int age;
    private String direction;

    //CONSTRUCTOR
    public Person(String name, int age, String direction){
        this.name = name;
        this.age = age;
        this.direction = direction;
    }

    //GETTER and SETTER

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    //To String
    @Override
    public String toString(){
        return "Name: " + name
                +"\nAge: " + age
                +"\nDirection: " + direction;
    }

    public void incrementAgeIn1(){
        setAge(getAge() + 1);
    }
}

