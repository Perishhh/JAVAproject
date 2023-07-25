/**
	This example illustrates the usage and property of array length.
*/

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		// Ask the user to input the array size.
		System.out.print("Enter the array size (integer): ");
		int size = Integer.parseInt(keyboard.nextLine());
		
		// Create the array according to the user input size.
		int[] numbers = new int[size];
		
		// Print the array size.
		System.out.println("The length of numbers is " + numbers.length);
		
		// The line below causes error. Why?
		// From the error message, what can you confirm?
		//numbers.length = 10;
		
		// loop through an array with array.length
		// Assign a value to each array element.
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i*i;
		}
		
		// Print the second half of the array elements
		for (int i = numbers.length / 2; i < numbers.length; i++) {
			System.out.println("numbers[" + i + "] = " + numbers[i]);
		}
		
	}
}