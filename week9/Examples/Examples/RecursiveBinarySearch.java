// An example of recursion that binary search an item in an array.
public class RecursiveBinarySearch {
	
	public static int recursiveBinarySearch(int[] array, int start, int end, int target) {
		if (start > end) // Base case 1: Array size less than or equal to zero
			return -1;
		
		// integer division will perform truncation (i.e. like taking floor)
		int m = (start + end) / 2;
		
		if (array[m] == target) // Base case 2: Middle element equals target
			return m;
		else if (array[m] > target) // Middle element greater than target, focus on left-half
			return recursiveBinarySearch(array, start, m-1, target);
		else // Middle element less than target, focus on right-half
			return recursiveBinarySearch(array, m+1, end, target);


	}
	
	public static void main(String[] args) {
		int[] numbers = {2, 5, 8, 10, 11, 18, 21, 23, 28, 30};
		int target = 10;
		
		// start the binary search for searching 10 from the whole array
		int res = recursiveBinarySearch(numbers, 0, numbers.length-1, target);
		
		if (res == -1)
			System.out.println("Element " + target + " does not exist in the array");
		else
			System.out.println("Element " + target + " exists in the array at index " + res);
		
		System.out.println("-----------------");
		
		// Search for more items
		int[] searchList = { 3, 4, 8, 12, 18, 22, 28 };
		for (int i = 0; i < searchList.length; i++) {
			res = recursiveBinarySearch(numbers, 0, numbers.length-1, searchList[i]);

			if (res == -1)
				System.out.println("Element " + searchList[i] + " does not exist in the array");
			else
				System.out.println("Element " + searchList[i] + " exists in the array at index " + res);
		}
	}
}