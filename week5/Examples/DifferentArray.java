/**
	This example illustrates the deep copy.
*/
public class DifferentArray {

	public static void main(String[] args) {
		int[] array1 = { 14, 18, 20, 15};
		int[] array2 = new int[array1.length];
		// Making a deep copy
		for (int i = 0; i < array1.length; i++) {
			array2[i] = array1[i];
		}

		System.out.println("Before changing array1");
		for (int i = 0; i < array1.length; i++) {
			System.out.println("array1[" + i + "] = " + array1[i]);
			System.out.println("array2[" + i + "] = " + array2[i]);
		}
		System.out.println("-----");

		// Change the value of the elements in array1.
		array1[0] = 41;
		array1[1] = 81;
		array1[2] = 2;
		array1[3] = 51;
		
		// Compare with the example SameArray.java
		// Why this time the elements in array2 do not change?
		System.out.println("After changing array1");
		for (int i = 0; i < array1.length; i++) {
			System.out.println("array1[" + i + "] = " + array1[i]);
			System.out.println("array2[" + i + "] = " + array2[i]);
		}

	}
}