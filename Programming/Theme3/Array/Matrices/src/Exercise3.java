public class Exercise3 {
    /*
    * 1º Create a method call sumOfArray that need a parameter(Array of numbers) and return a number
    * 2º Define a variable to save the sum of all numbers
    * 3º Use a buckle for to run the Array
    * 4º Sum all numbers
    * 5º Return the result of sum
    * */

    public int sumAllNumbers (int[] numberList){
        int sum = 0;
        for (int i = 0; i < numberList.length; i++) {
            sum += numberList[i];
        }
        return sum;
    }


}
