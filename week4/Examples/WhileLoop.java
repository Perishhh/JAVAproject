/**
   This program demonstrates the basic usage of while loops.
*/

public class WhileLoop {
	public static void main(String[] args) {
		
		// Example 1
		System.out.println("---- Output of Example 1 ----");
		int x = 3;
		while (x > 0) {
			System.out.println("x = " + x);
			x--;
		}
		
		// Example 2
		System.out.println("---- Output of Example 2 ----");
		x = 3;
		while (x > 0)
			System.out.println("x = " + x--);

		// Example 3
		System.out.println("---- Output of Example 3 ----");
		x = 3;
		while (x > 0) System.out.println("x = " + --x);

		// Example 4
		System.out.println("---- Output of Example 4 ----");
		x = 3;
		while (x-- > 0) System.out.println("x = " + x);
		
		/*
			Below is an example of endless loop.
			Be careful when uncomment and test it.
			Hold the Ctrl key and then Press C, i.e. Ctrl + C, 
			can terminate the application. 
		*/
		//System.out.println("Infinite Loop Example:");
		//x = 3;
		//while (x > 0) System.out.println("x = " + x);
	}
}