/**
	An example that shows the use of printStackTrace()
*/

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class StackTrace {
	public static void readFile() throws Exception {
		try {
			String fileName = "test2.txt";
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
		} finally {
			System.out.println("Finally block of the try-catch statement in read file method");
		}
	}
	
	public static void main(String[] args) {
		
		try {
			readFile();
		} catch (Exception e) {
			System.out.println("Read file throws unhandled exception. The parent now handles it");
			e.printStackTrace();
		} finally {
			System.out.println("Finally block of the parent of readFile");
		}

		
		try {
			int a = 1;
		} catch (Exception e) {
			System.out.println("Exception caught");
		} finally {
			System.out.println("Finally block of the second try-catch statement in main");
		}
		
		System.out.println("\n\nAfter the try-catch statement, the program continue");
	}
}
