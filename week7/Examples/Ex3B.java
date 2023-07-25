public class Ex3B {
	// A static field that belongs to the class
	public static int stData = 10;
	
	// A non-static field that belongs to the instance
	public int nStData = 10;
	
	// A static method that prints the static field
	public static void print() {
		System.out.println(stData);
	}

	// A non-static method that modifies
	// both static and non-static fields
	public void update() {
		nStData++;
		stData++;
	}

	// Uncomment the following method will cause compilation error
	/*
	// A static methods tries to modify a 
	// non-static field
	public static void update2() {
		nStData++;
	}
	*/
}
