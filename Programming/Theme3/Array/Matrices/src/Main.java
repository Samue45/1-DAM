

public class Main {
    public static void main(String[] args) {


        Exercise4 exercise4 = new Exercise4();

        int[] Array1 = {1,2,45,76,87};
        int[] Array2 = {1,2,45,76,87};
        int[] Array3 = Array1;

        System.out.println("Array1 and Array2 have the same size = " + exercise4.isEqualBySize(Array1,Array2));
        System.out.println("Array1 and Array2 have the same reference = " + exercise4.isEqualByReference(Array1,Array2));
        System.out.println("Array1 and Array2 have the same type of data = " + exercise4.isEqualByType(Array1,Array2));
        System.out.println();
        System.out.println("Array1 and Array3 have the same size = " + exercise4.isEqualBySize(Array1,Array3));
        System.out.println("Array1 and Array3 have the same reference = " + exercise4.isEqualByReference(Array1,Array3));
        System.out.println("Array1 and Array3 have the same type of data = " + exercise4.isEqualByType(Array1,Array3));
        System.out.println();
        System.out.println("Array3 and Array2 have the same size = " + exercise4.isEqualBySize(Array3,Array2));
        System.out.println("Array3 and Array2 have the same reference = " + exercise4.isEqualByReference(Array3,Array2));
        System.out.println("Array3 and Array2 have the same type of data = " + exercise4.isEqualByType(Array3,Array2));
    }
}
