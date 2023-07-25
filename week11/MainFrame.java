import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {

    private JLabel resultLabel;

    public MainFrame() {
        setTitle("Ten Times Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new FlowLayout());

        JLabel inputLabel = new JLabel("Enter a number:");
        JTextField inputField = new JTextField(10);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(inputField.getText());
                    int result = num * 10;

                    JFrame resultFrame = new JFrame("Result");
                    resultFrame.setSize(300, 100);

                    resultLabel = new JLabel("The result is: " + result);
                    resultLabel.setHorizontalAlignment(JLabel.CENTER);
                    resultFrame.add(resultLabel);

                    resultFrame.setVisible(true);

                    new Timer(5000, new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            resultFrame.dispose();
                        }
                    }).start();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(MainFrame.this, "Please enter a valid number.");
                }
            }
        });

        panel.add(inputLabel);
        panel.add(inputField);
        panel.add(calculateButton);

        add(panel);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainFrame();
    }
}