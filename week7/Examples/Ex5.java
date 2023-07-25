/*
	This example shows that static method 
	cannot access non-static members (fields/methods).
*/

public class Ex5 {
	// A non-static field
	public int nStData = 10;  

	// A non-static method
	public void update() {
		nStData++;  
	}

	// A static method tries to access 
	// some non-static members (fields/methods)
	public static void print() {
		update(); // Error, why?
		System.out.println(nStData); // Error, why?
	}
}
