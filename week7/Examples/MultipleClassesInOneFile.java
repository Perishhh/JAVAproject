/* 
	Multiple classes in the same .java file is NOT recommended.
	This is just an example to show that it is allowed.
*/

// It will prompt an error if the keyword public is added 
// right before the keyword class of the class below.
class SecondClassInOneFile {
	public int data = 10;
}

public class MultipleClassesInOneFile {
	public static void main(String[] args) {
		SecondClassInOneFile obj = new SecondClassInOneFile();
		System.out.println(obj.data);
	}
}
