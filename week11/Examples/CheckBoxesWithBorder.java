/**
	An example of using line border
*/

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class CheckBoxesWithBorder extends JFrame {
	private JPanel panel;					// To reference a panel
	private final int WINDOW_WIDTH = 300;	// Window width
	private final int WINDOW_HEIGHT = 150;	// Window height
	
	/**
		Constructor
	*/
	public CheckBoxesWithBorder() {
		// Set the window title.
		setTitle("Checkbox with border Example");

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
		
		// Add the four checkboxes into panel
		panel.add(javaBox);
		panel.add(pythonBox);
		panel.add(cppBox);
		panel.add(swiftBox);

		// Create a line border and set the panel to use it
		Border border = BorderFactory.createLineBorder(Color.BLUE, 2);
		panel.setBorder(border);
	}
	
	/**
		main method
	*/
	public static void main(String[] args) {
		new CheckBoxesWithBorder();
	}
}
