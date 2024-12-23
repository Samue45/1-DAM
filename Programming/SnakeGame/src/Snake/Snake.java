package Snake;

import java.awt.*;
import java.util.LinkedList;

public class Snake {

    //Properties
    private LinkedList<int[]> body;
    private int positionX;
    private int positionY;
    private Color color;




    //Constructor
    public Snake(int startX, int startY) {
        body = new LinkedList<>();
        body.add(new int[] { startX, startY }); // Cabeza de la serpiente
    }

    public Snake(int positionX, int positionY, Color color) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.color = color;
    }

    public Snake() {}

    //Getter and Setter
    public LinkedList<int[]> getBody() {
        return body;}

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    //Methods of Snake class
   // The snake increase its size when eats the apple
    /*
    public void mover(int nuevaX, int nuevaY) {
            body.addFirst(new int[] { nuevaX, nuevaY }); // Añade nueva posición como cabeza
            body.removeLast(); // Quita la última posición (simula movimiento)
    }

    public void crecer() {
            // No elimines la última posición (simula el crecimiento de la serpiente)
            body.addLast(body.getLast());
    }*/


    //The snake dead when its head crashes with the limit of the map or with its body
    //Its head is the first column of our matrix, if the head position is equal to another like his body or is bigger than limits of the map
    // it means that it's dead
   /* public boolean dead(Snake snake){
        boolean isDead = false;

        //Position of its head


        //if (snake.getPositionX() == getPositionY() || ){}

        return isDead;
    }*/
}
