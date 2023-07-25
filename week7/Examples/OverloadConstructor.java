/*
	An example that demonstrates constructor overloading.
*/

public class OverloadConstructor {
	private double width, length;
	
	// Try comment out the following no-arg constructor
	// It causes error. Why? Don't the default constructor is a no-arg constructor?
	public OverloadConstructor() {
		width = 1.0; 
		length = 1.0;
	}
	
	public OverloadConstructor(double w, double len) {
		width = w;
		length = len;
	}

	public void setWidth(double w) {
		width = w;
	}
	
	public void setLength(double len) {
		length = len;
	}

	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}
	
	public static void main(String[] args) {
		OverloadConstructor rect1 = new OverloadConstructor();
		OverloadConstructor rect2 = new OverloadConstructor(5.0, 10.0);
		
		System.out.println("rect1: width = " + rect1.getWidth() + ", length = " + rect1.getLength());
		System.out.println("rect2: width = " + rect2.getWidth() + ", length = " + rect2.getLength());
	}

}
