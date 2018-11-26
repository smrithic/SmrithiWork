package randomNumbers;

import java.util.Scanner;
import java.util.Random;

public class RollADie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		int min = 1;
		int max = 0;
		System.out.println("how many sides are there on the die?");
		max = input.nextInt();
		
		int randomNum = 0;
		int headcount = 0;
		int tailcount = 0;
		
		System.out.println("How many times do you want to roll?");
		int rolls = input.nextInt();
		for (int i = 1; i <= rolls; i++) {

			randomNum = min + generator.nextInt(max - min + 1);
			System.out.println("You rolled a  " + randomNum);


		}
	}

}
