package decisionMaking;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double height;
		double weight;
		double luckyNum;
		int age;
		System.out.println("What is your age?");
		age = input.nextInt();
		if (age >= 18) {
			System.out.println("What is your height?");
			height = input.nextDouble();
			luckyNum = height * 5;
			System.out.println("Your lucky number is " + luckyNum);
		} else {
			System.out.println("What is your weight?");
			weight = input.nextDouble();
			luckyNum = weight / 2;
			System.out.println("Your lucky number is " + luckyNum);
		}
		System.out.println("Have a good day");
	}

}
