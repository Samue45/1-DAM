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
        this.age = age;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
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


    //Method to know if the character is dead
    private boolean validatePointsOfHealth(int number){
        return number > 0;
    }


}
