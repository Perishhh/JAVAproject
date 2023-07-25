// Subclass of Shape
public class Rectangle extends Shape {
	private double width;
	private double length;
	
	public Rectangle(double w, double len) {
		width = w;
		length = len;
	}
	
	@Override
	public double area() {
		return width * length;
	}
}
