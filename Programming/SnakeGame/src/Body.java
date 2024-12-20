public class Body {

    //Properties
    private int positionX;
    private int positionY ;
    private String color;
    private Head head;

    //Constructor
    public Body(int positionX, int positionY, String color) {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
