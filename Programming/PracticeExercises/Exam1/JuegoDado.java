package Programming.PracticeExercises.Exam;

import java.util.Random;

public class JuegoDado {

    public void jugar(){

        //Rellenamos la matriz
        int[][] matriz = matrizAleatoria();

        //Vemos la matriz

        System.out.println( verMatriz(matriz));

        //Puntos de los jugadores

        System.out.println( puntosJugador(matriz));


    }


    public int[][] matrizAleatoria(){

        //Creamos la matriz con cada judagor y su correspondiente tirada
        int[][] jugadasDados = new int[3][4];

        Random random = new Random();
        for (int i = 0; i <jugadasDados.length ; i++) {

            for (int j = 0; j <jugadasDados[i].length - 1; j++) {
                int valorCara = random.nextInt(1,6);
                jugadasDados[i][j] = valorCara;

                if (jugadasDados[i][0] > 3){
                    jugadasDados[i][jugadasDados[i].length - 1] = valorCara;
                }
            }

        }

        return jugadasDados;
    }

    public String verMatriz(int[][] matriz){
        String dibujo = "";

        for (int i = 0; i < matriz.length; i++) {
            dibujo += "Jugador " +(i + 1);
            for (int j = 0; j < matriz[i].length; j++) {
                dibujo += "[" + matriz[i][j] + "]";

            }

            dibujo += "\n";
        }

        return dibujo;
    }

    public int puntosJugador(int[][] matriz){
       int sum = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int posicion = 0;
                int primerValor = matriz[i][posicion];
                if (primerValor < matriz[i][j]){
                    sum += matriz[i][j];

                }else {
                    sum = -1;
                }
            }
        }
        return sum;
    }
}
