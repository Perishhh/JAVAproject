/* 
	An example that shows how to define and initialize variables 
	as well as assign values to variables.
*/

public class Variable {
   public static void main(String[] args) {
		// Define a variable
		int firstValue;

		// Variable assignment. This is also a variable initialization.
		// What happen if you remove the statement (value = 5;) below?
		firstValue = 5;
		
		// Print a String literal
		System.out.print("The first value is ");
		
		// Print the value of variable value
		System.out.println(firstValue);
		
		// Define a variable with initialized value.
		int secondValue = 10;
		
		// Variable assignment.
		// What happen if you remove the statement (secondValue = 15;) below?
		secondValue = 15;
		
		// Print a String literal
		System.out.print("The second value is ");
		
		// Print the value of variable secondValue
		System.out.println(secondValue);
		
		// Define multiple variables in the same line
		// One with initialization
		int thirdValue, fourthValue = 40;
		
		// Variable initialization
		thirdValue = 30;
		
		// Variable assignment
		thirdValue = 35;

		// Print a String literal
		System.out.print("The third value is ");

		// Print the value of variable thirdValue
		System.out.println(thirdValue);
		
		// Variable assignment
		fourthValue = 45;

		// Print a String literal
		System.out.print("The fourth value is ");

		// Print the value of variable fourthValue
		System.out.println(fourthValue);		
   }
}
