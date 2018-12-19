package arrays;

import java.util.Scanner;
import java.util.Random;

public class RollADieV3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		int students = 0;
		int sides = 0;
		int randomNum = 0;
		int value = 0;
		int counter = 0;

		System.out.println("How many students are there in the class?");
		students = input.nextInt();
		System.out.println("How many sides on the die?");
		sides = input.nextInt();
		System.out.println("How many times should each student roll?");
		int rolls = input.nextInt();
		System.out.println("Please enter the value you would like to check for:");
		value = input.nextInt();

		int[][] die = new int[students][rolls];

		for (int rows = 0; rows < die.length; rows++) {
			for (int columns = 0; columns < die[0].length; columns++) {
				randomNum = 1 + generator.nextInt(sides - 1 + 1);
				die[rows][columns] = randomNum;
				System.out.print(randomNum);
				System.out.println();
				if (die[rows][columns] == value) {
					counter++;
				}
			}
		}
		System.out.println("Your value showed up " + counter + " times");

	}

}
