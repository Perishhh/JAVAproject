// Superclass of Ex2B
public class Ex2A {
	
	public Ex2A() {
		System.out.println("Ex2A no-arg constructor");
	}
	
	public Ex2A(int i) {
		System.out.println("Ex2A constructor with an int parameter, i = " + i);
	}

	public static void main(String[] args) {
		Ex2B obj1 = new Ex2B();
		Ex2B obj2 = new Ex2B(1);
	}
}