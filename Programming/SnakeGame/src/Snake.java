import java.util.ArrayList;

public class Snake {

    //Properties
    private int positionX;
    private int positionY;
    private String color;
    // The snake is similar a Matrix with one row and dynamic columns
    private ArrayList<ArrayList<String>> size;
    private Map map;


    //Constructor


    public Snake(int positionX, int positionY, String color, ArrayList<ArrayList<String>> size, Map map) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.color = color;
        this.size = size;
        this.map = map;
    }

    public Snake() {}

    //Getter and Setter

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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public ArrayList<ArrayList<String>> getSize() {
        return size;
    }

    public void setSize(ArrayList<ArrayList<String>> size) {
        this.size = size;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
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
            size.get(i).add(Color.verde); // Add a new elements to column
        }
    }

    //The snake dead when its head crashes with the limit of the map or with its body
    //Its head is the first column of our matrix, if the head position is equal to another like his body or is bigger than limits of the map
    // it means that it's dead
    public boolean dead(Snake snake, Map map){
        boolean isDead = false;

        //Position of its head
        positionX = getSize().indexOf(getSize().getFirst());

        //if (snake.getPositionX() == getPositionY() || ){}

        return isDead;
    }
}
