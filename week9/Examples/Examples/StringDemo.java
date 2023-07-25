// An example for illustrating the use of more methods from the String class.
public class StringDemo {
	public static void main(String[] args) {
		String s = "Programming";
		
		System.out.println("\"" + s + "\" starts with \"Pr\"? " + s.startsWith("Pr"));
		System.out.println("\"" + s + "\" starts with \"pr\"? " + s.startsWith("pr"));
		System.out.println("\"" + s + "\" ends with \"Ng\"? " + s.endsWith("Ng"));
		System.out.println("\"" + s + "\" ends with \"ng\"? " + s.endsWith("ng"));
		System.out.println("The first occurrence of \"r\" in \"" + s + "\" is at index " + s.indexOf("r"));
		System.out.println("The first occurrence of \"r\" with searching from the third character of \"" + s + "\" is at index " + s.indexOf("r", 2));
		System.out.println("The last occurrence of \"r\" in \"" + s + "\" is at index " + s.lastIndexOf("r"));
		System.out.println("The last occurrence of \"r\" with searching from the fifth charcter of \"" + s + "\" is at index " + s.lastIndexOf("r", 4));
		System.out.println("The last occurrence of \"r\" with searching from the third charcter of \"" + s + "\" is at index " + s.lastIndexOf("r", 2));
		
		System.out.println("The first occurrence of \"ram\" in \"" + s + "\" is at index " + s.indexOf("ram"));
		System.out.println("The last occurrence of \"ram\" in \"" + s + "\" is at index " + s.lastIndexOf("ram"));
		
		System.out.println("The first occurrence of \"abc\" in \"" + s + "\" is at index " + s.indexOf("abc"));
		System.out.println("The last occurrence of \"abc\" in \"" + s + "\" is at index " + s.lastIndexOf("abc"));
		
		System.out.println("The substring of \"" + s + "\" from the third character is \"" + s.substring(2) + "\"");
		System.out.println("The substring of \"" + s + "\" from the third to eighth character is \"" + s.substring(2,8) + "\"");
	}
}