/**
	The KiloConverter class displays a JFrame that
	consists of a message label, a text field and 
	a button. In this example, we display these 
	three components with setting the background and 
	foreground color.
*/

import java.awt.*;
import javax.swing.*;

public class ColorWindow extends JFrame {
	private JPanel panel;					// To reference a panel
	private JLabel messageLabel;			// To reference a label
	private JTextField kiloTextField;		// To reference a text field
	private JButton calcButton;				// To reference a button
	private final int WINDOW_WIDTH = 310;	// Window width
	private final int WINDOW_HEIGHT = 100;	// Window height
	
	/**
		Constructor
	*/
	public ColorWindow() {
		// Set the window title.
		setTitle("Kilometer Converter with color settings");

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
		messageLabel = new JLabel("Enter a distance " + "in kilometers");
		// Set the label background to non-transparent.
		messageLabel.setOpaque(true);
		// Set background color of the label
		messageLabel.setBackground(Color.BLACK);
		// Set text color of the label
		messageLabel.setForeground(Color.YELLOW);

		// Create a text field 10 characters wide.
		kiloTextField = new JTextField(10);
		// Set background color of the text field
		kiloTextField.setBackground(Color.YELLOW);
		// Set foreground color of the text field
		kiloTextField.setForeground(Color.RED);

		// Create a button with the caption "Calculate".
		calcButton = new JButton("Calculate");
		// Set background color of the button
		calcButton.setBackground(Color.RED);
		// Set foreground color of the button
		calcButton.setForeground(Color.PINK);

		// Create a JPanel object and let the panel
		// field reference it.
		panel = new JPanel();

		// Add the label, text field, and button
		// components to the panel.
		panel.add(messageLabel);
		panel.add(kiloTextField);
		panel.add(calcButton);
	}
	
	/**
		main method
	*/
	public static void main(String[] args) {
		new ColorWindow();
	}
}