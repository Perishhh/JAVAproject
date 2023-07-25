/*
	This example shows that 
	private members cannot be accessed
	outside the class.
*/
public class Ex2A {
	private static int data = 10;

	// data is the field data in current class, i.e. Ex2A.
	// Ex2B.data is the field data in class Ex2B.
	public static void main(String[] args) {
		System.out.println(data);
		System.out.println(Ex2B.data);
		Ex2B.test();
	}
}