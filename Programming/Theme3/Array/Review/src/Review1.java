import java.util.Random;

public class Review1 {
    //Exercise about a product inventory

    //PROPERTIES
    double [] allProducts;

    //CONSTRUCTOR
    public Review1(int number){
        createArray(number);
    }
    //Methods GETTER and SETTER
    public double[] getAllProducts(){
        return allProducts;
    }

    public void setAllProducts(double[] allProducts){
        this.allProducts = allProducts;
    }



    //METHODS
    //Method to create and save values inside on an Array
    public void createArray(int size){
        Random number = new Random();

        allProducts = new double[size];

        for (int i = 0; i < allProducts.length ; i++){
            allProducts[i] = number.nextDouble(100);
        }

    }

    //Method to look the content of the Array
    public void lookProducts(){

        for (double counter : allProducts){
            System.out.println("Product : "+ counter);
        }
    }

    //Method to increment the price 10%
    public void increasePrice(){

        for (int i = 0; i < allProducts.length ; i++) {
            allProducts[i] *=  1.10;
        }
    }

    //Method to calculate the total value of all products
    public String totalPrice(){
        double totalPrice = 0;

       for(double counter: allProducts){
            totalPrice += counter;
        }
        return "The total price is = " + totalPrice + " €";
    }



}
