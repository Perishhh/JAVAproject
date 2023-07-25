/**
	This example illustrates shallow copy.
*/
public class SameArray {

	public static void main(String[] args) {
		int[] array1 = { 14, 18, 20, 15};
		// Making a shallow copy.
		int[] array2 = array1;

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
		
		// Check the output from the code below.
		// Why the value of array2 elements also changed?
		System.out.println("After changing array1");
		for (int i = 0; i < array1.length; i++) {
			System.out.println("array1[" + i + "] = " + array1[i]);
			System.out.println("array2[" + i + "] = " + array2[i]);
		}

	}
}