/**
	An example that shows missing throw/handle checked exception will cause compilation error
	
	Extra question: Try to add throws FileNotFoundException to the header of someMethod. Why there is still compilation error?
*/

import java.io.*;
import java.util.Scanner;

public class CheckedException {
	// Compilation error because missing throws FileNotFoundException or any of its superclass.
	public static void someMethod() {   // throws FileNotFoundException {  // <-- Missing this throw clause
		// As we seen for many times, read/write file
		// may cause some FileNotFoundException which is a subclass of IOException
		// and IOException is subclass of Exception.
		// So, FileNotFoundException is a checked exception and 
		// we should handle it or have a throws clause with FileNotFoundException or anyone of its superclass in the method header 
		File file = new File("someFile.txt");
		Scanner fileReader = new Scanner(file);
		fileReader.close();		
	}
	
	public static void main(String[] args) {
		someMethod();
	}
}
