package Programming.Unit2.Lambda.Ejercicios;

public class ClaseEjer1 implements Ejer1 {
    @Override
    public int cacularPromedio(int[] arrayNumbers) {
        int sum = 0;
        for (int number: arrayNumbers){
            sum+= number;
        }
        return sum/ arrayNumbers.length;
    }
}
