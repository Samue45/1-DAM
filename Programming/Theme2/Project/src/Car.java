public class Car {

    //Instance block
    private String matriculation;
    private String mark;
    private String model;
    private int potency ;
    private boolean newCar;
    private static int  counter = 0;

    //Constructor methods

    //ALL PARAMETERS
    public Car(String matriculation,String mark ,String model ,int potency ,boolean newCar ){
        this.matriculation = matriculation;
        this.mark = mark;
        this.model = model;
        if (potency > 0)this.potency = potency;
        else this.potency = 100;
        this.newCar = newCar;
        counter++;
    }
    //COPY OF A CAR
    public Car(Car copyCar){
       matriculation = copyCar.matriculation;
       mark = copyCar.mark;
       model= copyCar.model;
       potency = copyCar.potency;
       newCar = copyCar.newCar;
       counter++;
    }
    //WITHOUT PARAMETERS
    public Car(){
        counter++;
    }

    //Methods Getter, Setter and toString
    public String getMatriculation(){
        return  matriculation;
    }
    public void setMatriculation(String matriculation){
        this.matriculation = matriculation;
    }

    public String getMark(){
        return  model;
    }
    public void setMark(String mark){
        this.mark = mark;
    }

    public String getModel(){
        return  model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public int getPotency(){
        return  potency;
    }
    public void setPotency(int potency){
        this.potency = potency;
    }

    public boolean getNewCar(){
        return  newCar;
    }
    public void setNewCar(boolean newCar ){
        this.newCar = newCar;
    }

    @Override
    public String toString(){
        return "Data car:" +
                "Matriculation = " + matriculation +
                "Mark = " + mark +
                "Model = " + model +
                "Potency = " + potency +
                "New = " + matriculation;
    }

    //Special methods
    public boolean comparativeMatriculation(Car copyCar){
        return matriculation.equalsIgnoreCase(copyCar.matriculation);
    }

    public static boolean comparativeCars(Car car1, Car car2){
        return car1.equals(car2);
    }



}
