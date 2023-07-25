/**
   This program demonstrates the effect of pass by reference.
*/

public class PassByReference {

	/**
	The changeMe method accepts an argument and then
	changes the value of the parameter.
	*/
	public static void changeMe(int[] myArray) {
		System.out.println("I am changing the middle value of myArray to 0.");

		// Change the myValue parameter variable to 0.
		myArray[ myArray.length/2 ] = 0;
	}
	
	/**
		The printNumbers method prints the numbers 
		of the given integer array
		@param numbers the given integer array
	*/
	public static void printNumbers(int[] numbers) {
		for (int i = 0; i < numbers.length; i++)
			System.out.println("numbers[" + i + "] = " + numbers[i]);
	}

	public static void main(String[] args) {
		int[] list = { 10, 20, 30 };

		// Display the values in list.
		System.out.println("Before calling changeMe: list in main method contains the following data."); 
		printNumbers(list);

		// Call changeMe, passing list as an argument.
		changeMe(list);

		// Display the values in list after the change.
		System.out.println("After calling changeMe: list in main method contains the following data."); 
		printNumbers(list);
	}
}
