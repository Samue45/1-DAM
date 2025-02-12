package Programming.Unit2.CompiladorPila;


import java.util.Stack;

public class Main {

    //Hacemos que la pila sea de acceso global
    static Stack<Character> pila = new Stack<>();

    public static void main(String[] args) {


        String codigo = "  public ArrayList<Curso> crearCursos() {\n" +
                "        ArrayList<Persona> alumnos = crearAlumnos();\n" +
                "        ArrayList<Curso> cursos = new ArrayList<>();}\n";



        System.out.println(compilar(codigo));

    }

    //Método que clasifice cada caracter
    private static TipoSimbolo clasificarChar (char car){
        // Tenemos 3 tipos: Resto, apertura o cierre
        //Por defecto es una caracter normal
        TipoSimbolo tipoSimbolo = TipoSimbolo.RESTO;
        if (car == '{' || car == '[' || car == '(') tipoSimbolo =TipoSimbolo.APERTURA;
        if (car == '}' || car == ']' || car == ')') tipoSimbolo =TipoSimbolo.CIERRE;

        return tipoSimbolo;
    }

    //Método que recorra el código, para poder ir clasifiando
    private static String compilar(String codigo){
        String mensaje = " ";
        boolean salir = true;

        //Empezamos a recorre el código
        for (int i = 0; i < codigo.length() && salir; i++) {

            //Si es un character de apertura, se guarda en la pila
            if(clasificarChar(codigo.charAt(i)) == TipoSimbolo.APERTURA) pila.push(codigo.charAt(i));

            //Si es un character de cierre, comprobar si es compatible con el character de apertura
            else if (clasificarChar(codigo.charAt(i)) == TipoSimbolo.CIERRE){
                //1º Sacamos el character de apertura de la pila
                if (pila.isEmpty()) {
                    mensaje ="No hay ningún error";
                    salir = false;}
                else {
                    char apertura = pila.pop();
                    //2º Comparamos  con character de cierre
                    char cierre = codigo.charAt(i);

                    // 3º ¿Qué ocurre cuando es true y cuando es false?
                    if (!compatibles(apertura, cierre))
                        //Si es true continuamos compilando
                        //Si es false mostramos un mensaje de error
                        mensaje = "ERROR SINTACTICO :/, ";


                }
            }
        }

        return mensaje;
    }

    //Método que compruebe si son compatibles
    private static boolean compatibles(char apertura, char cierre){
        boolean compatible = false;

        if (apertura == '{' && cierre == '}') compatible = true;
        else if (apertura == '[' && cierre == ']') compatible = true;
        else if (apertura == '('&& cierre == ')') compatible = true;

        return compatible;
    }

}
