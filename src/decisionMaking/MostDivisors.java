package decisionMaking;

import java.util.Scanner;

public class MostDivisors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double factorcount = 0;
		double maxfactorcount = 0;
		double number_with_maxfactorcount = 0;
		System.out.println("Please enter a number");
		double number = input.nextDouble();

		for (double j = 1; j < number; j++) {
			factorcount = 0;
			for (double i = 1; i <= j; i++) {

				factorcount = ((j % i == 0) ? ++factorcount : factorcount);
			}
			if (factorcount >= maxfactorcount) {
				maxfactorcount = factorcount;
				number_with_maxfactorcount = j;
			}
		}

		System.out.println("The number with the maximum number of factors is " + number_with_maxfactorcount);
		input.close();
	}

}
