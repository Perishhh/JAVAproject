/**
	An example of nested layout
*/

import java.awt.*;
import javax.swing.*;

public class BorderPanelWindow extends JFrame {
	private JPanel panel;					// To reference a panel
	private final int WINDOW_WIDTH = 500;	// Window width
	private final int WINDOW_HEIGHT = 200;	// Window height
	
	/**
		Constructor
	*/
	public BorderPanelWindow() {
		// Set the window title.
		setTitle("Nested Panel Example");

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


		// Create and add five buttons to each region of the panel.
		// It is just the same as border layout, try the commented codes 
		// below instead.
		//panel.add(new JButton("Button 1"), BorderLayout.NORTH);
		//panel.add(new JButton("Button 2"), BorderLayout.SOUTH);
		//panel.add(new JButton("Button 3"), BorderLayout.WEST);
		//panel.add(new JButton("Button 4"), BorderLayout.EAST);
		//panel.add(new JButton("Button 5"), BorderLayout.CENTER);
		

		// Try comment out the above codes and use the codes below instead
		// Create five subpanels, each keeps one button
		// and then add the five subpanels to each region of the panel.
		/*
		JPanel panel1 = new JPanel();
		panel1.add(new JButton("Button 1"));
		panel.add(panel1, BorderLayout.NORTH);
		
		JPanel panel2 = new JPanel();
		panel2.add(new JButton("Button 2"));
		panel.add(panel2, BorderLayout.SOUTH);

		JPanel panel3 = new JPanel();
		panel3.add(new JButton("Button 3"));
		panel.add(panel3, BorderLayout.WEST);
		
		JPanel panel4 = new JPanel();
		panel4.add(new JButton("Button 4"));
		panel.add(panel4, BorderLayout.EAST);
		
		JPanel panel5 = new JPanel();
		panel5.add(new JButton("Button 5"));
		panel.add(panel5, BorderLayout.CENTER);
		*/
		
		// Try comment out the above codes and use the codes below instead
		// Make the JFrame contains four buttons and one panel.
		// panel5 contains 5 buttons using border layout.
		
		panel.add(new JButton("Button 1"), BorderLayout.NORTH);
		panel.add(new JButton("Button 2"), BorderLayout.SOUTH);
		panel.add(new JButton("Button 3"), BorderLayout.WEST);
		panel.add(new JButton("Button 4"), BorderLayout.EAST);
		
		JPanel panel5 = new JPanel();
		panel5.setLayout(new BorderLayout());
		panel5.add(new JButton("Button 5.1"), BorderLayout.NORTH);
		panel5.add(new JButton("Button 5.2"), BorderLayout.SOUTH);
		panel5.add(new JButton("Button 5.3"), BorderLayout.WEST);
		panel5.add(new JButton("Button 5.4"), BorderLayout.EAST);
		panel5.add(new JButton("Button 5.5"), BorderLayout.CENTER);
		panel.add(panel5, BorderLayout.CENTER);		
		
	}
	
	/**
		main method
	*/
	public static void main(String[] args) {
		new BorderPanelWindow();
	}
}
