/*
	This example shows that 
	non-static fields are not 
	shared. Each object has 
	its own copy of the non-static
	fields.
*/

public class Ex4A {
	public static void main(String[] args) {
		Ex4B obj1 = new Ex4B();
		Ex4B obj2 = new Ex4B();

		// The non-static fields of obj1 is increased by 1
		obj1.nStData++; 
		// The non-static fields of obj2 is increased by 1
		obj2.nStData++;

		// Calls the update method of obj2
		obj2.update();

		// Print the data
		System.out.println(
			obj1.nStData + "," + 
			obj2.nStData
		);
	}
}