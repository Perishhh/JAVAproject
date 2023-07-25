// Superclass of Ex5B
public class Ex5A {
	
	public Ex5A() {
		System.out.println("Ex5A no-arg constructor");
	}
	
	public Ex5A(int i) {
		System.out.println("Ex5A constructor with an int parameter, i = " + i);
	}

	public Ex5A(String s) {
		System.out.println("Ex5A constructor with a String parameter, s = " + s);
	}

	public void print() {
		System.out.println("Ex5A print method");
	}
	public static void main(String[] args) {
		Ex5B obj1 = new Ex5B();
		Ex5B obj2 = new Ex5B(1);
		Ex5B obj3 = new Ex5B("a");
	}
}