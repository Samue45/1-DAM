public class Maths {


    public static double potency(double base, double exponent){
       //Block instance
        double result = 1;

        //Instructions
        for (int counter= 0; counter < exponent; counter++){
            //Calculation of the potency
            result *= base;

            //Special case where if the exponent is 0 the result always is 1
            if (exponent == 0){
                result = 1;
            }
        }
        //Solution
        return result;
    }

    public static boolean comparison(int number1, int number2){
        return number1 == number2;
    }

    public static  int incrementOne(int number){
        return ++number;
    }

    public static boolean divisor(int number1, int number2){
        return (number1 % number2) ==0;
    }

    public static String allDivisor(int number){
        String divisor= "1";

        for (int i = 2; i <= number;i++){
            if (divisor(number,i)) divisor = divisor + "-" + i;
        }
        return divisor;
    }


    public static int getFirstPrimeFactor(int num) {
        // Check for the smallest prime factor
        for (int cont = 2; cont <= num; cont++) {
            if (num % cont == 0) { // Check if cont is a divisor
                return cont; // Return the first prime factor
            }
        }
        return num; // Return the number itself if it's prime
    }

    public static String factorization(int number) {
        if (number < 2) {
            return "Number must be greater than 1.";
        }

        String factorization = "";

        while (number > 1) {
            int factor = getFirstPrimeFactor(number);
            number /= factor;

            factorization += factor + "*"; // Concatenate the factor
        }

        // Remove the last '*' if there's any factorization
        if (factorization.length() > 0) {
            factorization = factorization.substring(0, factorization.length() - 1); // Remove last '*'
        }

        return factorization;
    }
}
