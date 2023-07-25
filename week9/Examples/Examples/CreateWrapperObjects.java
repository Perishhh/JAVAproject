// An example to illustrate the creation of wrapper objects.
public class CreateWrapperObjects {
	public static void main(String[] args) {

		// Create wrapper class objects.
		Integer intObj = 15;
		Byte byteObj = 11;
		Short shortObj = 12;
		Double doubleObj = 12.5;
		Float floatObj = 13.8F;
		Character charObj = 'A';
		Boolean boolObj = true;
		
		// Wrapper class objects can be printed directly.
		System.out.println(intObj);
		System.out.println(byteObj);
		System.out.println(shortObj);
		System.out.println(floatObj);
		System.out.println(doubleObj);
		System.out.println(charObj);
		System.out.println(boolObj);
		
		Integer intObj2 = 15;
		Integer intObj3 = 16;
		
		// Two wrapper class objects can be compared directly by relational operators.
		if (intObj == intObj2)
			System.out.println("Wrapper class objects intObj and intObj2 have the same value, intObj = intObj2 = " + intObj);
		else
			System.out.println("Wrapper class objects intObj and intObj2 have different values, intObj = " + intObj + " and intObj2 = " + intObj2);
		
		if (intObj < intObj3)
			System.out.println("Wrapper class objects intObj smaller than intObj3, intObj = " + intObj + " and intObj3 = " + intObj3);
		else
			System.out.println("Wrapper class objects intObj greater than or equal to intObj3, intObj = " + intObj + " and intObj3 = " + intObj3);
		
		// Wrapper class object can be directly compared with primitive data type value.
		if (intObj == 15)
			System.out.println("intObj is 15");
		
		if (charObj == 'A')
			System.out.println("charObj is A");
		
		int i = intObj;
		System.out.println("int i = " + i);
		
		char c = charObj;
		System.out.println("char c = " + c);
		
		// Assign Integer object to double type variable has no problem.
		double da = intObj;
		System.out.println("da = " + da);
		
		// Use the intValue method to get the int value 
		// of the Double object.
		int ia = doubleObj.intValue();
		System.out.println("ia = " + ia);
		
		// Use the doubleValue method to get the double value 
		// of the Double object, and then use type casting to 
		// convert it to int.
		int ib = (int) doubleObj.doubleValue();
		System.out.println("ib = " + ib);

		// Assign Integer object to Double type variable causes error.
		//doubleObj = intObj;
		// Use type casting still causes error.
		//doubleObj = (Double) intObj;
		//int ic = (Integer) doubleObj;
		//int id = (int) doubleObj;
		

	}
}