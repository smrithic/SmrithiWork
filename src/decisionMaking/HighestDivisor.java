package decisionMaking;

import java.util.Scanner;

public class HighestDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double highestdivisor = 0;
		System.out.println("Please enter a number");
		double number = input.nextDouble();
		for (double i = 1; i < number; i++) {
			highestdivisor = ((number % i == 0) ? i : highestdivisor);
		}
		System.out.println("The highest divisor is " + highestdivisor);
		input.close();
	}
}