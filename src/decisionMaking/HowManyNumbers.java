package decisionMaking;

import java.util.Scanner;

public class HowManyNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number");
		int number = input.nextInt();
		int sum = 0;
		
		do 
		{
			sum += number;
			System.out.println("The sum is " + sum);
			System.out.println("Please enter a number");
			number = input.nextInt();
	
			
		} 
		while (sum > 2018);
		System.out.println("How many numbers did you enter?");
		int amount = input.nextInt();
		System.out.println("The amount of numbers entered is " + amount );

	}

}
