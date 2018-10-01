package mathOperators;

import java.util.Scanner;

public class MakeSomeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double money = 0.0;
		int dollars = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("How much money do you need change for?");
		money = input.nextDouble();
		dollars = (int) ((money * 100) / 100);
		quarters = (int) (((money * 100) % 100) / 25);
		dimes = (int) (((money * 100) % 100 - 25 * quarters) / 10);
		nickels = (int) (((money * 100) % 100) - 25 * quarters - 10 * dimes);
		pennies = (int) (((money * 100) % 100 - 25 * quarters - 10 * dimes - 5 * nickels));
		System.out.println("You will get " + dollars + " dollars");
		System.out.println("You will get " + quarters + " quarters");
		System.out.println("You will get " + dimes + " dimes");
		System.out.println("You will get " + nickels + " nickels");
		System.out.println("You will get " + pennies + " pennies");

	}

}
