import javax.swing.*;
import java.awt.*;

public class Lab11E2_3 extends JFrame {
    private JPanel panel_input,panel_button;
    private JLabel label;
    private JTextField textField;
    private JButton Button1, Button2;
    public Lab11E2_3(String title,int width,int height) {

        setTitle(title);
        setSize(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel =  new JPanel(new GridLayout(7,1));
        buildPanel("What is your name?");
        panel.add(panel_input);
        buildPanel("How old are you?");
        panel.add(panel_input);
        buildPanel("What is your gender?");
        panel.add(panel_input);
        buildButtonPanel();
        panel.add(panel_button);
        add(panel);

        

        setVisible(true);
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

    private JPanel buildButtonPanel() {
        panel_button = new JPanel(new FlowLayout(0));
    
        Button1 = new JButton("Submit");
        Button2 = new JButton("Reset the form");
        
        panel_button.add(Button1);
        panel_button.add(Button2);
        return panel_button;
    }

    public static void main(String[] args) {
        new Lab11E2_3("GUI In-Class Ex 3", 400, 400);
    }
    
    
}