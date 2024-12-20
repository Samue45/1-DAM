public class Head {

    //Properties
    private int positionX;
    private int positionY;
    private String color;

    //Constructor
    public Head(int positionX, int positionY, String color) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.color = color;
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
