import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JFrame frame = new JFrame();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JButton b1 = new JButton("Add");

    JButton b2 = new JButton("Sub");


    void render() {

        t1.setBounds(20,20,200,50);
      //  t1.setText("Hi");
     //   System.out.println(t1.getText());
        frame.add(t1);
        t2.setBounds(20,80,200,50);
     //   t2.setText("hello");
     //   System.out.println(t2.getText());
        frame.add(t2);





        b1.setBounds(80,200,200,50);
        b1.addActionListener(this);
        frame.add(b1);

        b2.setBounds(80,260,200,50);
        b2.addActionListener(this);
        frame.add(b2);





        frame.setSize(600,600);
        frame.setTitle("Calculator");
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        t3.setBounds(20,140,200,50);
        frame.add(t3);
        int  t ;
        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());



        if(e.getSource()==b1){
            t = num1+ num2;
            t3.setText(String.valueOf(t));

        }
        if(e.getSource()==b2)
        {
            t = num1- num2;
            t3.setText(String.valueOf(t));
        }

    }
}
