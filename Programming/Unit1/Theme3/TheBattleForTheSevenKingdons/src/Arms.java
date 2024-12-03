package Programming.Unit1.Theme3.TheBattleForTheSevenKingdons.src;

public enum Arms {
    DRAGON(60), VALYRIO_SWORD(30), AXE(10);

    private int arms;

    Arms(int arms){
        this.arms = arms;
    }

    public int getArms() {
        return arms;
    }
}
