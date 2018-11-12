package decisionMaking;

import java.util.Scanner;

public class SumTheNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		do {
			int sum = num1 + num2;
			System.out.println("The sum is " + sum);
			System.out.println("Please enter two numbers");
			num1 = input.nextInt();
			num2 = input.nextInt();

		} while (num1 != 999);
		input.close();

	}
}
