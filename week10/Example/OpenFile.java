import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class OpenFile {
	public static void main(String[] args) {
		try {
			File file = new File("NonExistFile.txt");
			Scanner fileReader = new Scanner(file);
		} catch (FileNotFoundException e) {
			// The FileNotFoundException is handled inside this catch block
			
			// Below line is our own messages about the exception.
			System.out.println("File not found :P");
			
			// Below line prints the messages provided by the exception instance
			System.out.println("Message from the exception instance: " + e.getMessage());
		}
	}
}
