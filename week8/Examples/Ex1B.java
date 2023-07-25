// Subclass of Ex1A
public class Ex1B extends Ex1A {
	public void printData() {
		// No problem, pubData is public in superclass
		System.out.println(pubData);

		// Ucomment the line below causes compilation error, 
		// because priData is private in superclass which is not inherited.
		//System.out.println(priData);

		// No problem, getPriData() is public in superclass
		System.out.println(getPriData());
		
		// Uncomment the line below causes compilation error, 
		// because privateMethod() is private in superclass which is not inherited.
		//privateMethod();
	}
}