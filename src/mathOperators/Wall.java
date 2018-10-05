package mathOperators;

import java.util.Scanner;

public class Wall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length = 8.0;
		double width = 0.0;
		double area = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the width of the wall?");
		width = input.nextDouble();
		area = length * width;
		System.out.println("the area of the wall is " + area);
		input.close();

	}

}
