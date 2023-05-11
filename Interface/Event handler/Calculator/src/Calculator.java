import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
   // JFrame frame = new JFrame();
    JTextField t1 = new JTextField();
    JTextField t2 = new JTextField();
    JTextField t3 = new JTextField();
    JButton b1 = new JButton("Add");

    JButton b2 = new JButton("Sub");


    //void render() {
    Calculator(){
        t1.setBounds(20,20,200,50);
      //  t1.setText("Hi");
     //   System.out.println(t1.getText());
        this.add(t1);
        t2.setBounds(20,80,200,50);
     //   t2.setText("hello");
     //   System.out.println(t2.getText());
        this.add(t2);





        b1.setBounds(80,200,200,50);
        b1.addActionListener(this);
        this.add(b1);

        b2.setBounds(80,260,200,50);
        b2.addActionListener(this);
        this.add(b2);





        this.setSize(600,600);
        this.setTitle("Calculator");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setVisible(true);


        t3.setBounds(20,140,200,50);
        this.add(t3);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


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
