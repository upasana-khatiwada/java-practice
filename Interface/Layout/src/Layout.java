import javax.swing.*;
import java.awt.*;

public class Layout {
    JFrame frame = new JFrame();
    void render(){
        JPanel p1 = new JPanel();
        p1.setBackground(Color.ORANGE);
        frame.setLayout(new BorderLayout());
        frame.add(p1,BorderLayout.WEST);
        p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
      //  p1.setLayout(new FlowLayout(FlowLayout.LEFT,3,3));

        p1.add(new JButton("click"));
        p1.add(new JButton("click"));
        p1.add(new JButton("click"));

        JPanel p2 = new JPanel();
        p2.setBackground(Color.BLACK);
        frame.add(p2,BorderLayout.EAST);

        JPanel p3 = new JPanel();
        p3.setBackground(Color.BLUE);
        frame.add(p3,BorderLayout.NORTH);
        p3.setLayout(new FlowLayout(FlowLayout.LEFT,3,3));
        p3.add(new JButton("click"));
        p3.add(new JButton("click"));
        p3.add(new JButton("click"));






        JPanel p4 = new JPanel();
        p4.setBackground(Color.PINK);
        frame.add(p4,BorderLayout.SOUTH);

        JPanel p5 = new JPanel();
        p5.setBackground(Color.RED);
        p5.setLayout((new GridLayout(2,2,5,3)));
        p5.add(new JButton("click"));
        p5.add(new JButton("click"));
        p5.add(new JButton("click"));
        frame.add(p5,BorderLayout.CENTER);
        //p5.setLayout(new BoxLayout(p5,));







        frame.setSize(600,600);
        frame.setTitle("Layout");
       // frame.setLayout(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);



    }

}
