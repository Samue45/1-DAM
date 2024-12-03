package Programming.Unit1.Theme2.POO.src.Exercise2;

public class Birthday {

    //PROPERTIES
    private int day,month,years;

    //CONSTRUCTOR
    public Birthday(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.years = year;
    }

    //GETTER and SETTER
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    //Check the values of each data of the birthday
    private boolean validateFormat(){
        return getDay() > 0 && getDay() <= 31 && getMonth() > 0 && getMonth() <= 12 && getYears() > 0;
    }


    //Method to know if he is an adult
    public boolean isAnAdult(){
        return (2024 - getYears()) > 18;
    }

    //Method to show how old is the runner
    public int age(){
        return 2024 - getYears();
    }

    //Method to write the common format
    public String commonFormat(int number){
        if (number < 10){
            return "0" + number;
        }
        return ""+ number;
    }

    //ToString
    public String toString(){
        if (!validateFormat()){
            return "ERROR: Invalid data";
        }
        return commonFormat(day) + "/" + commonFormat(month)  + "/" + commonFormat(years);
    }
}
