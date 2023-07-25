/**
   This program compares the CONTENT of String objects using
   the equals method in String Class.
*/

public class StringEquals {
	public static void main(String [] args) {
		String  name1 = new String("Lau Man Kit"), 
				name2 = new String("Lau Man Kit"), 
				name3 = new String("lmk");

		// Compare the content of name1 and the content of name2 by equals method.
		// It is NOT comparing the memory addresses.
		// The statement name1.equals(name2) returns a boolean value that indicates 
		// whether the content of name1 is the same as the content of name2.
		if (name1.equals(name2)) {
			System.out.println(name1 + " and " + name2 + " are the same.");
		} else {
			System.out.println(name1 + " and " + name2 + " are the NOT the same.");
		}

		// Compare the content of name1 and the content of name3 by equals method.
		// It is NOT comparing the memory addresses.
		// The statement name1.equals(name3) returns a boolean value that indicates 
		// whether the content of name1 is the same as the content of name3.
		if (name1.equals(name3)) {
			System.out.println(name1 + " and " + name3 + " are the same.");
		} else {
			System.out.println(name1 + " and " + name3 + " are the NOT the same.");
		}
	}
}
