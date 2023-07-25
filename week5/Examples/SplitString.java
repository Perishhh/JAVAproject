/**
	This example illustrates how to split a string 
	into a string array according to some delimiter.
*/
public class SplitString {

	public static void main(String[] args) {
		// Declare and initial a String.
		String str = "ab,c,def";
		// Split the string by comma.
		// The resulting strings are kept in a String array.
		String[] strArr = str.split(",");
		
		// Print the array size.
		System.out.println("strArr contains " + strArr.length + " elements");

		// Print the contain of the array.
		for (int i = 0; i < strArr.length; i++) {
			System.out.println("strArr[" + i + "] = " + strArr[i]);
		}
	}
}
