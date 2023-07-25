// An example of recursion that will end.
public class Recursion {
	
	public static void recursion(int i) {
		if (i > 4) 		// Stop condition
			return ;

		System.out.println("Start recursive call " + i);
		
		// Call the method recursion with passing an argument i+1.
		recursion(i+1);
	
		System.out.println("End recursive call " + i);
	}
	
	public static void main(String[] args) {
		// Initial call to the method recursion.
		recursion(1);
	}
}