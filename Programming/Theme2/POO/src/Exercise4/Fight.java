package Exercise4;

public class Fight {

    //CONSTRUCTOR
    public Fight (){}


    //METHODS
    public void startFight(Pokemon pokemon1, Pokemon pokemon2){
        //Manage exceptions
        if (!pokemon1.validData() || !pokemon2.validData()){
            System.err.println("ERRROR: The attack and the defense must be among 1 and 250 and the life must be between 0 and 5");
            return;
        }

        //Winner
        if (pokemon1.getLife() > pokemon2.getLife()){
            System.out.println( pokemon1.getName() + "(Pokemon 1) is the WINNER");
        }else {
            System.out.println(pokemon2.getName() + "(Pokemon 2) is the WINNER");
        }

    }

    //Method to attack
    public String attack(Pokemon pokemon1,Pokemon pokemon2){
        pokemon2.setLife(pokemon2.getLife()- 1);
        return pokemon1.getName() + "attack to " + pokemon2.getName();
    }
}
