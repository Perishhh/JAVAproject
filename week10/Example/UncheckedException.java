/**
	An example that shows missing throw/handle unchekced exceptions will not cause compilation error.
*/

public class UncheckedException {
	
	public static void someMethod() {
		// Integer divided by zero will throw ArithmeticException
		// which is a subclass of RunTimeException.
		// So, no **compilation** error even though we did not throw ArithmeticException in the main method
		// because it is unchecked exception
		int i = 1 / 0;
	}
	
	public static void main(String[] args) {
		someMethod();
	}
}
