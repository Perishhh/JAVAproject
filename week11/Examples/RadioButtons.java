/**
	An example of correct use of radio buttons
*/

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class RadioButtons extends JFrame {
	private JPanel panel;					// To reference a panel
	private final int WINDOW_WIDTH = 300;	// Window width
	private final int WINDOW_HEIGHT = 170;	// Window height
	
	/**
		Constructor
	*/
	public RadioButtons() {
		// Set the window title.
		setTitle("Radio button Example");

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
		
		// Create the five radio buttons
		JRadioButton aPlusButton = new JRadioButton("A+");
		JRadioButton aButton = new JRadioButton("A");
		JRadioButton aMinusButton = new JRadioButton("A-", true);
		JRadioButton bPlusButton = new JRadioButton("B+");
		JRadioButton bButton = new JRadioButton("B");

		// Create an action listener and add it to the five radio buttons
		RadioActionListener raListener = new RadioActionListener();
		aPlusButton.addActionListener(raListener);
		aButton.addActionListener(raListener);
		aMinusButton.addActionListener(raListener);
		bPlusButton.addActionListener(raListener);
		bButton.addActionListener(raListener);

		// Add the five radio buttons into the same group
		ButtonGroup gradeGroup = new ButtonGroup();
		gradeGroup.add(aPlusButton);
		gradeGroup.add(aButton);
		gradeGroup.add(aMinusButton);
		gradeGroup.add(bPlusButton);
		gradeGroup.add(bButton);
		
		// Add the five radio buttons into the panel
		panel.add(aPlusButton);
		panel.add(aButton);
		panel.add(aMinusButton);
		panel.add(bPlusButton);
		panel.add(bButton);
	}
	
	private class RadioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Get the source instance and cast it to JRadioButton type
			JRadioButton source = (JRadioButton) e.getSource();
			System.out.println(source.getText() + " is selected");
		}
	}
	
	/**
		main method
	*/
	public static void main(String[] args) {
		new RadioButtons();
	}
}
