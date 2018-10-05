package mathOperators;

import java.util.Scanner;

public class AreaofaCirlce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius = 0.0;
		final double PI = 3.14;
		double area = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius of the circle?");
		radius = input.nextDouble();
		area = radius * radius * PI;
		System.out.println("The area of the circle is " + area);
		input.close();

	}

}
