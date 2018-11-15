package decisionMaking;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int i = 1, factorial = 1;
		int number = 1;
		System.out.println("Please enter a number");
		number = input.nextInt();

		for (i = 1; i <= number; i++) 
		{
			
			factorial = factorial * i;
			

		}

		System.out.println("The factorial is " + factorial);
		input.close();
	}

}
