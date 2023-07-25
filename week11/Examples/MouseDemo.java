/**
	An example of using MouseListener.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDemo extends JFrame {
	private JPanel panel;					// To reference a panel
	private final int WINDOW_WIDTH = 350;	// Window width
	private final int WINDOW_HEIGHT = 150;	// Window height
	
	/**
		Constructor
	*/
	public MouseDemo() {
		// Set the window title.
		setTitle("Mouse Event Example");

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

		// Create five subpanels, each keeps one button
		// and then add the five subpanels to each region of the panel.
		
		JPanel panel1 = new JPanel();
		JButton button1 = new JButton("Button 1");
		button1.addMouseListener(new ButtonClickListener());
		panel1.add(button1);
		panel.add(panel1, BorderLayout.NORTH);
		
		JPanel panel2 = new JPanel();
		JButton button2 = new JButton("Button 2");
		button2.addMouseListener(new ButtonClickListener());
		panel2.add(button2);
		panel.add(panel2, BorderLayout.SOUTH);

		JPanel panel3 = new JPanel();
		JButton button3 = new JButton("Button 3");
		button3.addMouseListener(new ButtonClickListener());
		panel3.add(button3);
		panel.add(panel3, BorderLayout.WEST);
		
		JPanel panel4 = new JPanel();
		JButton button4 = new JButton("Button 4");
		button4.addMouseListener(new ButtonClickListener());
		panel4.add(button4);
		panel.add(panel4, BorderLayout.EAST);
		
		JPanel panel5 = new JPanel();
		JButton button5 = new JButton("Button 5");
		button5.addMouseListener(new ButtonClickListener());
		// Try comment the above and use the one below
		//button5.addMouseListener(new ExternalButtonClickListener());
		panel5.add(button5);
		panel.add(panel5, BorderLayout.CENTER);
		
	}
	
	private class ButtonClickListener implements MouseListener {
		public void mouseClicked(MouseEvent e) {
			String buttonClicked = getButtonString(e.getButton());
			System.out.println(((JButton) e.getSource()).getText() + " " + buttonClicked + " clicked");
		}
		
		public void mouseEntered(MouseEvent e) {
			System.out.println("Mouse enter " + ((JButton) e.getSource()).getText() + " at " + e.getX() + ", " + e.getY());
		}

		public void mouseExited(MouseEvent e) {
			System.out.println("Mouse exit " + ((JButton) e.getSource()).getText() + " at " + e.getX() + ", " + e.getY());
		}

		public void mousePressed(MouseEvent e) {
			String buttonClicked = getButtonString(e.getButton());
			System.out.println(((JButton) e.getSource()).getText() + " " + buttonClicked + " pressed");
		}

		public void mouseReleased(MouseEvent e) {
			String buttonClicked = getButtonString(e.getButton());
			System.out.println(((JButton) e.getSource()).getText() + " " + buttonClicked + " released");
		}
		
		private String getButtonString(int button) {
			switch (button) {
				case MouseEvent.BUTTON1: 
					return "left"; 
				case MouseEvent.BUTTON2: 
					return "middle"; 
				case MouseEvent.BUTTON3: 
					return "right"; 
			}
			return null;
		}
	}
	
	/**
		main method
	*/
	public static void main(String[] args) {
		new MouseDemo();
	}
}
