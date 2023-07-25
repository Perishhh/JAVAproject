import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SalesTax extends JFrame {
    private JButton Button;
    private JPanel panel;
    private JTextField textField;
    private JLabel label,label_out1,label_out2,label_out3;
    private final double countyTaxRate = 0.02,stateTaxRate = 0.04;
    private JFrame output;
    public SalesTax(int width,int height) {
        setTitle("Monthly Sales Tax Reporter");
        setSize(width,height);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildPanel();
        add(panel);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private void buildPanel(){
        panel = new JPanel(new FlowLayout());

        label = new JLabel("Enter the total sales:");
        textField = new JTextField(12);
        Button = new JButton("Calculate Sales Tax");
        Button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    output = new JFrame();
                    output.setTitle("Report");
                    output.setSize(400,200);
                    output.setLayout(new GridLayout(3,1));
                    int sales = Integer.parseInt(textField.getText());
                    label_out1 = new JLabel("Country Sales Tax: "+sales*countyTaxRate);
                    label_out2 = new JLabel("State Sales Tax: "+sales*stateTaxRate);
                    label_out3 = new JLabel("Total Sales Tax: "+sales*(countyTaxRate+stateTaxRate));

                    output.add(label_out1);
                    output.add(label_out2);
                    output.add(label_out3);
                    output.setLocationRelativeTo(null);
                    output.setVisible(true);
                    new Timer(5000,new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e){
                            output.dispose();
                        }
                    }).start();
                } catch(NumberFormatException ex1){
                    JOptionPane.showMessageDialog(null, "Woops, something wrong..");
                }
            }
        });
        panel.add(label);
        panel.add(textField);
        panel.add(Button);   
    }
    
    public static void main(String[] args) throws InterruptedException{
        new SalesTax(400,100);
    }
}
