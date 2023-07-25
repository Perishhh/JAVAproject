// An example of recursion that never ended.
// **Be careful, this program will not end until out of heap memory (out of syllabus)**
// **You just need to know that this program will not end theoreically.
public class EndlessRecursion {
	
	public static void endlessRecursion(int i) {
		
		System.out.println("Start recursive call " + i);
		
		// Call the method endlessRecursion with passing an argument i+1.
		endlessRecursion(i+1);
	
		System.out.println("End recursive call " + i);
	}
	
	public static void main(String[] args) {
		// Initial call to the method endlessRecursion.
		endlessRecursion(1);
	}
}