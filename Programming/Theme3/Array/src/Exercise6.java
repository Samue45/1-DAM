

public class Exercise6 {

    public int[] invertOrder(int[] listNumbers){
        int[] newListNumbers = new int[listNumbers.length];

        for (int i = 0; i < listNumbers.length ; i++) {
            newListNumbers[i] = listNumbers[listNumbers.length- 1 - i];
        }

        return newListNumbers;
    }



}
