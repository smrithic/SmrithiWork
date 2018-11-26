package decisionMaking;

import java.util.Scanner;

public class RoundingFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int number = 5;
		int rounded = 0;
		boolean quit = false;
			while (quit != true) {
				System.out.println("What is your four digit number?");
				number = input.nextInt();
				rounded = number / 10;
				System.out.println("Your rounded number is " + rounded);
				System.out.println("Do you quit?");
				quit = input.nextBoolean();
			}
			
		
	}

}
