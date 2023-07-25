/**
	This example illustrates two-dimensional array.
*/
public class TwoDimArray {
	public static void main(String[] args) {
		// Create an array that contains 3 rows and 4 columns 
		// with initialized the array and its elements.
		int[][] numbers1 = { 
			{1, 2, 3, 4}, 
			{5, 6, 7, 8}, 
			{9, 10, 11, 12}
		};
		
		// Loop through the 2D array numbers1.
		System.out.println("----Example 1----");
		for (int i = 0; i < numbers1.length; i++) {
			System.out.println("Printing elements in row " + (i+1));
			for (int j = 0; j < numbers1[i].length; j++) {
				System.out.println("numbers1[" + i + "][" + j + "] = " + numbers1[i][j]);
			}
		}

		// Create an array with 3 rows, 
		// but different rows have different columns
		int[][] numbers2 = {
			{1, 2}, 
			{3, 4, 5, 6},
			{7}
		};
		// Loop through the 2D array numbers2.
		System.out.println("----Example 2----");
		for (int i = 0; i < numbers2.length; i++) {
			System.out.println("Printing elements in row " + (i+1));
			for (int j = 0; j < numbers2[i].length; j++) {
				System.out.println("numbers2[" + i + "][" + j + "] = " + numbers2[i][j]);
			}
		}
		
		// Create an array with 3 rows,
		// but different rows have different number of columns
		int[][] numbers3 = new int[3][];
		numbers3[0] = new int[2];
		numbers3[1] = new int[4];
		numbers3[2] = new int[1];
		
		System.out.println("----Example 3----");
		// Array elements, no matter 1D, 2D or above, are automatically initialized to zero by default.
		for (int i = 0; i < numbers3.length; i++) {
			System.out.println("Printing elements in row " + (i+1));
			for (int j = 0; j < numbers3[i].length; j++) {
				System.out.println("numbers3[" + i + "][" + j + "] = " + numbers3[i][j]);
			}
		}
	}
}