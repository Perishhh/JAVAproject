/**
   This program reads data from a file with 3 seconds delay.
*/

import java.util.Scanner; // Needed for the Scanner class
import java.io.*;         // Needed for the File class

public class FileReadWithDelayDemo {
	public static void main(String[] args) throws IOException, InterruptedException {
		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Get the filename.
		System.out.print("Enter the filename of a text file: ");
		String filename = keyboard.nextLine();

		// Open the file.
		File file = new File(filename);
		
		// If the file exists, the program 
		// wait for 3 seconds, each second prints a ".".
		// If the file does not exists, the program terminates.
		// Note that in FileReadDemo.java, we havn't check if file exists.
		if (file.exists()) {
			System.out.print("Loading.");
			for (int i = 0; i < 3; i++) {
				Thread.sleep(1000);
				System.out.print(".");
			}
			System.out.println();
		} else {
			System.out.println("File not found");
			System.exit(0);
		}
		
		Scanner inputFile = new Scanner(file);

		// Read lines from the file until no more are left.
		while (inputFile.hasNext()) {
			// Read the next name.
			String friendName = inputFile.nextLine();

			// Display the last name read.
			System.out.println(friendName);
		}

		// Close the file.
		inputFile.close();
	}
}
