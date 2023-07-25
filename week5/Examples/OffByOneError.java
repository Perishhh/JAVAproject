/**
	This example illustrates the Off-by-One Error.
*/
public class OffByOneError {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		
		// Error happen when i = 5.
		// Why such error occur?
		// How to fix the problem?
		for (int i = 0; i <= 5; i++) {
			System.out.println("Accessing numbers[" + i + "]");
			numbers[i] = 10;
		}
	}
}