package decisionMaking;

import java.util.Scanner;

import objectOrientedProgramming.RightTriangle;

public class TriangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean quit = false;

		System.out.println("Please enter three side length values for triangle one");

		RightTriangle jeff = new RightTriangle();
		jeff.setBase(input.nextDouble());
		jeff.setHeight(input.nextDouble());
		jeff.setHypote(input.nextDouble());
		double area1 = jeff.area();
		
		System.out.println("Please enter three side length values for triangle two");
		
		RightTriangle bob = new RightTriangle();
		bob.setBase(input.nextDouble());
		bob.setHeight(input.nextDouble());
		bob.setHypote(input.nextDouble());
		double area2 = bob.area();

		if (area1 > area2) {
			System.out.println(jeff.area());
		} else {
			if (area2 > area1) {
				System.out.println(bob.area());
			}
		}

		do {
			System.out.println("Please enter three side length values for triangle one");

			jeff.setBase(input.nextDouble());
			jeff.setHeight(input.nextDouble());
			jeff.setHypote(input.nextDouble());
			jeff.area();
			
			System.out.println("Please enter three side length values for triangle two");

			bob.setBase(input.nextDouble());
			bob.setHeight(input.nextDouble());
			bob.setHypote(input.nextDouble());
			bob.area();

			if (area1 > area2) {
				System.out.println(jeff.area());
			} else {
				if (area2 > area1) {
					System.out.println(bob.area());
				}
			}
			System.out.println("Would you like to quit?");
			input.nextBoolean();
		} while (quit == true);

		input.close();

	}

}
