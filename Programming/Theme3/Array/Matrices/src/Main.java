public class Main {
    public static void main(String[] args) {

        Exercise1 exercise1 = new Exercise1();

        int[][] matriz1 = {{1,2,3},{6,3},{8,2,1}};
        int[][] matriz2 = {{1,2},{6,3},{8,2,1}};


        System.out.println(exercise1.compareTwoMatrix(matriz1,matriz2));
    }
}
