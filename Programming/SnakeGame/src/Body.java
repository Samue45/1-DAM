import java.awt.*;

public class Body {

    //Properties
    private int positionX;
    private int positionY ;
    private Color color;
    private Head head;

    //Constructor
    public Body(int positionX, int positionY, Color color) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.color = color;
    }

    public Body(Head head) {
        this.head = head;
    }

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

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
