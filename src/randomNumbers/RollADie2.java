package randomNumbers;

import java.util.Scanner;
import java.util.Random;

public class RollADie2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Random generator = new Random();

		System.out.println("How many times do you want to roll?");
		int rolls = input.nextInt();
		int min = 1;
		int max = 6;
		int randomNum = 0;
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int six = 0;
		int percentOne = 1;
		int percentTwo = 1;
		int percentThree = 1;
		int percentFour = 1;
		int percentFive = 1;
		int percentSix = 1;
		for (int i = 1; i <= rolls; i++) {
			randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum == 1) {
				one++;
			} else {
				if (randomNum == 2) {
					two++;
				} else {
					if (randomNum == 3) {
						three++;
					} else {
						if (randomNum == 4) {
							four++;
						} else {
							if (randomNum == 5) {
								five++;
							} else {
								if (randomNum == 6) {
									six++;
								}
							}
						}
					}
				}
			}

		}
		percentOne = (one * 100) / rolls;
		percentTwo = (two * 100) / rolls;
		percentThree = (three * 100) /rolls;
		percentFour = (four * 100) /rolls;
		percentFive = (five * 100) / rolls;
		percentSix = (six * 100) /rolls;
		System.out.println("The number of ones are " + one + " and the percent is " + percentOne);
		System.out.println("The number of twos are " + two + " and the percent is " + percentTwo);
		System.out.println("The number of threes are " + three + " and the percent is " + percentThree);
		System.out.println("The number of fours are " + four + " and the percent is " + percentFour);
		System.out.println("The number of fives are " + five + " and the percent is " + percentFive);
		System.out.println("The number of six are " + six + " and the percent is " + percentSix);

	}

}
