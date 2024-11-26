package Programming.PracticeExercises.ReviewAllThemes;

public enum DaysWeek {
    MONDAY(1),TUESDAY(2),WEDNESDAY(3),THURSDAY(4),FRIDAY(5),SATURDAY(6),SUNDAY(7);

    private final int number;

    DaysWeek(int number){
        this.number = number;
    }

    @Override
    public String toString(){
        return  "Number = " + number;
    }
}
