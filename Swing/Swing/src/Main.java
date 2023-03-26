import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello world");

        JTextField textField = new JTextField("Hi upasana");
        JButton button = new JButton("Click me!");
        textField.setBounds(50,50,200,100);
        frame.add(textField);
        button.setBounds(200,200,100,50);
        frame.getContentPane().setBackground(Color.BLACK);
        //To attach the button to the frame
        frame.add(button);
        button.setBackground(Color.pink);
        textField.setBackground(Color.lightGray);
        //  textField.setFont(Font.);

        frame.setSize(600,700);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}