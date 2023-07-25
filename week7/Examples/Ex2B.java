/*
	This class has no main method.
*/
public class Ex2B {
	private static int data = 15;

	// data is the field data in current class, i.e. Ex2B.
	// Ex2A.data is the field data in class Ex2A.
	private static void test() {
		System.out.println(data);
		System.out.println(Ex2A.data);
	}
}