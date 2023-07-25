/**
	An example that handles errors with multiple exceptions and 
	using the polymorphic reference.
	Try the following:
	1) Run the program with fileName = "test.txt". Understand why the program gives such output.
	2) Run the program with fileName = "test1.txt". Understand why the program gives such output. Don't forget to check the content of the file.
	3) Run the program with fileName = "test2.txt". Understand why the program gives such output. Don't forget to check the content of the file.
	4) Run the program with fileName = "test3.txt". Understand why the program gives such output. Don't forget to check the content of the file.
	5) Swap the order of the two catch blocks. Why it causes compilation error?
	6) Try remove the catch block of FileNotFoundException and re-run the program with the setting of 1 - 4 above.
*/

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class HandleMultipleException1 {
	public static void main(String[] args) {
		try {
			String fileName = "test3.txt";
			File file = new File(fileName);
			Scanner fileReader = new Scanner(file);
			int[] values = new int[5];
			for (int i = 0; i < 5; i++) {
				values[i] = fileReader.nextInt();
			}
			fileReader.close();
			System.out.println("Complete reading the file");
		} catch (FileNotFoundException e) {
			System.out.println("File not found :P");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception is caught by a catch block with a general Exception class.");
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n\nAfter the try-catch statement, the program continue");
	}
}
