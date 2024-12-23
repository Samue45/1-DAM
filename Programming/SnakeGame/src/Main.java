import Apple.*;
import Snake.*;
import Windows.PrincipalScreen;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple(16,16, Color.RED);
        Snake snake = new Snake(20,20, Color.GREEN);

        PrincipalScreen.createWindow(apple,snake);
    }
}
