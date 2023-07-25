/*
	This example uses while loop.
	The content of the loop may not 
	be executed.
*/

import java.util.Scanner;

public class InputValidationWhileLoop {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a number in the " +
						 "range of 1 through 100: ");
		String userInputLine = keyboard.nextLine();
		int number = Integer.parseInt(userInputLine);

		// Validate the input.
		while (number < 1 || number > 100) {
			System.out.println("That number is invalid.");
			System.out.print("Enter a number in the " +
							 "range of 1 through 100: ");
			userInputLine = keyboard.nextLine();
			number = Integer.parseInt(userInputLine);
		}
		
		System.out.println("The user input is " + number);
	}
}
