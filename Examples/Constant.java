/*
	An example that shows how to define and use constants.
*/

public class Constant {
	public static void main(String[] args) {
		// Define a constant
		final double PI;
		
		// Constant initialization
		// What happen if the line below is removed?
		PI = 3.1415;
		
		// Note that the above two Java statements (i.e. final double PI; and PI = 3.1415;)
		// can be combined to the one below.
		// final double PI = 3.1415;
		
		// Constant assignment
		// What happen if PI = 3.1415 above and the line below both exist in the code (i.e. uncommented).
		// PI = 3.14;

		// Print the value of constant PI.
		System.out.println(PI);

		// Constant declaration with initialization
		final int NUMSTU = 35;
		
		// Print the value of constant NUMSTU.
		System.out.println(NUMSTU);
		
	}
}
