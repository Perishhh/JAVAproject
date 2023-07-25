/**
	An example of using JButton with action listener
*/

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonAction extends JFrame {
	private JPanel panel;					// To reference a panel
	private JLabel countLabel;				// To reference a label
	private final int WINDOW_WIDTH = 300;	// Window width
	private final int WINDOW_HEIGHT = 150;	// Window height
	
	private int clickCount = 0;				// Counts the number of button click
	
	/**
		Constructor
	*/
	public ButtonAction() {
		// Set the window title.
		setTitle("Button action Example");

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
		// Create a JPanel object and let the panel
		// field reference it.
		panel = new JPanel();
		
		// set the layout to BorderLayout
		panel.setLayout(new BorderLayout());
		
		// Create a button
		JButton myButton = new JButton("Hello");
		
		// Add action listener to the button
		myButton.addActionListener(new ButtonActionListener());

		// Create the label and update its content
		countLabel = new JLabel();
		updateCountLabel();

		// Add the button and label into the panel
		panel.add(myButton);	// Recall that it is added to CENTER by default
		panel.add(countLabel, BorderLayout.SOUTH);
	}

	// Update the content of the label according to the current count
	private void updateCountLabel() {
		countLabel.setText("Number of button click: " + clickCount);
	}
	
	private class ButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			// Get the source instance and cast it to JButton type
			JButton source = (JButton) e.getSource();
			System.out.println(source.getText() + " button is clicked, " + e.getActionCommand());

			// Increase the count and update the label
			clickCount++;
			updateCountLabel();
		}
	}
	
	/**
		main method
	*/
	public static void main(String[] args) {
		new ButtonAction();
	}
}
