// Superclass of Ex3B
public class Ex3A {
	
	public Ex3A() {
		System.out.println("Ex3A no-arg constructor");
	}
	
	public Ex3A(int i) {
		System.out.println("Ex3A constructor with an int parameter, i = " + i);
	}

	public static void main(String[] args) {
		Ex3B obj1 = new Ex3B();
		Ex3B obj2 = new Ex3B(1);
	}
}