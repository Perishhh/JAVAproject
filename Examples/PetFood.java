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

public class PetFood {
	public static void main(String[] args) {
		String input;     // To hold the user's input
		char foodGrade;   // Grade of pet food

		// Create a Scanner object for keyboard input.
		Scanner keyboard = new Scanner(System.in);

		// Prompt the user to input a grade of pet food.
		System.out.println("Our pet food is available in three grades:");
		System.out.print("A, B, and C. Which do you want pricing for? ");
		// Wait for the user input.
		input = keyboard.nextLine();
		if (input.length() != 1) {
			System.out.println("The grade should be a single letter");
			System.exit(0);
		}
		// Get the first character of the String input.
		foodGrade = input.charAt(0);

		// Switch expression is a char variable.
		// Display the case to be executed and the pricing for the selected grade.
		switch(foodGrade) {
			case 'a':
				System.out.println("Case 1");
			case 'A':
				System.out.println("Case 2");
				System.out.println("30 cents per lb.");
				break;
			case 'b':
				System.out.println("Case 3");
			case 'B':
				System.out.println("Case 4");
				System.out.println("20 cents per lb.");
				break;
			case 'c':
				System.out.println("Case 5");
			case 'C':
				System.out.println("Case 6");
				System.out.println("15 cents per lb.");
				break;
			default:
				System.out.println("Invalid choice.");
		}
		keyboard.close();
	}
}
