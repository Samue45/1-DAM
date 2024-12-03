package Programming.Unit1.Theme3.TheBattleForTheSevenKingdons.src;

public class Main {

    public static void main(String[] args) {

        Character character1 = new Character(CharacterType.DAENERYS_TARGARYEN,Intelligence.MEDIA,Force.HIGH, Leadership.LITTLE, Arms.DRAGON);
        Character character2 = new Character(CharacterType.NIGHT_KING,Intelligence.MEDIA,Force.MEDIA, Leadership.LITTLE, Arms.VALYRIO_SWORD);

        Actions.attack(character1,character2);
    }
}
