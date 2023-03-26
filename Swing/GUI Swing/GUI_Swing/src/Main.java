import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("test");
        JTextField username = new JTextField("Enter your username");
        username.setBounds(50,100,150,30);
        frame.add(username);
        JTextField password = new JTextField("Enter password");
        password.setBounds(50,150,150,30);
        frame.add(password);
        JButton button = new JButton("Login");
        button.setBounds(150,250,100,30);
        frame.add(button);
        button.setBackground(Color.lightGray);
        String[] fruits = {"Apple","Orange","Grapes"};
        JComboBox comboBox = new JComboBox(fruits);
        comboBox.setBounds(150,350,300,50);
        frame.add(comboBox);




        frame.setSize(600 ,600);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}