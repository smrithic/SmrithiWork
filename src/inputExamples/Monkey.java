package inputExamples;

import java.util.Scanner;

public class Monkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double height = 35.7;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the height of the monkey");
		height = input.nextDouble();
		System.out.println("The height of a monkey is " + height);
	}

}
