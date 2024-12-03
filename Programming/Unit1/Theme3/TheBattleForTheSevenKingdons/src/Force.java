package Programming.Unit1.Theme3.TheBattleForTheSevenKingdons.src;

public enum Force {
    LITTLE(10),MEDIA(30), HIGH(50);

    private int force;

    Force(int force){
        this.force = force;
    }

    public int getForce() {
        return force;
    }
}
