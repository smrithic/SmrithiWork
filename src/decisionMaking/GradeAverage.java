package decisionMaking;

import java.util.Scanner;

public class GradeAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double average;
		double homeavg;
		boolean nice;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your test average?");
		average = input.nextDouble();
		System.out.println("What is your homework average?");
		homeavg = input.nextDouble();
		System.out.println("True or false, your teacher is nice?");
		nice = input.nextBoolean();
		if (nice == true) {
			if (average > homeavg) {
				System.out.println("Your grade is " + average);
			} 
			else {
				if (average < homeavg) {
					System.out.println("Your grade is " + homeavg);
				} 
			}
	}
		else {
			if (nice == false) {
				if (average > homeavg) {
					System.out.println("Your grade is " + homeavg);
				} else {
					if (average < homeavg) {
						System.out.println("Your grade is " + average);
					}
				}
			}
		}
			
		System.out.println("Have a good day.");

		}

}
