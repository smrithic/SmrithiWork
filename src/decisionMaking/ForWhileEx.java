package decisionMaking;

import java.util.Scanner;

public class ForWhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int counter = 0;
		int sum = 0;
		int number;

		
		for (counter = 1; counter <= 10000; counter = counter +1) {
			
			System.out.println("Please enter a number");
			number = input.nextInt();
			if (number % 2 ==0) {
				System.out.println(number + " is even");
			}
			else {
				System.out.println(number + " is odd");
			}
		}
		System.out.println();

		
		input.close();
	}

}
