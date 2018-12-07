package strings;

import java.util.Scanner;

public class ClassActivityOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double[] scores = new double[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter a test score");
			scores[i] = input.nextDouble();

		}
		double sum = 0;
		for (int i = 0; i < 5; i++) {
		sum += scores[i];
			
		}
		System.out.println("The sum is: " + sum);

		for (int i = 4; i >= 0; i--) {
			System.out.println(scores[i]);
		}

	}

}
