/**
   This program uses the == operator to compare String objects.
*/

public class BadStringCompare {
	public static void main(String [] args)	{
		String  name1 = new String("lmk"),
				name2 = new String("lmk"),
				name3 = "lmk", 
				name4 = "lmk";
				

		// Compare the two String objects with content "lmk" 
		// that are created by the new keyword by the == operator.
		// It indeed compares the memory addresses that are stored 
		// in name1 and name2. So, the boolean expression, name1 == name2,
		// is false.
		if (name1 == name2) {
			System.out.println(name1 + " and " + name2 + " are the same.");
		} else {
			System.out.println(name1 + " and " + name2 + " are NOT the same.");
		}

		// Compare the two String literals, "lmk" and "lmk", by == operator.
		// String literal is also a String object. 
		// It indeed compares the memory addresses that are stored in 
		// name3 and name4. Why the result shows they are the same?
		if (name3 == name4) {
			System.out.println(name3 + " and " + name4 + " are the same.");
		} else {
			System.out.println(name3 + " and " + name4 + " are NOT the same.");
		}
		
		// Compare a String object (referenced by variable name1) that is created by the 
		// new keyword with a String literal (referenced by variable name2). 
		// Both have the same content "lmk". But name1 == name3 is false.
		if (name1 == name3) {
			System.out.println(name1 + " and " + name3 + " are the same.");
		} else {
			System.out.println(name1 + " and " + name3 + " are NOT the same.");
		}

	}
}

