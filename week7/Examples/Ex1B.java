/*
	This class has no main method.
*/
public class Ex1B {
	public static int data = 15;

	// This method access the field data 
	// in class Ex1A.
	public static void test() {
		System.out.println(
			data + "," + Ex1A.data
		);
	}
}