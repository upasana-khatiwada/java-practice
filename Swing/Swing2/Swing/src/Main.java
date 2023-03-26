import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Hello");
        //To avoid resizing the frame
        frame.setResizable(false);
        //To set the size of the frame
        frame.setSize(400,400);
        frame.setLayout(null);
        frame.setVisible(true);//toggle visibility
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//stops the program or exit it when close


        JButton button = new JButton("Click Here");
        button.setBounds(100,100,100,100);
       frame.add(button);

       frame.getContentPane().setBackground(Color.CYAN);

    }
}