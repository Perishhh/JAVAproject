/**
	This example illustrates accessing array entries 
	by variables and loops.
*/
public class AccessArrayElementsByVariable {

	public static void main(String[] args) {
		// Create an int array of size 4 
		// and assign its address to the 
		// int array type variable numbers.
		int[] numbers = new int[4];
		for (int i = 0; i < 4; i++) {
			numbers[i] = i*3 + 2;
		}
		
		for (int i = 0; i < 4; i++) {
			System.out.println("Value in numbers[" + i + "] is " + numbers[i]);
		}
		
		// Similar to indicating the array size, 
		// the array index cannot be long type.
		// The code below generates compilation error
		/*
		for (long i = 0; i < 4; i++) {
			System.out.println("numbers[" + i + "] = " + numbers[i]);
		}
		*/
	}

}