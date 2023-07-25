/**
	An example of get and set text for JButton, JLabel and JTextField.
*/

import java.awt.*;
import javax.swing.*;

public class GetSetText extends JFrame {
	private JPanel panel;					// To reference a panel
	private JButton button;					// To reference a button
	private JLabel label;					// To reference a label
	private JTextField textField;			// To reference a textfield
	private final int WINDOW_WIDTH = 310;	// Window width
	private final int WINDOW_HEIGHT = 200;	// Window height
	
	/**
		Constructor
	*/
	public GetSetText() {
		// Set the window title.
		setTitle("Get and Set Text Example");

		// Set the size of the window.
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		// Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Build the panel.
		buildPanel();

		// Add the panel to the frame's content pane.
		add(panel);

		// Display the window.
		setVisible(true);
	}
	
	/**
		The buildPanel method adds a label, a text field,
		and a button to a panel.
	*/
	private void buildPanel() {
		// Create a label to display instructions.
		label = new JLabel("Initial label");

		// Create a text field 10 characters wide.
		textField = new JTextField(15);

		// Create a button with the caption "Calculate".
		button = new JButton("Initial button");

		// Create a JPanel object and let the panel
		// field reference it.
		panel = new JPanel();

		// Add the label, text field, and button
		// components to the panel.
		panel.add(label);
		panel.add(textField);
		panel.add(button);
	}
	
	public void updateContent() throws InterruptedException {
		String labelString = label.getText();
		String buttonString = button.getText();
		String textFieldString = textField.getText();
		System.out.println("The label content is " + labelString);
		System.out.println("The button content is " + buttonString);
		System.out.println("The text field content is " + textFieldString);
		
		System.out.println("Wait 5 seconds, the content will change");
		Thread.sleep(5000);
		label.setText("New label");
		button.setText("New button");
		textField.setText("New text field");
		
		labelString = label.getText();
		buttonString = button.getText();
		textFieldString = textField.getText();		
		System.out.println("---- After update ----");
		System.out.println("The label content is " + labelString);
		System.out.println("The button content is " + buttonString);
		System.out.println("The text field content is " + textFieldString);
	}
	
	/**
		main method
	*/
	public static void main(String[] args) throws InterruptedException {
		GetSetText example = new GetSetText();
		example.updateContent();
	}
}
