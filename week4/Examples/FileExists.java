/**
   This program checks if a file exists.
   The getParent() method returns the parent path.
*/

import java.util.Scanner;
import java.io.File;

public class FileExists {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a file: ");
		String filePath = keyboard.nextLine();
		
		File file = new File(filePath);
		if (file.exists()) {
			System.out.println("File " + file.getName() + " exists at " + file.getParent() + " directory");
		} else {
			System.out.println("File not found");
		}
	}
}