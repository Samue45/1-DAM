public class Actions {

    private Character character;

    public static void attack(Character character1, Character character2){

        // Obtener el daño de cada personaje basado en sus habilidades
        int damage1 = character1.calculateDamage();
        int damage2 = character2.calculateDamage();

        System.out.println("Character 1 attacks with damage: " + damage1);
        System.out.println("Character 2 attacks with damage: " + damage2);

        // Determinar quién gana el combate
        if (damage1 > damage2) {
            System.out.println("Character 1 wins the attack!");
        } else if (damage1 < damage2) {
            System.out.println("Character 2 wins the attack!");
        } else {
            System.out.println("It's a tie!");
        }
    }
}
