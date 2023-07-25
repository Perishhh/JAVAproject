/**
	An example of incorrectly use of radio buttons
*/

import java.awt.*;
import javax.swing.*;

public class UngroupedRadioButtons extends JFrame {
	private JPanel panel;					// To reference a panel
	private final int WINDOW_WIDTH = 400;	// Window width
	private final int WINDOW_HEIGHT = 170;	// Window height
	
	/**
		Constructor
	*/
	public UngroupedRadioButtons() {
		// Set the window title.
		setTitle("Ungrouped Radio Button Example");

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
		
		// Set the layout to GridLayout with 5 rows and 1 column
		panel.setLayout(new GridLayout(5,1));
		
		// Create the five radio buttons.
		// The radio buttons are not grouped, 
		// so multiple radio buttons can be selected.
		JRadioButton aPlusBox = new JRadioButton("A+");
		JRadioButton aBox = new JRadioButton("A");
		JRadioButton aMinusBox = new JRadioButton("A-", true);
		JRadioButton bPlusBox = new JRadioButton("B+");
		JRadioButton bBox = new JRadioButton("B");
		
		// Add the five buttons into panel
		panel.add(aPlusBox);
		panel.add(aBox);
		panel.add(aMinusBox);
		panel.add(bPlusBox);
		panel.add(bBox);
	}
	
	/**
		main method
	*/
	public static void main(String[] args) {
		new UngroupedRadioButtons();
	}
}
