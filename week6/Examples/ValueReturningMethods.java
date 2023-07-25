/**
   This program demonstrates the usage of return.
*/

public class ValueReturningMethods {
	/*
		The getSum method returns the 
		sum of the two parameters.
	*/
	public static int getSum(int num1, int num2) {
		return num1 + num2;
	}

	/*
		The getDiff method returns the result of the 
		first parameter minors the second parameter.
		
	*/
	public static double getDiff(int num1, double num2) {
		return num1 - num2;
	}
	
	/*
		The method below causes error.
		Can you explain why?
	*/
	//public static int getDiffError(int num1, double num2) {
	//	return num1 - num2;
	//}
	
	/*
		The method below returns an int array
	*/
	public static int[] createIntArray() {
		int[] arr = { 3, 5, 7 };
		return arr;
	}
	
	/*
		return can also be used for methods with 
		void return type. 
		In this method, if the parameter v greater 
		than 10, the method returns and thus the 
		last statement 
		  [System.out.println("Last statement in method returnFromVoid");]
		is not executed.
	*/
	public static void returnFromVoid(int v) {
		System.out.println("First statement in method returnFromVoid");
		if (v > 10)
			return ;
		System.out.println("Last statement in method returnFromVoid");
	}
	
	/*
		The method below causes error.
		Can you explain why?
	*/
	//public static int[] createIntArrayError() {
	//	return { 3, 5, 7 };
	//}

	public static void main(String[] args) {
		// Calls the getSum method with arguments 20 and 5.
		// The result is stored into the variable sum.
		int sum = getSum(20, 5);
		System.out.println("The sum of 20 and 5 is " + sum);

		// Calls the getDiff method with arguments 20 and 5.
		// The result is immediately print to screen.		
		System.out.println("The diff of 20 and 5 is " + getDiff(20, 5));

		// Calls the getDiff method with arguments 20 and 5.3.
		// The result is immediately print to screen.				
		System.out.println("The diff of 20 and 5.3 is " + getDiff(20, 5.3));
		
		// The code below causes error, why?
		//System.out.println("The diff of 5.3 an 20 is " + getDiff(5.3, 20));
		
		// Call the createIntArray method.
		// The result is stored in intArr.
		// This is return by reference because 
		// the data type is non-primitive.
		int[] intArr = createIntArray();
		for (int i = 0; i < intArr.length; i++)
			System.out.println("intArr[" + i + "] = " + intArr[i]);
		
		// The code below causes error.
		// Can you explain why?
		//double[] doubleArr = createIntArray();
		
		System.out.println("----Calling returnFromVoid(5)----");
		// Call returnFromVoid with parameter 5.
		returnFromVoid(5);

		System.out.println("----Calling returnFromVoid(11)----");
		// Call returnFromVoid with parameter 11.
		returnFromVoid(11);
	}
}
