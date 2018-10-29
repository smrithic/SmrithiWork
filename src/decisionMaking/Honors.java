package decisionMaking;

import java.util.Scanner;

public class Honors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gpa;
		int classx;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your GPA?");
		gpa = input.nextDouble();
		System.out.println("What is your grade level?");
		classx = input.nextInt();
		if (classx == 12 && gpa >= 3.5) {
			System.out.println("You graduate with honors");
		} 
		else 
		{
			System.out.println("Either you are not a senior, or you won't graduate with honors");
		}
		System.out.println("Have a good day");
	}

}
