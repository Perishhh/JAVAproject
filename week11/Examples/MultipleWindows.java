/**
	An example that shows multiple windows can be opened.
*/

import javax.swing.*;

public class MultipleWindows {
	
	public static void main(String[] args) {
		System.out.println("Start of main method");
		final int WINDOW_WIDTH = 350;
		final int WINDOW_HEIGHT = 250;
		
		// Create a window.
		JFrame window = new JFrame();

		// Set the title.
		window.setTitle("Hello World!");

		// Set the size of the window.
		window.setSize(2*WINDOW_WIDTH, 2*WINDOW_HEIGHT);

		// Display the window.
		// Try to comment out the line below. What happen?
		window.setVisible(true);
		
		// Create and show a second window
		JFrame window2 = new JFrame();
		window2.setTitle("Second window");
		window2.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		window2.setVisible(true);

		// Specify what happens when the close button is clicked.
		// Try different combinations of the following two lines.
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Note that we reached the end of main but 
		// the application does not end.
		System.out.println("End of main method");
	}
}
