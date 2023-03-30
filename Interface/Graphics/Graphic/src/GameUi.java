import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameUi extends JPanel implements ActionListener {

    int boxX = 10, boxY = 10;

    GameUi(){
        JButton button = new JButton("Move");
        button.addActionListener(this);
        add(button);

    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
       // g.draw3DRect(20,20,50,50,true);
        g.setColor(Color.GREEN);
        g.fillRect(boxX,boxY,100,100);

        g.setColor(Color.CYAN);
        g.fillRect(10,150,200,200);

        g.setColor(Color.DARK_GRAY);
        g.draw3DRect(200,30,100,100,true);
        g.fill3DRect(180,20,80,80,true);


        g.drawLine(200,30,180,20);
        g.setColor(Color.cyan);
        setBackground(Color.pink);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//
//
            boxX+=10;
            repaint();
//
//




    }
}
