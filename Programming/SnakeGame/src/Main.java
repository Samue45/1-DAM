import Apple.Apple;
import Snake.Snake;
import Windows.PrincipalScreen;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple(16,16, Color.RED);
        Head head = new Head(18,18,Color.GREEN);
        Body body = new Body(19,18,Color.GREEN);
        Snake snake = new Snake(head,body);

        PrincipalScreen.createWindow(apple,snake);
    }
}
