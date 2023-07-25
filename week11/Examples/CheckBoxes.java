/**
	An example of using JCheckBox
*/

import java.awt.*;
import javax.swing.*;

public class CheckBoxes extends JFrame {
	private JPanel panel;					// To reference a panel
	private final int WINDOW_WIDTH = 300;	// Window width
	private final int WINDOW_HEIGHT = 150;	// Window height
	
	/**
		Constructor
	*/
	public CheckBoxes() {
		// Set the window title.
		setTitle("Checkbox Example");

		// Set the size of the window.
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		// Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Build the panel.
		buildPanel();

		// Set the layout to FlowLayout
		setLayout(new FlowLayout());

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
		// Create a JPanel object and let the panel
		// field reference it.
		panel = new JPanel();
		
		// Set the layout to GridLayout with 4 rows and 1 column
		panel.setLayout(new GridLayout(4,1));
		
		// Create the four checkboxes
		JCheckBox javaBox = new JCheckBox("Java");
		JCheckBox pythonBox = new JCheckBox("Python");
		JCheckBox cppBox = new JCheckBox("C++", true);
		JCheckBox swiftBox = new JCheckBox("Swift");
		
		// Add the checkboxes into panel
		panel.add(javaBox);
		panel.add(pythonBox);
		panel.add(cppBox);
		panel.add(swiftBox);
	}
	
	/**
		main method
	*/
	public static void main(String[] args) {
		new CheckBoxes();
	}
}
