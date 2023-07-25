/**
	An example of using null layout with overlapping labels.
	Try to change JLabel to JButton. The top/bottom order is then 
	NOT guaranteed because mouse hover on a button may bring a 
	button to top, unless use LayeredPane to force the order.
*/

import java.awt.*;
import javax.swing.*;

public class LayeredWindow extends JFrame {
	private JPanel panel;					// To reference a panel
	private JButton topButton;				// To reference a label
	private JButton bottomButton;			// To reference a label
	private final int WINDOW_WIDTH = 400;	// Window width
	private final int WINDOW_HEIGHT = 400;	// Window height
	
	/**
		Constructor
	*/
	public LayeredWindow() {
		// Set the window title.
		setTitle("LayeredPane Example");

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
		
		JLayeredPane layeredPane = new JLayeredPane();

		// Create the top button
		topButton = new JButton("Top");
		// Set the position and size of top button
		topButton.setBounds(200, 200, 100, 100);
		topButton.setBackground(Color.WHITE);

		// Create the bottom button
		bottomButton = new JButton("Bottom");
		// Set the position and size of button button
		bottomButton.setBounds(150, 150, 100, 100);
		bottomButton.setBackground(Color.RED);
		
		// Add the two buttons to panel
		// in the order that topButton is added first
		// Try swap the layer index
		layeredPane.setLayer(bottomButton, 1);
		layeredPane.setLayer(topButton, 2);
		// Try reverse the add order
		layeredPane.add(bottomButton);
		layeredPane.add(topButton);
		
		// Set the position and size of the layered pane
		layeredPane.setBounds(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
		// Add the layeredPane to the panel with null layout
		panel.add(layeredPane);
	}
	
	/**
		main method
	*/
	public static void main(String[] args) {
		new LayeredWindow();
	}
}
