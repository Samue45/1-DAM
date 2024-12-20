import java.util.ArrayList;

public class Snake {

    //Properties
    private Head head;
    private Body body;
    // The snake is similar a Matrix with one row and dynamic columns
    private ArrayList<ArrayList<Body>> size;


    //Constructor
    public Snake(ArrayList<ArrayList<Body>> size) {
        this.size = size;
    }

    public Snake(Head head, Body body) {
        this.head = head;
        this.body = body;
    }

    public Snake() {}

    //Getter and Setter
    public ArrayList<ArrayList<Body>> getSize() {
        return size;
    }

    public void setSize(ArrayList<ArrayList<Body>> size) {
        this.size = size;
    }


    //Methods of Snake class

    //The snake increase its size when eats the apple
    public void grown(){
        //Its maximum size is 1.225, because is the size of the map (35x35)

        //1º We need to create the columns
        for (int i = 0; i < 1.225; i++) {
            size.add(new ArrayList<>());
        }

        //2º We need to increase the number of columns of the ArrayList and set the green color
        for (int i = 0; i < 1.225; i++) {
            if (i == 0){
                Head head = new Head(18,18,Color.verde);
                size.get(i).add(new Body(head));// Add the head of the snake
            }else {
                size.get(i).add(new Body(head.getPositionX(), head.getPositionY() + 1, Color.verde));// Add a new elements to column
            }
        }
    }

    //The snake dead when its head crashes with the limit of the map or with its body
    //Its head is the first column of our matrix, if the head position is equal to another like his body or is bigger than limits of the map
    // it means that it's dead
    public boolean dead(Snake snake){
        boolean isDead = false;

        //Position of its head
        int positionX = head.getPositionX();
        int positionY = head.getPositionY();

        //if (snake.getPositionX() == getPositionY() || ){}

        return isDead;
    }
}
