public enum Intelligence {
    LITTLE(10),MEDIA(30), HIGH(50);

    private int intelligence;

    Intelligence(int intelligence){
        this.intelligence = intelligence;
    }

    public int getIntelligence() {
        return intelligence;
    }
}
