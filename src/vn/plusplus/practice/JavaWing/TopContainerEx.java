package vn.plusplus.practice.JavaWing;

import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollBar;
import sun.awt.image.codec.JPEGParam;

import javax.swing.*;
import java.awt.*;

public class TopContainerEx {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Giải phương trình bậc nhất");
        JButton buttonOK = new JButton("OK");
        JButton buttonRS = new JButton("RESET");
        JButton buttonExit = new JButton("EXIT");
        buttonOK.setBounds(200,300,85,30);
        buttonRS.setBounds(300,300,85,30);
        buttonExit.setBounds(400,300,85,30);
        JTextField jTextField = new JTextField();
        jTextField.setBounds(100,100,100,30);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150,150,100,30);
        JLabel label1 = new JLabel("Hien thi ket qua");
        label1.setBackground(Color.RED);
        label1.setForeground(Color.yellow);
        label1.setSize(100,100);
        frame.add(label1);
        frame.add(passwordField);
        frame.add(jTextField);
        frame.add(buttonOK);
        frame.add(buttonRS);
        frame.add(buttonExit);
        frame.setSize(700,700);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
