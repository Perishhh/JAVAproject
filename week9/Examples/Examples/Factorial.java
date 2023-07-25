// An example of recursion that computes factorial.
public class Factorial {
	
	public static int factorial(int n) {
		if (n == 0)		// Base case
			return 1;
		else			// Recursive case
			return factorial(n-1) * n;
	}
	
	public static void main(String[] args) {
		int i = 4;
		System.out.println(i + "! = " + factorial(i));
	}
}