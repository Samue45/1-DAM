package Programming.JavaBook;

import java.util.Random;

public class Theme1 {

    public void exercise1_2(){
        System.out.println(
                """
                   Nombre : Samuel
                   Dirección : Calle Castillo de Medina
                   Telf : 640175652"""
        );
    }

    public void exercise3(){

        String[][] palabras =
                {
                        {"Hello", " Hola"},
                        {"Breakfast", " Desayuno"},
                        {"Car", " Coche"},
                        {"Banana", " Plátano"}};

        for (String[] palabra : palabras) {
            for (String s : palabra) {
                System.out.print(s);
            }
            System.out.println();
        }
    }

    public void exercise4_5(){
        //1º Creamos una matriz para la tabla
        String[][] horarioClase = new String[8][6];

        //2º Inicializamos la matriz
        for (String[] i : horarioClase){
            for (String j : i){
                j = " ";
            }
        }

        //3º Rellenamos la matriz





    }

    public void horarioClase(){
        //Creamos la matriz
        String [][] horario = new String[7][6];

        //La inicializamos
        for (String[] i : horario){
            for (String j : i){
                j = " ";
            }
        }

        //Rellenamos la tabla usando los métodos
        for (int i = 0; i < horario.length ; i++) {
            for (int j = 0; j < horario[i].length; j++) {
                if (i == 0) horario[i][j] = diaSemana(j);
                if (j == 0) horario[i][j] = horario(i);
                if (i > 0 && j > 0 ) horario[i][j] = asignatura();
                if (i == 3 && j > 0) horario[3][j] = " Recreo ";
            }
        }

        //Imprimimos la tabla
        for (String[] i : horario){
            for (String j : i){
                System.out.print(j);
            }
            System.out.println();
        }




    }

    private String diaSemana(int index){
        String dia;
        switch (index){
            case 0: dia = "   ";
                break;
            case 1: dia = "       Lunes ";
                    break;
            case 2: dia = " Martes ";
                break;
            case 3: dia = " Miércoles ";
                break;
            case 4: dia = " Jueves ";
                break;
            case 5: dia = " Viernes ";
                break;
            default: dia = " ";
                    break;
        }

        return  Colors.verde + dia;
    }

    private String horario(int index){
        String horario;
        switch (index){
            case 0: horario = "   ";
                break;
            case 1: horario = " 8:15-9:15 ";
                break;
            case 2: horario = " 9:15-10:15 ";
                break;
            case 3: horario = " 10:15-11:15 ";
                break;
            case 4: horario = " 11:15-12:45 ";
                break;
            case 5: horario = " 12:45-13:45 ";
                break;
            case 6: horario = " 13:45-14:45 ";
                break;
            default: horario = "  ";
                break;
        }

        return  Colors.azul + horario;
    }

    private String asignatura(){
        Random random = new Random();
        int index = random.nextInt(1,7);
        String asignatura;
        switch (index){
            case 1: asignatura = " Lengua ";
                break;
            case 2: asignatura = " Mates ";
                break;
            case 3: asignatura = " Historia ";
                break;
            case 4: asignatura = " Recreo ";
                break;
            case 5: asignatura = " Inglés ";
                break;
            case 6: asignatura = " Filosofía ";
                break;
            default: asignatura = " ";
                break;
        }

        return  Colors.naranja + asignatura;
    }

    public void exercise6() {
        //Propiedades
        int base = 10;
        int altura = base / 2 + 1;
        String[][] matriz = new String[altura][base];

        //Inicializamos la matriz
        for (int i = 0; i < altura ; i++) {
            for (int j = 0; j < base ; j++) {
                matriz[i][j] = " ";
            }
        }

        //Rellenamos la matriz
        for (int i = 0; i < altura ; i++) {
            int centro = base / 2;
            int inicio = centro - i;
            int finalM = centro + i;

            for (int j = inicio; j < finalM ; j++) {
                matriz[i][j] = "*";
            }
        }
        //Imprimimos el resultado
        for (int i = 0; i < altura ; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();

        }
    }

    public void exercise7() {
        //Propiedades
        int base = 10;
        int altura = base / 2 + 1;
        String[][] matriz = new String[altura][base];

        //Inicializamos la matriz
        for (int i = 0; i < altura ; i++) {
            for (int j = 0; j < base ; j++) {
                matriz[i][j] = " ";
            }
        }

        //Rellenamos la matriz
        for (int i = 0; i < altura ; i++) {
            int centro = base / 2;
            int inicio = centro - i;
            int finalM = centro + i;

            for (int j = inicio; j < finalM ; j++) {
                if (i == j)matriz[i][j] = "*";
            }
        }
        //Imprimimos el resultado
        for (int i = 0; i < altura ; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();

        }
    }
}
