/*
	This example uses do-while loop.
	The content of the loop has to be 
	executed at least once.
*/

import java.util.Scanner;

public class InputValidationDoWhileLoop {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int number; 
		boolean hasInput = false;

		// Loop until a valid input is received.
		do {
			if (hasInput) 
				System.out.println("That number is invalid.");

			System.out.print("Enter a number in the " +
							 "range of 1 through 100: ");
			String userInputLine = keyboard.nextLine();
			number = Integer.parseInt(userInputLine);
			hasInput = true;

		} while (number < 1 || number > 100);

		
		System.out.println("The user input is " + number);
	}
}
