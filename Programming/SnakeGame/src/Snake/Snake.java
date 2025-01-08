package Snake;
import java.awt.*;
import java.util.LinkedList;

public class Snake {

    //Properties
    private LinkedList<Body > body;
    private String direction;


    //Constructor
    //We inicializate our Snake creating its head
    public Snake(Body newBody) {
        body = new LinkedList<>();
        body.add(newBody); // Snake head
    }


    public Snake() {
        body = new LinkedList<>();
    }

    //Getter and Setter
    public LinkedList<Body> getBody() {
        return body;}


    //Methods of Snake class
    public void mover(int newX, int newY) {
            Body newBody = new Body(newX,newY,Color.green);
            body.addFirst(newBody); // Añade nueva posición como cabeza
            body.removeLast(); // Quita la última posición (simula movimiento)
    }

    public void grown() {
        Body last = body.getLast(); // Obtiene el último segmento
        int newX = last.getPositionX();
        int newY = last.getPositionY();

        // Determina la posición del nuevo segmento según la dirección
        switch (direction.toUpperCase()) {
            case "UP":
                newY += 1; // Crece hacia abajo respecto al último segmento
                break;
            case "DOWN":
                newY -= 1; // Crece hacia arriba respecto al último segmento
                break;
            case "LEFT":
                newX += 1; // Crece hacia la derecha respecto al último segmento
                break;
            case "RIGHT":
                newX -= 1; // Crece hacia la izquierda respecto al último segmento
                break;
        }

        // Create and add the new segment
        Body newSegment = new Body(newX, newY, last.getColor());
        body.addLast(newSegment);
    }

    public boolean dead(){

        boolean isDead = false;

        //Positions of its head
        Body head = body.getFirst();
        int headX = head.getPositionX();
        int headY = head.getPositionY();

        //If Head snake has the same position that some part of its body -> Dead
        //1º We need to run the Snake body and compare all the positions with its head position
        for (int i = 1; i < body.size(); i++) {
            Body segment = body.get(i);
            if (headX == segment.getPositionX() && headY == segment.getPositionY()){
                isDead = true;
            }
        }

        //If Head snake has a position bigger or littler than the map -> Dead
        if (headX > 35 || headX < 0 ){
            isDead = true;
        }

        return isDead;
    }
}
