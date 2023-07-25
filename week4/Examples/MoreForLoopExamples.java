/**
   This program demonstrates more usage of for loop.
*/

public class MoreForLoopExamples {
	public static void main(String [] args) {
		// Loop control variable is a variable declared 
		// outside the for loop
		System.out.println("Example 1:");
		int var1 = 5;
		for (var1 = 10; var1 < 15; var1++) {
			System.out.println("Looping, var1 = " + var1);
		}
		System.out.println("Outside the for loop, var1 = " + var1);
		
		// Print a separate line
		System.out.println("---------------------------28");
		
		// Loop control variable is declared and 
		// initialized in the for loop initialization section
		System.out.println("Example 2:");
		for (int var2 = 20; var2 < 25; var2++) {
			System.out.println("Looping, var2 = " + var2);
		}
		// What happen if you uncomment the line below? Why?
		//System.out.println("Outside the for loop, var2 = " + var2);

		// Print a separate line
		System.out.println("---------------------------");
		// Control variable is not updated 
		// in the for loop update section
		// Is this example 3 equivalent to example 2 above? Why?
		System.out.println("Example 3:");
		for (int var2 = 20; var2 < 25; ) {
			System.out.println("Looping, var2 = " + var2);
			var2++;
		}

		// Print a separate line
		System.out.println("---------------------------");

		// Multiple loop control variables are declared
		// and initialized in the for loop initialization section
		System.out.println("Example 4:");
		for (int i = 30, j = 40; i < 50 && j > 20; i+=2, j--) {
			System.out.println("Looping, i = " + i + ", j = " + j);
		}

		// Print a separate line
		System.out.println("---------------------------");

		// What happen if the following codes are uncommented? Why?
		//for (int i = 30, double j = 25.5; i < 50 || j < 30; i++, j+=2) {
		//	System.out.println("Looping, i = " + i + ", j = " + j);
		//}
	}
}
