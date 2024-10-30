import Exercise4.Fight;
import Exercise4.Pokemon;
import Exercise4.TypePokemon;

public class Main {
    public static void main(String[] args) {


        Pokemon pokemon1 = new Pokemon("Pikachu", TypePokemon.ELECTRIC,80,100,5);
        Pokemon pokemon2 = new Pokemon("Evee", TypePokemon.PLANT,150,250,5);
        Fight fight1 = new Fight();

        fight1.attack(pokemon1,pokemon2);
        fight1.attack(pokemon2,pokemon1);
        fight1.attack(pokemon1,pokemon2);

        fight1.startFight(pokemon1,pokemon2);
    }

}