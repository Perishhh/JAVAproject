public class ShortCircuitingProof {
	public static void main(String[] args) {

		//---------Start of your code-------------
		// Add your code below for verifying the early circuiting
		// You should verify early circuiting for both && and || operators.
		int m = 1;
		System.out.println("( m<2 || ++m==1), m=1");
		if( m<2 || ++m==1) {
			System.out.printf("True, the value of m is %d\n\n",m);
		}else{
			System.out.printf("False, the value of m is %d\n\n",m);
		}
		
		m = 1;
		System.out.println("( m>2 && ++m==1), m=1");
		if( m>2 && ++m==1) {
			System.out.printf("True, the value of m is %d\n\n",m);
		}else{
			System.out.printf("False, the value of m is %d\n\n",m);
		}

		
		//---------End of your code-------------


		/*
			Explain inside this comment block about why 
			your code above can verify the Early circuiting.
			
			As for the first decision,
			m<2 is true, with || the program skips the condition behind, and the result is True, m still equals 1.
			we can say && exists shortcircuiting.
			
			As for the second decision,
			m>2 is false, with && the program skips the condition behind, and the result is False, m still equals 1.
			we can say || exists shortcircuiting.
		*/
	}
}
