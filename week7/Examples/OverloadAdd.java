/*
	An example that demonstrates method overloading.
*/

public class OverloadAdd {

	// A method with signature add(int, int)
	public static int add(int num1, int num2) {
		return num1 + num2;
	}

	// The method below has conflict with the method above 
	// because it's signature is also add(int, int)
	// They cannot exist simultaneously
	// Try comment out the above one and uncomment the one below
	/* 
	public static String add(int num1, int num2) {
		if (num1 + num2 > 10)
			return "Large";
		else
			return "Small";
	}
	*/
	// A method with signature add(int, int, int)
	public static int add(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	// A method with signature add(String, String)
	public static int add(String name1, String name2) {
		return name1.length() + name2.length();
	}
	
	public static void main(String[] args) {
		System.out.println(add(11,12));
		System.out.println(add(10,11,12));
		System.out.println(add("My", "Name"));
	}

}
