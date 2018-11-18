package decisionMaking;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = 0;
		int divisor = 0;
		int counter = 0;
		int j = 0;
		System.out.println("Please enter a number");
		number = input.nextInt();
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				counter++;
			}
			if (counter < number) {
				divisor = counter;
				j = divisor;
			}

		}
		
		System.out.println("The divisors are " + divisor);
		input.close();
	}
}
