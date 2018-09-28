package mathOperators;

import java.util.Scanner;

public class Longdivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dividend = 0;
		int divisor = 0;
		int longDivision = 0;
		int remainder = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the dividend?");
		dividend = input.nextInt();
		System.out.println("What is the divisor?");
		divisor = input.nextInt();
		longDivision = dividend / divisor;
		remainder = dividend % divisor;
		System.out.println("The result is " + longDivision + "R" + remainder);
		input.close();
	}

}
