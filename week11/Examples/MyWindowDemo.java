/**
	An example that demonstrates the use 
	of a class that extends JFrame
*/

public class MyWindowDemo {
	public static void main(String[] args) {
		// If reference variable of the window is not needed,
		// it can be simplified to
		// new MyWindow("My window", 500, 700);
		MyWindow myWindow = new MyWindow("My window", 500, 700);
	}
}