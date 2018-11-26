package decisionMaking;

import java.util.Scanner;
//not done need help

public class LoopOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double number = 0;
		double sum;
		while (number != 150) {
			System.out.println("Please enter a number");
			number = input.nextDouble();
			sum = number + number;
			System.out.println(sum);
		}

	}

}
