package mathOperators;

import java.util.Scanner;

public class AveragingTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int score1 = 0;
		int score2 = 0;
		int score3 = 0;
		int average = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What was the first score?");
		score1 = input.nextInt();
		System.out.println("What was the second score?");
		score2 = input.nextInt();
		System.out.println("What was the third score?");
		score3 = input.nextInt();
		average = (score1 + score2 + score3) / 3;
		System.out.println("The average of the test scores is " + average);
		input.close();

	}

}
