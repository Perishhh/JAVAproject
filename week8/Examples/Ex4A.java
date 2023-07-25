// Superclass of Ex4B
public class Ex4A {

	public Ex4A(int i) {
		System.out.println("Ex4A constructor with an int parameter, i = " + i);
	}

	public static void main(String[] args) {
		Ex4B obj = new Ex4B(1);
	}
}