import javax.swing.*;
import java.awt.*;

public class Lab11E2_2 extends JFrame {
    private JPanel panel_Space,panel_button;
    private JButton Button1, Button2;
    public Lab11E2_2(String title,int width,int height) {

        setTitle(title);
        setSize(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout(FlowLayout.LEFT));

        buildSpacePanel();
        buildPanel();

        add(panel_Space);
        add(panel_button);

        setVisible(true);
    }

    private void buildSpacePanel() {
        panel_Space = new JPanel();
    }

    private void buildPanel() {
        panel_button = new JPanel();

        Button1 = new JButton("Submit");
        Button2 = new JButton("Reset the form");
        
        add(Button1);
        add(Button2);
    }

    public static void main(String[] args) {
        new Lab11E2_2("GUI In-Class Ex 2", 500, 200);
    }
    
    
}