/**
	An example of setting alignments for JButton and JLabel.
*/

import java.awt.*;
import javax.swing.*;

public class Alignments extends JFrame {
	private JPanel panel;					// To reference a panel
	private JButton button1, button2;					// To reference buttons
	private JLabel label1, label2, label3;					// To reference labels
	private final int WINDOW_WIDTH = 310;	// Window width
	private final int WINDOW_HEIGHT = 200;	// Window height
	
	/**
		Constructor
	*/
	public Alignments() {
		// Set the window title.
		setTitle("Alignment Example");

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
		The buildPanel method adds three labels, and two buttons to a panel.
	*/
	private void buildPanel() {
		// Create a JPanel object and let the panel
		// field reference it.
		panel = new JPanel();
		
		// Set the layout to BorderLayout
		panel.setLayout(new BorderLayout());

		// Create two JButton objects
		button1 = new JButton("Button one");
		button2 = new JButton("Button two");
		
		// Set alignments to the buttons
		// Try other alignment arguments.
		button1.setVerticalAlignment(JButton.BOTTOM);
		//button1.setVerticalAlignment(JButton.TOP);
		//button1.setVerticalAlignment(JButton.CENTER);
		button2.setHorizontalAlignment(JButton.RIGHT);
		//button2.setHorizontalAlignment(JButton.LEFT);
		//button2.setHorizontalAlignment(JButton.CENTER);
		
		// Create a JLabel object
		label1 = new JLabel("Label one");
		label2 = new JLabel("Label two");
		label3 = new JLabel("Label three");
		
		// Set background colors to the three labels
		label1.setOpaque(true);
		label1.setBackground(Color.YELLOW);
		label2.setOpaque(true);
		label2.setBackground(Color.ORANGE);
		label3.setOpaque(true);
		label3.setBackground(Color.RED);
		
		// Add the five buttons into the five regions of 
		// the BorderLayout.
		panel.add(button1, BorderLayout.WEST);
		panel.add(button2, BorderLayout.NORTH);
		panel.add(label1, BorderLayout.EAST);
		panel.add(label2, BorderLayout.SOUTH);
		
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new FlowLayout());
		centerPanel.add(label3);
		panel.add(centerPanel, BorderLayout.CENTER);
		
		// Set alignments to the three labels.
		// Try other alignment arguments.
		// Why there is no effect to label3?
		label1.setVerticalAlignment(JLabel.TOP);
		label2.setHorizontalAlignment(JLabel.LEFT);
		label3.setHorizontalAlignment(JLabel.RIGHT);
		label3.setVerticalAlignment(JLabel.BOTTOM);
		
	}
	
	/**
		main method
	*/
	public static void main(String[] args) {
		new Alignments();
	}
}
