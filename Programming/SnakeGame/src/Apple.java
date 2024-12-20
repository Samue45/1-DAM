import java.util.Random;

public class Apple {

    //Properties
    private int positionX = 18;
    private int positionY = 16;
    private String color = Color.rojo;
    private int score = 0;
    private int bestScore = 0;
    private Snake snake;
    private Random random;

    //Constructor
    public Apple(int positionX, int positionY, String color, int score, int bestScore, Snake snake) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.color = color;
        this.score = score;
        this.bestScore = bestScore;
        this.snake = snake;
    }

    public Apple(int positionX, int bestScore, int score, String color, int positionY) {
        this.positionX = positionX;
        this.bestScore = bestScore;
        this.score = score;
        this.color = color;
        this.positionY = positionY;
    }

    public Apple() {
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

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getBestScore() {
        return bestScore;
    }

    public void setBestScore(int bestScore) {
        this.bestScore = bestScore;
    }

    public Snake getSnake() {
        return snake;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }


    //Methods of Apple class

    //The snake eats the apple
    /*public boolean isEat(Apple apple, Snake snake){
        //Apple positions
        int positionXApple = apple.getPositionX();
        int positionYApple = apple.getPositionY();

        //Snake positions
        int positionXSnake = snake.getPositionX();
        int positionYSnake = snake.getPositionY();

        boolean isEat = false;

        if (positionXApple == positionXSnake && positionYApple == positionYSnake){
            //The apple disappear
            disappear();
            //The snake grown
            snake.grown();
            //The score increased
            score++;
            //The best score also increased
            bestScore();
            //The apple appear
            appear();
            // The boolean isEat is true
            isEat = true;
        }

        return isEat;
    }*/

    //The apple appear in a new position
    public void appear(){
        //1º Set a new random position to the apple
        setPositionX(random.nextInt(0,35));
        setPositionY(random.nextInt(0,35));
        //2º Set a red color
        setColor(Color.rojo);
    }

    //The apple disappear from the map
    public void disappear(){
        //Set the apple color to black, so it simulates that disappear
        setColor(Color.negro);
    }

    // Save the best score of the player
    public void bestScore(){
        if (getScore() > getBestScore()){
            setBestScore(getScore());
        }
    }

}
