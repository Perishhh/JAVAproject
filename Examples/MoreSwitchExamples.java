import java.util.Scanner; // Needed for the Scanner class

/**
   This program demonstrates the usage of switch statement.
   Run this program for each of the following inputs:
   1) A
   2) B
   3) b
   4) Hello
   5) D
   Try to understand the outputs.
*/

public class MoreSwitchExamples {
	public static void main(String[] args) {
		// ----Example 1----
		String input;		// To hold the user's input
		char letter;		// A letter

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Prompt the user to input a letter.
		System.out.print("Please input a letter: ");
		// Wait for the user input.
		input = keyboard.nextLine();
		if (input.length() != 1) {
			System.out.println("Your input is too long.");
			System.exit(0);
		}
		// Get the first character of the String input.
		letter = input.charAt(0);
		
		// Switch expression is a char variable.
		// The case expressions are int values.
		switch(letter) {
			case 97:
			case 65:
				System.out.println("The user input is 'a' or 'A'");
				break;
			case 98:
			case 66:
				System.out.println("The user input is 'b' or 'B'");
				break;
			case 99:
			case 67:
				System.out.println("The user input is 'c' or 'C'");
				break;
			default:
				System.out.println("The user input is neither 'a', 'A', 'b', 'B', 'c', nor 'C'.");
		}		

		// ----Example 2----
		// Read a string from keyboard.
		System.out.print("Type a word: ");
		String word = keyboard.nextLine();
		// Define a named constant with initial value "Python".
		final String CONST_WORD = "Python";

		// Both switch expression and case expressions are Strings.
		switch(word) {
			case "Hello":
				System.out.println("You are saying Hello.");
				break;
			case "World":
				System.out.println("You are saying World");
				break;
			case "Java":
				System.out.println("You are saying Java");
				break;
			case CONST_WORD:
				System.out.println("You are saying Python");
				break;				
			default:
				System.out.println("I don't understand what you are saying");
		}
		
		/*
		// ----Example 3----
		// Prompt for a user input.
		System.out.print("Enter a word: ");
		// Define a named constant USER_INPUT with initial value from the user input.
		final String USER_INPUT = keyboard.nextLine();

		// The switch statement below causes error. 
		// Why error happens in this example but no error in the above example?
		switch(word) {
			case "Hello":
				System.out.println("You are saying Hello.");
				break;
			case "World":
				System.out.println("You are saying World");
				break;
			case "Java":
				System.out.println("You are saying Java");
				break;
			case USER_INPUT:
				System.out.println("You are saying Python");
				break;				
			default:
				System.out.println("I don't understand what you are saying");
		}
		*/

		keyboard.close();
	}
}
