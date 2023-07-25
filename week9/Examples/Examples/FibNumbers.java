// An example of recursion that print the first fibonacci numbers.
public class FibNumbers {
	
	public static int fib(int n) {
		if (n == 0)			// Base case 1
			return 0;
		else if (n == 1)	// Base case 2
			return 1;
		else				// Recursive case
			return fib(n-1) + fib(n-2);
	}
	
	public static void main(String[] args) {
		int i = 10;
		System.out.println("The " + i + "-th fibonacci number is " + fib(10));
	}
}