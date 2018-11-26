package decisionMaking;

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int students = 1;
		int i = 1;
		double average = 0.0;
		double testScore = 0.0;
		int total = 0;

		System.out.println("How many students took the test?");
		students = input.nextInt();
		

		for (i = 1; i <=  students; i++) {
			System.out.println("What are the test scores for each student?");
			testScore = input.nextDouble();
			total+=testScore;
		}
		average = total / students;

		System.out.println("Your class average is " + average);
		input.close();
	}

}
