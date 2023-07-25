/**
	A class that extends JFrame
*/

import javax.swing.*;

public class MyWindow extends JFrame {
	
	public MyWindow(String title, int width, int height) {

		// Set the title.
		setTitle(title);

		// Set the size of the window.
		setSize(width, height);

		// Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Show the window
		setVisible(true);
	}
}
