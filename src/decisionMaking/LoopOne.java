package decisionMaking;

import java.util.Scanner;

public class LoopOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = 0;
		int two;
		while (number != 9999) {
			System.out.println("Please enter a number");
			number = input.nextInt();
			two = number * 2;
			System.out.println(two);
			
		}

	}

}
