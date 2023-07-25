/**
	Our first GUI application example.
	Shows hello world in the title of a window.
*/

import javax.swing.*;

public class HelloWorldGUI {
	
	public static void main(String[] args) {
		System.out.println("Start of main method");
		final int WINDOW_WIDTH = 350;
		final int WINDOW_HEIGHT = 250;
		
		// Create a window.
		JFrame window = new JFrame();

		// Set the title.
		window.setTitle("Hello World!");

		// Set the size of the window.
		window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

		// Specify what happens when the close button is clicked.
		// Try to comment out the line below. What is the difference on window close?
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Display the window.
		// Try to comment out the line below. What happen?
		window.setVisible(true);
		
		// Note that we reached the end of main but 
		// the application does not end.
		System.out.println("End of main method");
	}
}
