/**
	An example that handles errors with multiple exceptions and 
	using the polymorphic reference.
	Try the following:
	1) Run the program with fileName = "fileNotFound.txt". Understand why the program gives such output.
	2) Run the program with fileName = "test1.txt". Understand why the program gives such output. Don't forget to check the content of the file.
	3) Run the program with fileName = "test2.txt". Understand why the program gives such output. Don't forget to check the content of the file.
	4) Try uncomment line 30 (int len = nullReference.length();) with fileName = "fileNotFound.txt". Understand why the program gives such output.
*/

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Finally {
	private static String nullReference;
	
	public static void readFile() throws Exception {
		try {
			String fileName = "test.txt";
			File file = new File(fileName);
			Scanner fileReader = new Scanner(file);
			int[] values = new int[5];
			for (int i = 0; i < 5; i++) {
				values[i] = fileReader.nextInt();
			}
			fileReader.close();
			System.out.println("Complete reading the file");
		} catch (FileNotFoundException e) {
			int len = nullReference.length();
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
			System.out.println("Error message: " + e.getMessage());
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
