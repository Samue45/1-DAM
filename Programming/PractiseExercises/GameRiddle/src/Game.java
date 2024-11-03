import java.util.Random;
import java.util.Scanner;

public class Game {

    private Scanner input = new Scanner(System.in);
    private Random randomNumber = new Random();
    private int counter= 0;
    private final User user = new User();
    private String message;
    private int opportunities = 0;
    private boolean hasWon = false;

    //CONSTRUCTOR METHOD
    Game(){}

    //GETTER AND SETTER METHODS
    public String getMessage(){
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }



    //METHOD TO ASK THE DATA OF THE USER
    public void userData(){
        System.out.println("Introduce your name:");
        String name = input.next();
        user.setName(name);

        System.out.println("Introduce your surname:");
        String surname = input.next();
        user.setSurname(surname);
    }

    //METHOD TO PRESENT THE APP
    public String welcome(){
        return "Welcome to the Mysterious Game, player " + user.getName() + " "+  user.getSurname();
    }

    //LOGIC OF THE APP
    public void instructions(){

        opportunities = 5;
        int numberMachine = randomNumber.nextInt(100);

        for (int counter = 0; counter <= 5; counter++){

            System.out.println("Introduce a number among 1 and 100:");
            int number = input.nextInt();

            System.out.println("You have " + opportunities + " opportunities");

            if (numberMachine < number ){
                setMessage("The mysterious number is less than your number");
            } else if ( numberMachine > number){
                setMessage("The mysterious number is bigger than your number");
            }else  if (numberMachine == number) {
                setMessage("Congratulations, you win the game ;)");
                System.out.println(getMessage());
                hasWon = true;  // Marcar que el jugador ha ganado
                break; // Salir del bucle
            }

            System.out.println(getMessage());
            opportunities--;
        }

        // Verificar si el jugador no ganó
        if (!hasWon) {
            System.out.println("You've used all your attempts. The correct number was " + numberMachine);
        }

    }

}
