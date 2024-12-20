import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class PrincipalScreen {

    //Properties
    private Apple apple;
    private Snake snake;

    static public void createWindow(){

        //Create the table to show the matrix of the map
        JTable table = new JTable(35,35);
        table.setBackground(Color.black);
        table.setSize(500,400);

        //Create a box for the table
        JLabel box1 = new JLabel();
        box1.setSize(500,400);
        // Alineación izquierda, 10px de espacio horizontal, 20px vertical
        box1.setLayout(new FlowLayout(FlowLayout.CENTER));
        box1.add(table);






        //Create the window
        JFrame window = new JFrame("Snake Game");
        //Size of the window
        window.setSize(800, 700);
        //Window color
        window.setBackground(Color.lightGray);
        // When it's close the app finish
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //The user can change into its size
        window.setResizable(false);

        //Add elements
        window.add(box1);


        //Allow watch the window
        window.setVisible(true);

    }
}
