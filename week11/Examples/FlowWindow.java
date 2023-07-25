/**
	An example of using FlowLayout with 5 buttons.
*/

import java.awt.*;
import javax.swing.*;

public class FlowWindow extends JFrame {
	private JPanel panel;					// To reference a panel
	private JButton[] buttonArray;			// To reference an array of buttons
	private final int WINDOW_WIDTH = 310;	// Window width
	private final int WINDOW_HEIGHT = 200;	// Window height
	
	/**
		Constructor
	*/
	public FlowWindow() {
		// Set the window title.
		setTitle("FlowLayout Example");

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
		
		// Set the layout to FlowLayout and align to right
		panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
		// Try comment out the above and uncomment the one below
		// which align to left with 20 pixels horizontal gap and 
		// 50 pixels vertical gap
		//panel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 50));

		// Create JButton array with size five and then
		// create the five JButton objects and then 
		// add them to panel
		buttonArray = new JButton[5];
		for (int i = 0; i < buttonArray.length; i++) {
			buttonArray[i] = new JButton("Button " + (i+1));
			panel.add(buttonArray[i]);
		}
	}
	
	/**
		main method
	*/
	public static void main(String[] args) {
		new FlowWindow();
	}
}
