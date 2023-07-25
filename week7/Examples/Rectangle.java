/*
	A classic example for class.
*/

public class Rectangle {
	// The width of the rectangle
	private double width;
	// The length of the rectangle
	private double length;
	
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
	
	public double getArea() {
		return width * length;
	}

	// This main method is for testing the class only.
	// It is not necessary for this class.
	// Uncomment it for testing the class.
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.setWidth(5.0);
		rect.setLength(10.0);
		System.out.println(rect.getArea());
	}
	
}
