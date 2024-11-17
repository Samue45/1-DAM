package AllThemes;

public enum NoteType {
    SUSPEND(0), REGULAR(5), GOOD(6), NOTABLE(8), EXCELLENT(10);

    private double value;

    NoteType (double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
