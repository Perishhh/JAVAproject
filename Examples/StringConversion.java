/* 
	An example that shows how to define and manipulate 
	Strings object and convert String objects to 
	some primitive data types.
*/

public class StringConversion {
	public static void main(String[] args) {
		// Variable declaration
		String myName;
		
		// Create a String object 
		// and assign myName to reference that object.
		myName = new String("Lau Man Kit");
		
		// Prints the content of myName
		System.out.println(myName);

		// Prints the length of myName
		System.out.println(myName.length());
		
		// Prints the FIFTH character in the content of myName
		System.out.println(myName.charAt(4));
		
		// Prints a separate line
		System.out.println("------------------------");
		// Variable declaration with initialization
		String intStr = new String("003230");
		
		// Convert the string intStr into integer
		int intVal = Integer.parseInt(intStr);
		
		// Prints the content of intStr
		System.out.println(intStr);
		
		// Prints the value of intVal
		System.out.println(intVal);
		
		// Why the results are different in the above two println?

		// Prints a separate line
		System.out.println("------------------------");

		// Variable declaration with initialization
		String douStr = "003230.202200";
		
		// Convert the string douStr into double
		double douVal = Double.parseDouble(douStr);

		// Prints the content of douStr
		System.out.println(douStr);
		
		// Prints the value of douVal
		System.out.println(douVal);
		
		
		// What happen if the following line is uncommented?
		// int nameVal = Integer.parseInt(myName);
	}
}
