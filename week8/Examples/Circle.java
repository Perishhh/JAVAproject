// Subclass of Shape
public class Circle extends Shape {
	private double radius;
	
	public Circle(double r) {
		radius = r;
	}
	
	@Override
	public double area() {
		return 3.14 * radius * radius;
	}
}