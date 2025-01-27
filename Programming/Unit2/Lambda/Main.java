package Programming.Unit2.Lambda;

import java.util.Random;

public class Main {

    public static int main(String[] args) {

        //Formas de usar una interfaz

        //1º Forma = Crear una clase que implemente la interfaz
        Pantalla pantalla = new Pantalla();

        //2º Forma = Crear una clase anónima
        //Clase anónima
        Mostrable mostrable = new Mostrable() {
            @Override
            public void mostrar() {

            }
        };

        //3º Forma = Empleando Lambda
        // Nota = Si tiene varios métodos no podríamos discriminar
        Mostrable mostrable1 = () -> System.out.println("Hasta luego");


        //Como el método solo tiene una línea no hace falta ponder return, ya que se sabe previamente que se trata de un return
        RandomNumber randomNumber = () ->  new Random().nextInt(1,10);
        return 0;
    }
}
