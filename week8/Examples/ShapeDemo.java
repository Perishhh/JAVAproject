/**
	This example illustrates the usage of abstract class
*/
public class ShapeDemo {
	public static void main(String[] args) {
		// The line below causes error, why?
		//Shape s = new Shape();
		
		Rectangle rect = new Rectangle(5.0, 10.0);
		Circle circ = new Circle(8.0);
		rect.printArea();
		circ.printArea();
	}
}