package Theme1;

import java.util.Scanner;

public class Calculator {

    private String order;

    public Calculator (){};

    public void useCalculator(){
        Scanner input = new Scanner(System.in);
        String typeOperation, order, specialMessage = "";
        int number1, number2;
        int solution = 0;

        do {

            System.out.println("What operation do you want to do?");
            typeOperation = input.next();


            switch (typeOperation){
                case ("+"):
                    //We solicited the number to user
                    number1 = introduceFirstNumber();
                    number2 = introduceSecondNumber();


                    //We do the operation
                    solution = Operations.sum(number1,number2);
                    break;
                case ("-"):
                    //We solicited the number to user
                    number1 = introduceFirstNumber();
                    number2 = introduceSecondNumber();

                    //We do the operation
                    solution = Operations.rest(number1,number2);
                    break;
                case ("*"):
                    //We solicited the number to user
                    number1 = introduceFirstNumber();
                    number2 = introduceSecondNumber();

                    //We do the operation
                    solution = Operations.multi(number1,number2);
                    break;
                case ("/"):
                    //We solicited the number to user
                    number1 = introduceFirstNumber();
                    number2 = introduceSecondNumber();

                    //We do the operation
                    solution = Operations.div(number1,number2);
                    break;
                default:
                    System.err.println("ERROR: Invalid data :(");
                    break;
            }

            System.out.println("The solution is = " + solution);

            System.out.println("Do you want to continue? Write N to get out and Y to continue");
            order = input.next();

            if (!order.equalsIgnoreCase("Y") || !order.equalsIgnoreCase("N")) {
               specialMessage = "I don't understand your answer :(" ; 
               System.out.println(specialMessage);
            }

        }while (!specialMessage.equalsIgnoreCase("I don't understand your answer :(") && !order.equals("N"));



    }

    private int introduceFirstNumber(){
        Scanner input = new Scanner(System.in);
        int number1, number2;

        System.out.println("Introduce the 1º number:");
        number1 = input.nextInt();

        return number1;
    }

    private int introduceSecondNumber(){
        Scanner input = new Scanner(System.in);
        int number2;

        System.out.println("Introduce the 2º number:");
        number2 = input.nextInt();

        return number2;
    }

}
