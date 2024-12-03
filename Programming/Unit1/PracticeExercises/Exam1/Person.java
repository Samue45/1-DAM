package Programming.Unit1.PracticeExercises.Exam1;

import java.util.Random;

public class Person {

    public void estandarPersona(){
        Random random = new Random();
        int numberPerson = random.nextInt(3,6);
        String person = "";
        int numberWomensTall = 0, hombresMedia = 0;

        for (int personCounter = 0; personCounter < numberPerson; personCounter++){
            int edad = random.nextInt(0,120);
            double estatura = random.nextDouble(0.0,2.4);
            String sexo = generateSexo();


            System.out.println(comprobarEstandar(edad,estatura));
            numberWomensTall = mujeresAltas(edad,estatura,sexo);
            hombresMedia = edadMediaAdultosH(edad,sexo);

            person += "Persona " + personCounter + " Edad = " + edad + " Estatura = " + estatura + "Sexo = " + sexo + "\n";
        }

        System.out.println("Hay " + numberWomensTall + " adultas que miden más de 1.70");
        System.out.println("La media de hombre adultos es = " + hombresMedia);
        System.out.println(person);

    }

    public String generateSexo(){
        Random random = new Random();
        int number = random.nextInt(0,2);
        String sexo = "";

        if (number == 0){
            sexo = "H";
        }else {sexo = "M";}

        return sexo;

    }

    public String comprobarEstandar(int edad, double estatura){
        String message = "";
        boolean valido= false;

        if (edad > 0 && edad <= 5 && estatura > 0 && estatura <= 1.10) valido = true;
        else if (edad > 6 && edad <= 10 && estatura > 1.11 && estatura <= 2.40) valido = true;
        else if (edad >= 11 && estatura >= 1.70) valido = true;

        if (valido == true){
            message = "Cumple con el estándar";
        }else {
            message = "No cumple con el estándar";
        }

        return message;
    }

    public int mujeresAltas(int edad, double estatura, String sexo){
        int counter = 0;

        if (edad >= 18 && estatura >= 1.70 && sexo.equals("M")) counter++;

        return counter;
    }

    public int edadMediaAdultosH(int edad, String sexo){
        int counter =0, media= 0, sumEdades= 0;

        if (edad >= 18 && sexo.equals("H")){
            counter++;
            sumEdades += edad;
        }

        media = sumEdades + counter;

        return media;

    }
}
