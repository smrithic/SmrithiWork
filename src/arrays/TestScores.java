package arrays;

import java.util.Scanner;

public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double testScore = 0.0;
		double highest = 0;
		double lowest = 100;
		double sum = 0;
		int counter = 0;
		
		//asking for the test scores
		double[] scores = new double[3];
		for (int i = 0; i < scores.length; i++) {
			System.out.println("Please enter a test score");
			scores[i] = input.nextDouble();
			
			
			//adding the next test scores to the sum
			sum += testScore;
			
			//adding the number of test scores entered
			counter++;
			
		}
		if (testScore > highest) {
			testScore = highest;
		}
		if (testScore < lowest) {
			testScore = lowest;
			}
		System.out.println("The highest test score: " + highest);
		System.out.println("The lowest test score: " + lowest);
		
		//finding the average and displaying it
		System.out.println("The average is " + sum / counter);
		
		//displaying all the test scores
		for (int i = 0; i < scores.length; i++) {
			System.out.println("The test scores: " + scores[i]);
		}

	}

}
