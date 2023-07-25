/*
	In the main method of this class, 
	it access the field data and method test() 
	in class Ex1B.
*/
public class Ex1A {
	public static int data = 10;

	public static void main(String[] args) {
		System.out.println(Ex1B.data);
		Ex1B.test();
	}
}