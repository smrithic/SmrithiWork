package arrays;

import java.util.Random;
import java.util.Scanner;

public class RollADieExt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int min = 1;
		int max = 6;
		int rollNum = 0;
		int randomNum = 0;
		boolean finish = false;

		final int rolls = 5;
		int[] die = new int[rolls];
		do {
			System.out.println("Please enter a roll number");
			rollNum = input.nextInt();
			Random number = new Random(rollNum);
			
			for (int i = 0; i < die.length; i++) {
				randomNum = min + number.nextInt(max - min + 1);
				die[i] = randomNum;
				System.out.println("You rolled a  " + randomNum);
			}
			System.out.println("Would you like to finish? True/False");
			finish = input.nextBoolean();
		}

		while (finish == false);
		input.close();
	}

}
