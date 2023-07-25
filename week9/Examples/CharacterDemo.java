// An example of using the Character wrapper class.
public class CharacterDemo {
	public static void main(String[] args) {
		// Create a charObj.
		Character charObj = 'B';
		// Character object can be printed directly.
		System.out.println("Character charObj = " + charObj);
		
		// Some usage examples of the Character Class Methods.
		System.out.println("Is 'A' a digit? " + Character.isDigit('A'));
		System.out.println("Is '3' a digit? " + Character.isDigit('3'));
		System.out.println("Is 'A' a letter? " + Character.isLetter('A'));
		System.out.println("Is '3' a letter? " + Character.isLetter('3'));
		System.out.println("Is 'A' in lower case? " + Character.isLowerCase('A'));
		System.out.println("Is 'a' in lower case? " + Character.isLowerCase('a'));
		System.out.println("Is 'A' in upper case? " + Character.isUpperCase('A'));
		System.out.println("Is 'a' in upper case? " + Character.isUpperCase('a'));
		System.out.println("Is 'a' a space character? " + Character.isSpaceChar('a'));
		System.out.println("Is ' ' a space character? " + Character.isSpaceChar(' '));
		
		System.out.println("Lower case of 'B' is " + Character.toLowerCase('B'));
		System.out.println("Upper case of 'b' is " + Character.toUpperCase('b'));
	}
}