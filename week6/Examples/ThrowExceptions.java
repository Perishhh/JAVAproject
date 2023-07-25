/**
   The methods in this program throws
   some exceptions
*/

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ThrowExceptions {
	/*
		Read the first line of the file from the argument.
	*/
	public static String readFirstLine(File file) throws IOException {
		Scanner fileReader = new Scanner(file);
		String line = fileReader.nextLine();
		fileReader.close();
		return line;
	}

	/*
		Make the program sleeps dur milliseconds.
	*/
	public static void programSleep(int dur) throws InterruptedException {
		System.out.println("Please wait for two seconds.");
		Thread.sleep(dur);
	}
	
	/*
		If the given file exists, call readFirstLine and programSleep.
	*/
	// Try to throws only IOException or InterruptedException instead of both.
	// What happen and why?
	// Try to replace the line [String line = readFirstLine();] by [String line = "abc";] 
	// and remove IOException below, i.e. throws only InterruptedException.
	// What happen and why?
	public static String readFirstLineThenSleepTwoSeconds(File file) throws IOException, InterruptedException {
		if (!file.exists()) {
			System.out.println("Please input an existing file.");
			System.exit(0);
		}
		String line = readFirstLine(file);
		programSleep(2000);
		return line;
	}

	// Try to declare throws for only either IOException or InterruptedException instead of both.
	// What happen and why?	
	// Try to remove the line [System.out.println(readFirstLineThenSleepTwoSeconds(file));] 
	// and remove [throws IOException, InterruptedException].
	// What happen and why?
	public static void main(String[] args) throws IOException, InterruptedException {
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a file name: ");
		String fileName = keyboard.nextLine();
		File file = new File(fileName);
		System.out.println(readFirstLineThenSleepTwoSeconds(file));
	}
}
