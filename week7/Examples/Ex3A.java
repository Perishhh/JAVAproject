/*
	This example shows the difference between
	static and non-static fields.
	Static fields are common (shared) among 
	the class and all objects of the class.
*/
public class Ex3A {
	public static void main(String[] args) {
		Ex3B obj = new Ex3B();

		obj.nStData = 20;
		obj.stData = 30;
		obj.update();
		obj.print();

		Ex3B.stData = 40;
		obj.stData++;
		Ex3B.print();
		
		// The line below causes compilation error, why?
		// Ex3B.nStData = 100;
		// Ex3B.updata();
	}
}
