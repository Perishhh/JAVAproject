/**
	This example illustrates How to find 
	the maximum and the minimum in an array.
*/
public class FindHighestLowest {
	public static void main(String[] args) {
		// Define and initialize an array.
		int[] numbers = { 8, 5, 4, 10, 6 };
		
		// Find the maximum value by loop.
		int highest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > highest)
				highest = numbers[i];
		}
		
		// Find the minimum value by loop.
		int lowest = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < lowest)
				lowest = numbers[i];
		}
		
		System.out.println("The maximum value in numbers = " + highest);
		System.out.println("The minimum value in numbers = " + lowest);
	}
}