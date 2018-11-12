package decisionMaking;

import java.util.Scanner;

public class DoWhile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = 0;
		final int MULTIPLY = 17;
		do {
			int product = number * MULTIPLY;
			System.out.println("Your magic number is " + product);
			System.out.println("Please enter a number");
			number = input.nextInt();
		} 
		while (number != 9999);

		input.close();
	}

}
