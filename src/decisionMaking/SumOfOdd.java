package decisionMaking;

import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = 1;
		int i = 0;
		int sum = 0;
		System.out.println("Please enter a number");
		number = input.nextInt();

		for (i = 1; i < number; i = i+2) 
		{
			
			
				sum += i;
		
			
		}

		System.out.println("The sum of the odd numbers are " + sum);
		input.close();
	}

}
