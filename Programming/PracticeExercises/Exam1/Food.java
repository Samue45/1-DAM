package Programming.PracticeExercises.Exam1;

public class Food {

    //Properties
    private String name;
    private double price;
    private Fecha expirationDate;
    private Lugar place;
    private int counter;

    //Constructor
    public Food(String name, Lugar place, Fecha expirationDate, double price) {
        this.name = name;
        this.place = place;
        this.expirationDate = expirationDate;
        this.price = price;
        counter++;
    }

    //Getter and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Fecha getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Fecha expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Lugar getPlace() {
        return place;
    }

    public void setPlace(Lugar place) {
        this.place = place;
    }

    //Special methods
    //1º Methods to change the attributes of an aliment
    public void setAliment(String name) {this.name = name;}
    public void setAliment(double price) {this.price = price;}
    public void setAliment(Fecha expirationDate) {this.expirationDate = expirationDate;}
    public void setAliment(String name,double price,Fecha expirationDate ) {this.name = name; this.price = price; this.expirationDate = expirationDate;}

    //2º Method to check 2 products in different ways
    //1º Version
    public boolean equal(Food food){
        return this.name == food.name && this.price == food.price && this.expirationDate == food.expirationDate && this.place == food.place;
    }

    //2ºVersion
    public boolean equal(Food food1, Food food2){
        return food1.equals(food2);
    }

    //3ºMethod to calculate the difference of time between actual date and expiration date
    public String numWeeks(Fecha actualDate){
        int day = this.expirationDate.getDay() - actualDate.getDay();
        int month = this.expirationDate.getMonth() - actualDate.getMonth();
        int totalTime= 0;

        if (day < 0) {day *= -1;}
        if (month < 0){month *= -1;}

        totalTime = (day + (month * 30))/7;

        return "The aliment expired in " + totalTime + "weeks";
    }

    //4º Method to know how much time was instance an object food
    public int getCounter(){return counter;}
}
