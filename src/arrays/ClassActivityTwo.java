package arrays;

import java.util.Scanner;

public class ClassActivityTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		final int maxStudents = 5;
		double highestTest = 0;
		double[] scores = new double[maxStudents];
		
		for (int i = 0; i < scores.length; i++) {
			System.out.println("Enter a test score");
			scores[i] = input.nextDouble();
			if (highestTest < scores[i]) {
				highestTest = scores[i];
			}
		}
		System.out.println("The largest score is " + highestTest);

	}

}
