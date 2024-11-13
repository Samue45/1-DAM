public class Main {

    public static void main(String [] args){

        Review1 review1 = new Review1(5);

        System.out.println("All products");
        review1.lookProducts();

        System.out.println("Increase 10 %");
        review1.increasePrice();
        review1.lookProducts();

        System.out.println("Sum of all products");
        System.out.println(review1.totalPrice());



    }



}
