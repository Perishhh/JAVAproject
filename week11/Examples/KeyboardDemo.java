/**
	An example of using KeyListener
	A label position will be updated if left/right/up/down key 
	is pressed.
*/

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class KeyboardDemo extends JFrame {
	private JPanel panel;					// To reference a panel
	private JLabel label;					// To reference a label
	private final int WINDOW_WIDTH = 400;	// Window width
	private final int WINDOW_HEIGHT = 400;	// Window height
	private int labelX = 100;
	private int labelY = 100;
	private int moveSpeed = 5;
	
	/**
		Constructor
	*/
	public KeyboardDemo() {
		// Set the window title.
		setTitle("Keyboard event Example");

		// Set the size of the window.
		setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		// Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Build the panel.
		buildPanel();

		// Add the panel to the frame's content pane.
		add(panel);
		
		// Add key listener to window
		addKeyListener(new MyKeyListener());

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

		// Create the label
		label = new JLabel("Movable label");
		// Set the position and size of button button
		//label.setBounds(labelX, labelY, 100, 100);
		updateLabelPosition();
		
		// Add the label to panel
		panel.add(label);
		
	}
	
	private void updateLabelPosition() {
		label.setBounds(labelX, labelY, 100, 100);
	}
	
	private class MyKeyListener implements KeyListener {
		public void keyPressed(KeyEvent e) {
			System.out.println(e.getKeyChar() + " is pressed");
			moveLabel(e.getKeyCode());
		}

		public void keyReleased(KeyEvent e) {
			System.out.println(e.getKeyChar() + " is Released");
		}
		
		public void keyTyped(KeyEvent e) {
			System.out.println(e.getKeyChar() + " is Typed");
		}
		
		public void moveLabel(int keyCode) {
			switch (keyCode) {
				case KeyEvent.VK_LEFT: 
					labelX -= moveSpeed;
					break;
				case KeyEvent.VK_RIGHT:
					labelX += moveSpeed;
					break;
				case KeyEvent.VK_UP:
					labelY -= moveSpeed;
					break;
				case KeyEvent.VK_DOWN:
					labelY += moveSpeed;
					break;
			}
			updateLabelPosition();
		}
	}
	
	/**
		main method
	*/
	public static void main(String[] args) {
		new KeyboardDemo();
	}
}
