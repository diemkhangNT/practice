package vn.plusplus.practice.JavaWing;

//public class BoxLayoutEx {
//}
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class BoxLayoutEx {
//BoxLayout sắp xếp theo chiều ngang.
    public static void main(String[] args) {
        // Create and set up a frame window
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("BoxLayout Example X_AXIS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tạo mới Panel
        JPanel panel = new JPanel();

        // Tạo Boxlayout với hằng số X_AXIS
        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);

        panel.setLayout(boxlayout);

        // Tạo Border cho panel
        panel.setBorder(new EmptyBorder(new Insets(150, 200, 150, 200)));

        // Tạo các Button
        JButton jb1 = new JButton("Button 1");
        JButton jb2 = new JButton("Button 2");
        JButton jb3 = new JButton("Button 3");

        // Thêm Button vào Panel
        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);


        frame.add(panel);
        frame.pack();
        frame.setVisible(true);

    }

}