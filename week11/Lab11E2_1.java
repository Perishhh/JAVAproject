import javax.swing.*;
import java.awt.*;

public class Lab11E2_1 extends JFrame {
    private JPanel panel_Space,panel_input;
    private JLabel label;
    private JTextField textField;
    public Lab11E2_1(String title,int width,int height) {

        setTitle(title);
        setSize(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0,1));
        buildSpacePanel();
        buildPanel("What is your name?");

        add(panel_Space);
        add(panel_input);

        setVisible(true);
    }

    private void buildSpacePanel() {
        panel_Space = new JPanel();
    }

    private void buildPanel(String question) {
        panel_input = new JPanel();
        panel_input.setLayout(new BorderLayout());

        textField = new JTextField(100);
        label = new JLabel(question);
        
        textField.setHorizontalAlignment(JTextField.LEFT);
        label.setVerticalAlignment(JLabel.BOTTOM);

        panel_input.add(label,BorderLayout.WEST);
        panel_input.add(textField,BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        new Lab11E2_1("GUI In-Class Ex 1", 400, 120);
    }
    
    
}
