/**
	An example that handles errors with multiple exceptions and 
	using the polymorphic reference.
	Try the following:
	1) Run the program with fileName = "test.txt". Understand why the program gives such output.
	2) Run the program with fileName = "test1.txt". Understand why the program gives such output. Don't forget to check the content of the file.
	3) Run the program with fileName = "test2.txt". Understand why the program gives such output. Don't forget to check the content of the file.
	4) Run the program with fileName = "test3.txt". Understand why the program gives such output. Don't forget to check the content of the file.
	5) Besides the given order, try to compile the program with the following orders
	   FileNotFoundException -> NoSuchElementException -> InputMismatchException -> Exception
	   InputMismatchException -> NoSuchElementException -> FileNotFoundException -> Exception
	   What can you conclude?
*/

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.File;

public class HandleMultipleException2 {
	public static void main(String[] args) {
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
			System.out.println("File not found :P");
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Number format mismatch!");
			System.out.println(e.getMessage());	
		} catch (NoSuchElementException e) {
			System.out.println("Reading after the end of file!");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception is caught by a catch block with a general Exception class.");
			System.out.println(e.getMessage());
		}
		
		System.out.println("\n\nAfter the try-catch statement, the program continue");
	}
}
