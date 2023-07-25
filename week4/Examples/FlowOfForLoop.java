/**
   This program demonstrates the flow of for loop.
*/

public class FlowOfForLoop {
	public static void main(String [] args) {
		int i = 0;
		for (System.out.println("Initialization Section"); i < 5; System.out.println("Updating i to " + ++i)) {
			System.out.println("Boolean expression is true when i = " + i);
		}
		System.out.println("Exited from the for loop because the boolean expression is false when i = " + i);
	}
}
