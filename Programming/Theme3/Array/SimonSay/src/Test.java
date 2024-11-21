public class Test {

        public static void main(String[] args) {

            //DESCARGAR DESDE ECLIPSE MARKETPLACE "ANSI Escape in Console"

            System.out.println("////////// FORMA 1: CON VARIABLES DECLARADAS //////////\n");

            String black = "\033[30m";
            String red = "\033[31m";
            String green = "\033[32m";
            String yellow = "\033[33m";
            String blue = "\033[34m";
            String purple = "\033[35m";
            String cyan = "\033[36m";
            String white = "\033[37m";

            colorearMensaje(black,"Este texto está en color NEGRO");
            colorearMensaje(red,"Este texto está en color ROJO");
            colorearMensaje(green,"Este texto está en color VERDE");
            colorearMensaje(yellow,"Este texto está en color AMARILLO");
            colorearMensaje(blue,"Este texto está en color AZUL");
            colorearMensaje(purple,"Este texto está en color MAGENTA");
            colorearMensaje(cyan,"Este texto está en color CYAN");
            colorearMensaje(white,"Este texto está en color BLANCO");

            System.out.println("\n////////// FORMA 2: AGREGANDO EL STRING AL MENSAJE ////\n");

            System.out.println("\033[30mEste texto es NEGRO");
            System.out.println("\033[31mEste texto es ROJO");
            System.out.println("\033[32mEste texto es VERDE");
            System.out.println("\033[33mEste texto es AMARILLO");
            System.out.println("\033[34mEste texto es AZUL");
            System.out.println("\033[35mEste texto es MAGENTA");
            System.out.println("\033[36mEste texto es CYAN");
            System.out.println("\033[37mEste texto es BLANCO");

        }

        private static void colorearMensaje(String color, String mensaje) { System.out.println(color + mensaje); }


}
