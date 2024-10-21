public class Maths {

    public static String congratulate(String name, int age){
        return "Happy birthday " + name + ", now you are " + age + " old :)";

    }

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
    };

    public static boolean divisor(int number1, int number2){
        return (number1 % number2) ==0;
    }
}
