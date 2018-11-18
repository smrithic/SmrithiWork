package decisionMaking;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		boolean primeNumber = true;
		
		System.out.println("Please enter a number");
		double number = input.nextDouble();
		
		for (double i = 2; i < number; i++)
		{
			if (number % i == 0) {
				primeNumber = false;
				break;
			}
		}
		
		System.out.println("The number is " + (primeNumber ? "" : "not") + "a prime");
		input.close();
	}

}
