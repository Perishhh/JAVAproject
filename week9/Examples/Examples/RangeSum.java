// An example of recursion that sums the elements in a range of the array.
public class RangeSum {
	
	public static int rangeSum(int[] array, int start, int end) {
		if (start > end)	// Base case
			return 0;
		else				// Recursive case
			return array[start] + rangeSum(array, start+1, end);
	}
	
	public static void main(String[] args) {
		int[] numbers = {5, 6, 0, 8, 2, 7, 4, 1, 3};
		int sum;
		sum = rangeSum(numbers, 3, 7);
		System.out.println("Sum from array[3] to array[7] = " + sum);
	}
}