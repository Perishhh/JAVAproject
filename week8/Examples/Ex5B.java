// Subclass of Ex5A
public class Ex5B extends Ex5A {

	public Ex5B() {
		// Uncomment the following line
		// It calls the constructor with an int parameter instead
		//super(50);
		System.out.println("Ex5B no-arg constructor");
	}

	public Ex5B(int i) {
		// Uncomment the following line.
		// It calls the constructor with an int parameter instead
		//super(i);

		// Make sure the line above is commented and uncomment the following line.
		// It calls the constructor with a String parameter instead
		//super("a");

		System.out.println("Ex5B constructor with an int parameter");

		// Uncomment the following line, it causes error.
		// Because calling superclass's constructor must be the first 
		// Java statement in the subclass's constructor.
		//super(i);
	}

	public Ex5B(String s) {
		System.out.println("Ex5B constructor with a String parameter");
	}
}