package Programming.Theme2.NestedLoops;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        //Block instance
        Scanner input = new Scanner(System.in);
        int numberFamily = 2;
        int age,numberSons,numberChildren= 0;
        int oldBoys= 0,minAge= 0;
        boolean start1 = true,start2 = true;
        float salary, mediaSalary= 0,sumSalary= 0;
        String nameChild,sex, nameBigFamily="",nameFamily;

        //Then we will need to create an object Scanner to ask the name of the family

        for (int i= 1; i <= numberFamily;i++){

            //INFORMATION ABOUT CHILDREN

            //LIMIT
            System.err.println("Máx only 6 sons");

            //We ask the name of the family
            System.out.println("Name of the family:");
            nameFamily = input.next();

            //We ask for the number of children
            System.out.println("Introduce the number of children");
            numberSons = input.nextInt();


            //Here we ask all data about their children
            for (int counter = 1; counter <= numberSons; counter++){
                System.out.println("Introduce the name, age and sex each child:");
                //Name
                System.out.print("Name");
                nameChild = input.next();
                //Age
                System.out.print("Age");
                age = input.nextInt();
                //Sex
                System.out.print("Sex");
                sex = input.next();

                //Number of old boys
                if (age > 18 && sex.equalsIgnoreCase("male")){
                    oldBoys++;
                }

                //The age of the younger boy
                //We need to start the values to can work
                if (start1){
                    minAge = age;
                    start1 = false;
                }
                //Then we compare with the first age, and then we continue
                if (age < minAge){
                    minAge = age;
                }

                //We show the result when have the information of the final son
                if (counter == numberSons){
                    //SOLUTION
                    System.out.println("The number of old boys is = " + oldBoys + "\nThe age of the young child of the family is = " + minAge);

                    //INFORMATION ABOUT SALARY
                    System.out.println("Introduce the family salary:");
                    salary = input.nextFloat();

                    //We calculate the media salary of families with have more of 3 children
                    if (numberSons >= 3){
                        sumSalary += salary;
                        mediaSalary = sumSalary/numberFamily;
                    }
                }

            }

            //INFORMATION ABOUT THE FAMILY
            // We calculate the family with more children
            if (start2){
                numberChildren = numberSons;
                start2 = false;
            }
            //Then we compare with the first number of son, and then we continue
            if (numberChildren > numberSons){
                numberChildren = numberSons;
                nameBigFamily = nameFamily;
            }

            if (i == numberFamily){
                //SOLUTION
                System.out.println("The media salary of all family with more of 3 children is = " + mediaSalary + "\nThe bigger family is = " + nameBigFamily);
            }


        }
    }
}
