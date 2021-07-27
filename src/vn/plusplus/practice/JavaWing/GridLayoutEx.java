package vn.plusplus.practice.JavaWing;

import javax.swing.*;
import java.awt.*;

public class GridLayoutEx {

    public static void main(String[] args) {
        // Create and set up a frame window
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("GridLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JButton jb1 = new JButton("Button 1");
        JButton jb2 = new JButton("Button 2");
        JButton jb3 = new JButton("Button 3");
        JButton jb4 = new JButton("Button 4");
        JButton jb5 = new JButton("Button 5");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(2, 3,50,50));
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);
        panel.add(jb4);
        panel.add(jb5);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }

}
