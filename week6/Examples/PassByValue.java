/**
   This program demonstrates that only a copy of an argument
   is passed into a method.
*/

public class PassByValue {
	public static void main(String[] args) {
		int number = 50; // number starts with 50

		// Display the value in number.
		System.out.println("Before calling changeMe: number is " + number);

		// Call changeMe, passing the value in number
		// as an argument.
		changeMe(number);

		// Display the value in number again.
		System.out.println("After calling changeMe: number is " + number);
	}

	/**
		The changeMe method accepts an integer argument 
		and change its value.
		@param myValue an integer
	*/
	public static void changeMe(int myValue) {
		System.out.println("In method changeMe: I am changing myValue.");

		// Change the myValue parameter variable to 0.
		myValue = 0;

		// Display the value in myValue.
		System.out.println("At the end of the method changeMe: myValue = " + myValue);
	}
}
