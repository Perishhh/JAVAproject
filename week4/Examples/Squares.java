/**
   This program demonstrates the for loop.
*/

public class Squares {
	public static void main(String [] args) {
		int number; // Loop control variable
		String header1 = "Number";
		String header2 = "Number Squared";
		String separator = "    ";
		
		// Print the table header
		System.out.println(header1 + separator + header2);

		// Print the separate line
		for (int i = 0; i < header1.length() + separator.length() + header2.length(); i++)
			System.out.print("-");
		System.out.println();

		// Print the table content
		for (number = 1; number <= 10; number++) {
			System.out.printf("%-" + header1.length() +"d" + separator + "%-" + header2.length() + "d\n", number, number*number);
		}
	}
}
