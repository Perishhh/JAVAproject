/**
	An example of using titled border
*/

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

public class RadioButtonsWithBorder extends JFrame {
	private JPanel panel;					// To reference a panel
	private final int WINDOW_WIDTH = 300;	// Window width
	private final int WINDOW_HEIGHT = 150;	// Window height
	
	/**
		Constructor
	*/
	public RadioButtonsWithBorder() {
		// Set the window title.
		setTitle("Titled Border Example");

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
		
		// Set the layout to BorderLayout
		panel.setLayout(new GridLayout(3,2));

		// Create five radio buttons
		JRadioButton aPlusButton = new JRadioButton("A+");
		JRadioButton aButton = new JRadioButton("A");
		JRadioButton aMinusButton = new JRadioButton("A-", true);
		JRadioButton bPlusButton = new JRadioButton("B+");
		JRadioButton bButton = new JRadioButton("B");
		
		// Create the action listener and add it to all the five radio buttons
		RadioActionListener raListener = new RadioActionListener();
		aPlusButton.addActionListener(raListener);
		aButton.addActionListener(raListener);
		aMinusButton.addActionListener(raListener);
		bPlusButton.addActionListener(raListener);
		bButton.addActionListener(raListener);

		// Add the radio buttons into a group 
		// such that only one radio button can be selected.
		ButtonGroup gradeGroup = new ButtonGroup();
		gradeGroup.add(aPlusButton);
		gradeGroup.add(aButton);
		gradeGroup.add(aMinusButton);
		gradeGroup.add(bPlusButton);
		gradeGroup.add(bButton);
		
		// Add the radio buttons into the panel
		panel.add(aPlusButton);
		panel.add(aButton);
		panel.add(aMinusButton);
		panel.add(bPlusButton);
		panel.add(bButton);

		// Create a titled border
		Border radioBorder = BorderFactory.createTitledBorder("Grades");
		
		// Set the titled border to the panel
		panel.setBorder(radioBorder);
	}
	
	private class RadioActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			JRadioButton source = (JRadioButton) e.getSource();
			System.out.println(source.getText() + " is selected");
		}
	}
	
	/**
		main method
	*/
	public static void main(String[] args) {
		new RadioButtonsWithBorder();
	}
}
