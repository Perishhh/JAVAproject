/**
	An example of using GridLayout with 35 buttons.
*/

import java.awt.*;
import javax.swing.*;

public class GridWindow extends JFrame {
	private JPanel panel;					// To reference a panel
	private JButton[] buttonArray;			// To reference an array of buttons
	private final int WINDOW_WIDTH = 750;	// Window width
	private final int WINDOW_HEIGHT = 300;	// Window height
	
	/**
		Constructor
	*/
	public GridWindow() {
		// Set the window title.
		setTitle("GridLayout example");

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
		int numRows = 5;
		int numCols = 7;
		// Create a JPanel object and let the panel
		// field reference it.
		panel = new JPanel();
		
		// Set the layout to GridLayout
		panel.setLayout(new GridLayout(numRows, numCols));
		// Try also each of the followings.
		//panel.setLayout(new GridLayout(0, numRows*numCols));
		//panel.setLayout(new GridLayout(1, numRows*numCols));
		//panel.setLayout(new GridLayout(numRows*numCols, 0));
		//panel.setLayout(new GridLayout(numRows*numCols, 1));
		//panel.setLayout(new GridLayout(numRows/2, numCols/2));
		//panel.setLayout(new GridLayout(0, 0));

		// Create JButton array with size 35 and then
		// create the 35 JButton objects and then 
		// add them to panel
		buttonArray = new JButton[numRows * numCols];
		for (int i = 0; i < numRows * numCols; i++) {
			buttonArray[i] = new JButton("Button " + (i + 1));
			panel.add(buttonArray[i]);
		}
	}
	
	/**
		main method
	*/
	public static void main(String[] args) {
		new GridWindow();
	}
}
