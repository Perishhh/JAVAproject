/**
	An example of using BorderLayout with 5 buttons.
*/

import java.awt.*;
import javax.swing.*;

public class BorderWindow extends JFrame {
	private JPanel panel;					// To reference a panel
	private JButton[] buttonArray;			// To reference an array of buttons
	private final int WINDOW_WIDTH = 310;	// Window width
	private final int WINDOW_HEIGHT = 200;	// Window height
	
	/**
		Constructor
	*/
	public BorderWindow() {
		// Set the window title.
		setTitle("BorderLayout Example");

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
		
		// Set the layout to BorderLayout
		panel.setLayout(new BorderLayout());
		// Try comment out the above line and uncomment the line below
		// It specifies 20 pixels horizontal gap and 50 pixels vertical gap
		//panel.setLayout(new BorderLayout(20, 50));

		// Create JButton array with size five and then
		// create the five JButton objects
		buttonArray = new JButton[5];
		for (int i = 0; i < buttonArray.length; i++)
			buttonArray[i] = new JButton("Button " + (i+1));
		
		// Add the five buttons into the five regions of 
		// the BorderLayout.
		panel.add(buttonArray[0], BorderLayout.CENTER);
		panel.add(buttonArray[1], BorderLayout.NORTH);
		panel.add(buttonArray[2], BorderLayout.SOUTH);
		panel.add(buttonArray[3], BorderLayout.WEST);
		// Try remove the second argument of Button 5, i.e. buttonArray[4].
		// What is the result?
		panel.add(buttonArray[4], BorderLayout.EAST);
	}
	
	/**
		main method
	*/
	public static void main(String[] args) {
		new BorderWindow();
	}
}
