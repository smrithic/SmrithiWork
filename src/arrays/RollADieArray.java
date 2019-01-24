package arrays;

import java.util.Random;
import java.util.Scanner;

public class RollADieArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();

		int min = 1;
		int max = 6;
		int randomNum = 0;
		boolean finish = false;

		final int rolls = 10000;
		int[] die = new int[rolls];
		do {

		for (int i = 0; i < die.length; i++) {
			randomNum = min + generator.nextInt(max - min + 1);
			die[i] = randomNum;
			System.out.println("You rolled a  " + randomNum);
		}
		System.out.println("Would you like to finish? True/False");
		finish = input.nextBoolean();
		}
		
		while(finish == false);
		
	}

}
