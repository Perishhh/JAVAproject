import java.util.Scanner; // Needed for the Scanner class

/**
   This program demonstrates a nested-if statements
*/

public class GradeByNestedIf {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input a score: ");
		double score = Double.parseDouble(input.nextLine());
		input.close();

		char grade;

		if (score < 0) {
			System.out.println("Invalid score!");
			grade = 'X';
		} else {
			if (score < 60) {
				grade = 'F';
			} else {
				if (score < 70) {
					grade = 'D';
				} else {
					if (score < 80) {
						grade = 'C';
					} else {
						if (score < 90) {
							grade = 'B';
						} else {
							if (score <= 100) {
								grade = 'A';
							} else {
								System.out.println("Invalid score!");
								grade = 'X';
							}
						}
					}
				}
			}
		}
		
		// Note that the above nested if statement is equivalent 
		// to the nested if statement below, i.e. some curly braces 
		// are not necessary because they are followed by only one 
		// Java statement.
		/*
		if (score < 0) {
			System.out.println("Invalid score!");
			grade = 'X';
		} else
			if (score < 60)
				grade = 'F';
			else
				if (score < 70)
					grade = 'D';
				else
					if (score < 80)
						grade = 'C';
					else
						if (score < 90)
							grade = 'B';
						else
							if (score <= 100)
								grade = 'A';
							else {
								System.out.println("Invalid score!");
								grade = 'X';
							}
		*/
		
		System.out.println("The grade is " + grade);
	}
}
