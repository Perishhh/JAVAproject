import java.util.Scanner; // Needed for the Scanner class

/**
   This program demonstrates a nested-if statements
*/

public class GradeByIfElseIf {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a score: ");
		int score = input.nextInt();
		input.close();

		char grade;

		// Note that, if ignoring the possible compiler optimization, the if-else-if statement 
		// below is equivalent to the nested if version in GradeByNestedIf.java. 
		// The if-else-if statement just put those nested-ifs to same line as the corresponding 
		// else.

		if (score < 0) {
			System.out.println("Invalid score!");
			grade = 'X';
		} else if (score < 60) {
			grade = 'F';
		} else if (score < 70) {
			grade = 'D';
		} else if (score < 80) {
			grade = 'C';
		} else if (score < 90) {
			grade = 'B';
		} else if (score <= 100) {
			grade = 'A';
		} else {
			System.out.println("Invalid score!");
			grade = 'X';
		}
		
		System.out.println("The grade is " + grade);
	}
}
