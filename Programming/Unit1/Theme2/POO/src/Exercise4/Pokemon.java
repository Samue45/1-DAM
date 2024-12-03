package Programming.Unit1.Theme2.POO.src.Exercise4;

public class Pokemon {

    //PROPERTIES
    private String name;
    private TypePokemon type;
    private int defense, attack, life;

    //CONSTRUCTORS
    public Pokemon(String name, TypePokemon type, int defense, int attack, int life) {
        this.name = name;
        this.type = type;
        this.defense = defense;
        this.attack = attack;
        this.life = life;
    }

    public Pokemon(Pokemon copyPokemon) {
        this.name = copyPokemon.name;
        this.type = copyPokemon.type;
        this.defense = copyPokemon.defense;
        this.attack = copyPokemon.attack;
        this.life = copyPokemon.life;
    }

    public Pokemon() {
        this.name = "Pokemon without name";
        this.life = 5;
        this.defense = 1;
        this.attack = 1;
    }

    //GETTER and SETTER

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypePokemon getType() {
        return type;
    }

    public void setType(TypePokemon type) {
        this.type = type;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    //ToString
    @Override
    public String toString() {
        return "Pokemon";
    }

    //Method to test the data
    public boolean validData(){
        return defense > 1 && defense < 255 && attack > 1 && attack < 255;
    }

    //Method to know the force of the pokemon
    public int getForce(){
        return getAttack() + getDefense();
    }


}
