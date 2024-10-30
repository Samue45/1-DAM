package Exercise3;



public class Character {

    //PROPERTIES
    private String name;
    private TypeRace race;
    private int age;
    private int life;

    //CONSTRUCTORS
    public Character(String name, TypeRace race, int age, int life){
        this.name = name;
        this.race = race;
        this.age = age;
        this.life = life;
    }

    public Character(){}

    public Character( Character copyCharacter){
        this.name = copyCharacter.name;
        this.race = copyCharacter.race;
        this.age = copyCharacter.age;
        this.life = copyCharacter.life;
    }

    //GETTER and SETTER
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public TypeRace getRace(){
        return race;
    }

    public void setRace(TypeRace race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (!validData()){
            System.err.println("ERROR: The age can't be less than 0");;
        }
        this.age = age;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        if (!validData()){
            System.err.println("ERROR: The life can't be less than 0");;
        }
        if (!validatePointsOfHealth(life)){
            System.err.println("Sorry :(, but your character is dead");
        }
        this.life = life;
    }

    //Method toString
    public String toString(){
        return "===CHARACTER=== " +
                "\n Name = " + name +
                "\n Race = " + race +
                "\n Age = " + age +
                "\n Life = " + life;
    }

    //Method to test the format of the value of the age and life
    private boolean validData(){
        return age > 0 && life > 0;
    }

    //Method to know if the character is dead
    private boolean validatePointsOfHealth(int number){
        return number > 0;
    }
}
