package arrays;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double [] scores = new double[5];
//prompt the user for 5 test scores
		for (int i = 0; i < 5; i++) {
			System.out.println("Please enter a test score");
			scores[i] = input.nextDouble();
		}
		
	}

}
