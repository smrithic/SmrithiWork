package arrays;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double [] scores = new double[10];
//prompt the user for 5 test scores
		for (int i = 0; i < 10; i++) {
			System.out.println("Please enter a test score");
			scores[i] = input.nextDouble();
		}
		for (int i = scores.length - 1; i>= 0; i--) {
		System.out.println("The scores in reverse order are: " + scores[i]);
		}
	}

}
