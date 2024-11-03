

public class Main {
    /*
    * Enunciado:
    * Desarrolla un programa en Java para gestionar un pequeño juego de adivinanzas. El programa debe solicitar al usuario adivinar
    * un número generado aleatoriamente por el sistema, en un rango de 1 a 100. Tendrás que usar clases, objetos, bucles, condicionales y
    * otras estructuras de control para realizar este ejercicio.*/

    public static void main(String[] args) {

        Game game1 = new Game();
        game1.userData();
        System.out.println(game1.welcome());
        game1.instructions();
    }
}
