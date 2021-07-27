package vn.plusplus.practice.JavaWing;

import javax.swing.*;

public class SpringLayoutEx {
    public static void main(String[] args) {
        // Create and set up a frame window
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Layout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        SpringLayout layout = new SpringLayout();

        JLabel label = new JLabel("Label: ");
        JTextField text = new JTextField("", 10);
        panel.setSize(300, 300);
        panel.setLayout(layout);
        panel.add(label);
        panel.add(text);

        // Thêm các ràng buộc
        layout.putConstraint(SpringLayout.WEST, label, 5, SpringLayout.WEST, panel);
        layout.putConstraint(SpringLayout.NORTH, label, 5, SpringLayout.NORTH, panel);
        layout.putConstraint(SpringLayout.WEST, text, 5, SpringLayout.EAST, label);
        layout.putConstraint(SpringLayout.NORTH, text, 5, SpringLayout.NORTH, panel);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
