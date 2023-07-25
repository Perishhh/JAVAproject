/* 
	An example that shows how to concate Strings and use different arithmetic operators.
*/

public class Operator {
	public static void main(String[] args) {
		// Variable declarations with initialization
		int a = 10, b = 20;
		
		// Print a and b to console. 
		// The + operator is used for concatenation
		System.out.println("a = " + a + ", b = " + b);
		
		// Print a String literal
		System.out.print("a + b = ");

		// Print a + b to console.
		// The + operator here is used for arithmetic
		System.out.println(a + b);
		
		// Can you predict the outputs of the following Java statements?
		// Note that some (which?) below cause compilation error!
		// System.out.println("a + b = " + a + b);
		// System.out.println("a + b = " + (a + b));
		// System.out.println(a + b + " is the answer of a + b");
		// System.out.println("a - b = " + (a - b));
		// System.out.println("a - b = " + a - b);

		// Print a separate line
		System.out.println("------------------------");

		// Variable declarations with initialization
		int c = 3, d = 4;

		// Print c and d to console.
		System.out.println("c = " + c + ", d = " + d);

		// Do you understand the outputs from the following 4 lines?
		System.out.println("c++ returns " + c++);
		System.out.println("After c++, c = " + c);
		System.out.println("++d returns " + ++d);
		System.out.println("After ++d, d = " + d);
		
		// Print a separate line
		System.out.println("------------------------");
		
		// Variable declarations with initialization
		int e = 3, f = 6;

		// Print e and f to console.
		System.out.println("e = " + e + ", f = " + f);

		// Do you understand why g is 22?
		int g = e + --e * f-- + f + e;
		System.out.println("g = e + --e * f-- + f + e = " + g);
		
		// Print a separate line
		System.out.println("------------------------");
		
		// Variable declarations with initialization
		int h = 13, i = 7;

		// Print h and i to console.
		System.out.println("h = " + h + ", i = " + i);

		// Do you understand why the result is 28?
		i += ++i + h;
		System.out.println("i += ++i + h = " + i);
	}
}
