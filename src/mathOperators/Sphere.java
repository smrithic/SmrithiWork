package mathOperators;

import java.util.Scanner;

public class Sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double radius = 0.0;
		Double area = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius of the sphere?");
		radius = input.nextDouble();
		area = radius * radius * radius * 4 * Math.PI / 3;
		System.out.println("The volume of the sphere is " + area);
		input.close();
	}

}
