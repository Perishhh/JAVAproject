/**
	An example of using null layout with overlapping labels.
	Try to change JLabel to JButton. The top/bottom order is then 
	NOT guaranteed because mouse hover on a button may bring a 
	button to top. 
	The top/bottom order can be guaranteed if using LayeredPane (See example LayeredWindow.java).
*/

import java.awt.*;
import javax.swing.*;

public class CustomPosSizeWindow extends JFrame {
	private JPanel panel;					// To reference a panel
	private JLabel topLabel;				// To reference a label
	private JLabel bottomLabel;			// To reference a label
	private final int WINDOW_WIDTH = 700;	// Window width
	private final int WINDOW_HEIGHT = 400;	// Window height
	
	/**
		Constructor
	*/
	public CustomPosSizeWindow() {
		// Set the window title.
		setTitle("Custom position and size Example with overlap");

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
		panel.setLayout(null);

		// Create the top button
		topLabel = new JLabel("Top");
		// Set the position and size of top button
		topLabel.setBounds(200, 200, 100, 100);
		topLabel.setOpaque(true);
		topLabel.setBackground(Color.WHITE);

		// Create the bottom button
		bottomLabel = new JLabel("Bottom");
		// Set the position and size of button button
		bottomLabel.setBounds(150, 150, 100, 100);
		bottomLabel.setOpaque(true);
		bottomLabel.setBackground(Color.RED);
		
		// Add the two buttons to panel
		// in the order that topButton is added first
		// Try reverse the add order
		panel.add(topLabel);
		panel.add(bottomLabel);
		
	}
	
	/**
		main method
	*/
	public static void main(String[] args) {
		new CustomPosSizeWindow();
	}
}
