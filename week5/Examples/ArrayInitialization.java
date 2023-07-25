/**
	This example illustrates how to define and initialize 
	an array variable as well as how to create an array object.
*/
public class ArrayInitialization {

	public static void main(String[] args) {
		//----Example 1----
		System.out.println("----Example 1----");
		// Define an int array type variable named numbers1.
		int[] numbers1;
		// numbers1 and numbers2 are declared in typical way.
		
		// new int[4] creates an int array object of size 4.
		// The memory address of this object is assigned to 
		// the variable numbers1.
		numbers1 = new int[4];

		// Assign values to each of the 4 int entries of 
		// the array object that is pointed by numbers1.
		numbers1[0] = 14; 
		numbers1[1] = 18; 
		numbers1[2] = 20; 
		numbers1[3] = 15; 

		// Print the content of the array object that is 
		// pointed by numbers1.
		System.out.println("numbers1[0] = " + numbers1[0]);
		System.out.println("numbers1[1] = " + numbers1[1]);
		System.out.println("numbers1[2] = " + numbers1[2]);
		System.out.println("numbers1[3] = " + numbers1[3]);
		//----End of Example 1----
		
		//----Example 2----
		System.out.println("----Example 2----");
		// Create an int array object of size 4 with the given values
		// and define an int array type variable, numbers2, to keep 
		// its memory address.
		// Note, this way, { ... }, for creating array object can ONLY be
		// used with defining the corresponding array type variable.
		int[] numbers2 = { 14, 18, 20, 15 };

		// Print the content of the array object that is 
		// pointed by numbers2 through a for-loop with 
		// formatted printing.
		for (int i = 0; i < 4; i++) {
			System.out.printf("numbers2[%d] = %d\n", i, numbers2[i]);
		}
		//----End of Example 2----
		
		//----Example 3----
		System.out.println("----Example 3----");
		// Create an int array object of size 4 with the given values
		// and define an int array type variable, numbers3, to keep 
		// its memory address. The variable numbers3 is defined in 
		// the alternate way instead of the typical way.
		int numbers3[] = { 14, 18, 20, 15 };

		// Print the content of the array object that is 
		// pointed by numbers3 through a for-loop with 
		// string concatenation.
		for (int i = 0; i < 4; i++) {
			System.out.println("numbers3[" + i + "] = " + numbers3[i]);
		}
		//----End of Example 3----
		
		//----Example 4----
		System.out.println("----Example 4----");
		int arraySizeInt = 4;
		// Use an int type variable, arraySizeInt, to specify the array size.
		int numbers4[] = new int[arraySizeInt];
		numbers4[0] = 14; 
		numbers4[1] = 18; 
		numbers4[2] = 20; 
		numbers4[3] = 15;

		// Print the content of the array object that is 
		// pointed by numbers3 through a while-loop.
		int i = 0;
		while (i < 4) {
			System.out.println("numbers4[" + i + "] = " + numbers4[i]);
			i++;
		}
		//----End of Example 4----
		
		// Use a long variable to specify the array size.
		// This causes compilation error.
		/*
		long arraySizeLong = 4;
		int numbers5[] = new int[arraySizeLong];
		*/
	}
}