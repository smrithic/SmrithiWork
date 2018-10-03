package mathOperators;

import java.util.Scanner;

public class SSN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 0;
		int socialSN = 0;
		int yearsUntil18 = 0;
		int fourDigitsOfSSN = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("What is your social security number with no dashes?");
		socialSN = input.nextInt();
		yearsUntil18 = 18 - age;
		fourDigitsOfSSN = socialSN % 10000;
		System.out.println("The person's age is " + age);
		System.out.println("It will be " + yearsUntil18 + " years until this person turns 18");
		System.out.println("Their social security number is " + socialSN);
		System.out.println("The last four digits of their number is " + fourDigitsOfSSN);
		input.close();
	}

}
