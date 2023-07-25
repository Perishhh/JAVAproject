/**
   This program compares String objects using
   the compareTo method.
*/

public class StringCompareTo {
	public static void main(String [] args) {
		String name1 = new String("Lau Man"),
			   name2 = new String("Lau Man Kit"), 
			   name3 = new String("Man Kit");

		// Compare "Lau Man" and "Lau Man Kit".
		// The result is that "Lau Man" is less than "Lau Man Kit".
		// name1.compareTo(name2) returns an int value.
		// - This int value is negative if the content of name1 
		//   is LESS than the content of name2.
		// - This int value is 0 if the content of name1 
		//   equals to the content of name2.
		// - This int value is positive if the content of name1 
		//   is GREATER than the content of name2.
		// What is the definition of String ordering? 
		// Answer: Lexicographical Order.
		if (name1.compareTo(name2) < 0) {
			System.out.println(name1 + " is less than " + name2);
		} else if (name1.compareTo(name2) == 0) {
			System.out.println(name1 + " is equal to " + name2);
		} else if (name1.compareTo(name2) > 0) {
			System.out.println(name1 + " is greater than " + name2);
		}
		
		// Compare "Man Kit" and "Lau Man Kit".
		// The result is that "Man Kit" is greater than "Lau Man Kit".
		if (name3.compareTo(name2) < 0) {
			System.out.println(name3 + " is less than " + name2);
		} else if (name3.compareTo(name2) == 0) {
			System.out.println(name3 + " is equal to " + name2);
		} else if (name3.compareTo(name2) > 0) {
			System.out.println(name3 + " is greater than " + name2);
		}
	}
}
