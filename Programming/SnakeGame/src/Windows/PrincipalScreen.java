package Windows;

import Apple.*;
import Snake.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.Color;

public class PrincipalScreen {

    //Properties
    private Apple apple;
    private Snake snake;

    static public void createWindow(Apple apple, Snake snake){

        //Create the table to show the matrix of the map
        DefaultTableModel tableModel = new DefaultTableModel(35,35);
        JTable table = new JTable(tableModel);
        table.setBackground(Color.black);
        table.setLayout( new FlowLayout(FlowLayout.CENTER));

        //Add the apple to the table
        table.setDefaultRenderer(Object.class, new AppleCellRenderer());
        table.setValueAt("🍎", apple.getPositionX(), apple.getPositionY());

        //Add the snake to the table
        table.setDefaultRenderer(Object.class, new SnakeCellRenderer());
        table.setValueAt("🟩", snake.getPositionX(), snake.getPositionY());




        //Create text box for Score
        JLabel text1 = new JLabel();
        text1.setSize(50,20);
        text1.setText("Score " + 0);

        //Create text box for Record
        JLabel text2 = new JLabel();
        text2.setSize(50,20);
        text2.setText("Record " + 0);

        //Create a button to close the app
        JButton button = new JButton("Close");
        button.setSize(20,10);
        button.setBackground(Color.GRAY);


        //Create a box for the table
        JPanel box1 = new JPanel();
        box1.setSize(500,500);
        box1.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        box1.setLayout(new BorderLayout());
        box1.add(table, BorderLayout.CENTER);


        //Create a box for text and the button
        JPanel box2 = new JPanel();
        box2.setSize(300,100);
        box2.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
        box2.add(text1);
        box2.add(text2);
        box2.add(button);




        //Create the window
        JFrame window = new JFrame("Snake.Snake Game");
        //Size of the window
        window.setSize(600, 600);
        window.setLayout(new BorderLayout());
        //Window color
        window.setBackground(Color.lightGray);
        // When it's close the app finish
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //The user can change into its size
        window.setResizable(false);

        //Add elements
        window.add(box1, BorderLayout.CENTER);
        window.add(box2, BorderLayout.SOUTH);



        //Allow watch the window
        window.setVisible(true);

    }


}
