/*
	This example program illustrates the usage of 
	boolean expressions and Relational operators.
*/

import java.util.Scanner;

public class BooleanExpression {
	public static void main(String[] args) {
		
		// Define a boolean variable named b.
		boolean b;
		// Evaluate 10 > 3 and assign the result value to b.
		b = 10 > 3;
		// Print the result to the screen.
		System.out.println("10 > 3? " + b);
		
		// Define two int variables, x and y, with initial 
		// values 4 and 5 respectively.
		int x = 4, y = 5;
		// Evaluate x >= y and assign the result value to b.
		b = x >= y;
		// Print the result to the screen.
		System.out.println(x + " >= " + y + "? " + b);
		
		// The line below causes error, why?
		//b = true == 10;

		/*
		  NOTE: The purpose of ALL codes below are ONLY for illustrating 
		  what operands that the relational operators allow/disallow.
		  We indeed rarely use == or != operators for non-primitive 
		  data type objects (comparing memory address).
		  Do not be confused about how to compare the content of 
		  non-primitive data type objects.
		*/

		Scanner obj1 = new Scanner(System.in);
		Scanner obj2 = new Scanner(System.in);
		
		// obj1 and obj2 are non-primitive data type.
		// obj1 == obj2 is actually comparing their MEMORY ADDRESSES.
		b = obj1 == obj2;
		System.out.println("obj1 == obj2? " + b);
		
		// After the assignment (obj1 = obj2) below, both obj1 and obj2 are referencing 
		// the SAME Scanner object in memory.
		// In other words, both obj1 and obj2 store the same memory address.
		obj1 = obj2;

		b = obj1 == obj2;
		System.out.println("After assignment, obj1 == obj2? " + b);
		
		// The line below causes error, why?
		//b = obj1 > obj2;
		
		String myName = "Lau Man Kit";
		// The line below causes error, why?
		//b = obj1 == myName;
	}
}
