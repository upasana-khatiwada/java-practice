import javax.swing.*;

public class GUI {

    JFrame frame = new JFrame();
    GameUi ui = new GameUi();
    void render(){
        frame.add(ui);
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
