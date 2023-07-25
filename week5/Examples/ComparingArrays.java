/**
	This example illustrates How to compare the content of two arrays.
*/
public class ComparingArrays {
	public static void main(String[] args) {
		// Declare and initialize the two arrays and the array elements
		// After running this example with the identical content in the two arrays, 
		// try to set the array with different content.
		// E.g. try to set secondArray be { 2, 4, 6, 8 } and { 2, 4, 5, 8, 10 }.
		int[] firstArray = { 2, 4, 6, 8, 10 };
		int[] secondArray = { 2, 4, 6, 8, 10 };
		
		// Declare a boolean variable to indicate whether the two arrays are the same.
		// It is initialized to true, and we set it to false when we found difference 
		// between the two arrays.
		boolean arraysEqual = true;
		
		// First determine whether the arrays are the same size.
		if (firstArray.length != secondArray.length)
			arraysEqual = false;

		// Next determine whether the elements contain the same data 
		int i = 0;
		while (arraysEqual && i < firstArray.length) {
			if (firstArray[i] != secondArray[i])
				arraysEqual = false;
			i++;
		}
		// Exercise: Can you convert the above to for loop?

		if (arraysEqual)
			System.out.println("The arrays are equal.");
		else
			System.out.println("The arrays are not equal.");
	}
}