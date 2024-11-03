package Programming.Theme2.NestedLoops;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        //Block instance
        Scanner input = new Scanner(System.in);
        final int MUNICIPALITY = 4;
        String codeProvince , codeMunicipality,extension, prefix ,dni ;
        int numberMunicipality, numberFamilies , salary, numberSons;

        //Algorithm instructions
        //START 1º BUCKLE
        for (int i = 0; i < 4; i++){

            //We start asking important questions
            System.out.print("Introduce the identification code of the province" );
            codeProvince = input.nextLine();
            System.out.print("Introduce the prefix of the province");
            prefix = input.nextLine();
            System.out.println("Introduce the number of municipality");
            numberMunicipality = input.nextInt();

            //START 2º BUCKLE
            for (int j = 0; j < numberMunicipality; j++){

                System.out.print("Introduce the identification code of the municipality" );
                codeMunicipality = input.nextLine();
                System.out.print("Introduce the municipality extension(Km)" );
                extension = input.nextLine();
                System.out.print("Introduce the number of families" );
                numberFamilies = input.nextInt();

                //START 3º BUCKLE
                for (int k = 0; k < numberFamilies; k++){

                    System.out.print("Introduce the DNI of the family header" );
                    dni = input.nextLine();
                    System.out.print("Introduce the salary" );
                    salary = input.nextInt();
                    System.out.print("Introduce the number of children:" );
                    numberSons = input.nextInt();


                }//FINISH 3º BUCKLE

                //SOLUTION 3


            }//FINISH 2º BUCKLE
















        }//FINISH 1º BUCKLE

    }
}
