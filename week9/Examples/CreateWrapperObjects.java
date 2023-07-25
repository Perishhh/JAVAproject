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
		System.out.println("--Printing the values of the wrapper class objects--");
		System.out.println("intObj = " + intObj);
		System.out.println("byteObj = " + byteObj);
		System.out.println("shortObj = " + shortObj);
		System.out.println("doubleObj = " + floatObj);
		System.out.println("floatObj = " + doubleObj);
		System.out.println("charObj = " + charObj);
		System.out.println("boolObj = " + boolObj);
		
		Integer intObj2 = 15;
		Integer intObj3 = 16;
		
		// Two wrapper class objects can be compared directly by relational operators.
		System.out.println("--Result of comparing two Integer objects by == operator [intObj == intObj2]--");
		if (intObj == intObj2)
			System.out.println("Wrapper class objects intObj and intObj2 have the same value, intObj = intObj2 = " + intObj);
		else
			System.out.println("Wrapper class objects intObj and intObj2 have different values, intObj = " + intObj + " and intObj2 = " + intObj2);
		
		System.out.println("--Result of comparing two Integer objects by == operator [intObj == intObj3]--");
		if (intObj < intObj3)
			System.out.println("Wrapper class objects intObj smaller than intObj3, intObj = " + intObj + " and intObj3 = " + intObj3);
		else
			System.out.println("Wrapper class objects intObj greater than or equal to intObj3, intObj = " + intObj + " and intObj3 = " + intObj3);
		
		// Wrapper class object can be directly compared with primitive data type value.
		System.out.println("--Result of comparing an Integer object with an int value by == operator [intObj == 15]--");
		if (intObj == 15)
			System.out.println("intObj is 15");
		
		System.out.println("--Result of comparing a Character object with a char value by == operator [charObj == 'A']--");
		if (charObj == 'A')
			System.out.println("charObj is A");
		
		// A wrapper class object can be assigned to a corresponding primitive type variable.
		System.out.println("--Outputs of assigning wrapper class objects to the corresponding primitive type variables--");
		int i = intObj;
		System.out.println("After running int i = intObj, the value of i is " + i);
		
		char c = charObj;
		System.out.println("After running char c = charObj, the value of c is " + c);
		
		// Assign Integer object to double type variable has no problem.
		double da = intObj;
		System.out.println("After running double da = intObj, the value of da is " + da);
		
		// Use the intValue method to get the int value 
		// of the Double object.
		System.out.println("--intValue() is a non-static method of the Double class--");
		int ia = doubleObj.intValue();
		System.out.println("After running int ia = doubleObj.intValue(), the value of ia is " + ia);
		
		// Cannot apply data type casting to wrapper class object
		// The code below rises compilation error.
		// int ib = (int) doubleObj;

		// The method doubleValue returns a double type value 
		// of the Double object. We can then use data type 
		// casting to convert this double (primitve) to int.
		int ic = (int) doubleObj.doubleValue();
		System.out.println("After running int ic = (int) doubleObj.doubleValue(), the value of ic is " + ic);

		// Assign Integer object to Double type variable causes error.
		//doubleObj = intObj;
		// Use type casting still causes error.
		//doubleObj = (Double) intObj;
		//int ic = (Integer) doubleObj;
		//int id = (int) doubleObj;
		
		// You cannot assign a Short object to an Integer type variable, 
		// although you can assign short value to int variable.
		// The two lines of codes below causes compilation error.
		// Short shortObj2 = 10;
		// Integer intObj4 = shortObj2;
	}
}