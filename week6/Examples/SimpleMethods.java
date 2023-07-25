/**
   This program defines and calls a simple method.
*/

public class SimpleMethods {
	/*
		The displayMessage method displays a greeting.
	*/
	public static void displayMessage() {
		System.out.println("Greeting from the displayMessage method.");
	}

	/*
		The sayHello method prints a Hello.
	*/
	public static void sayHello() {
		System.out.println("Hello from the sayHello method.");
	}

	/*
		The sayManyHello method calls the sayHello
		method for three times via a for-loop.
	*/
	public static void sayManyHello(int k) {
		System.out.println("We are going to say hello to " + k + " people.");
		for (int i = 0; i < k; i++) {
			// Call the sayHello method.
			sayHello();
		}
	}

	public static void main(String[] args) {
		System.out.println("Hello from the main method.");

		System.out.println("----Calling displayMessage()----");
		// Call the displayMessage method.
		displayMessage();

		System.out.println("----Calling sayManyHello(5)----");
		// Call the sayManyHello method with argument 5.
		sayManyHello(5);

		System.out.println("----Calling sayManyHello(2)----");
		// Reuse the sayManyHello method with argument 2.
		sayManyHello(2);

		System.out.println("Quit from the main method.");
	}
}