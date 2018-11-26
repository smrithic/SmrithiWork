package decisionMaking;

import java.util.Scanner;

import objectOrientedProgramming.Circle;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		boolean quit = false;

		System.out.println("Please enter three radius values");

		Circle jeff = new Circle();
		jeff.setRadius(input.nextDouble());
		double perimeter1 = jeff.circumference();

		Circle bob = new Circle();
		bob.setRadius(input.nextDouble());
		double perimeter2 = bob.circumference();

		Circle fred = new Circle();
		fred.setRadius(input.nextDouble());
		double perimeter3 = fred.circumference();
		
		if (perimeter1 > perimeter2 && perimeter1 > perimeter3) {
			System.out.println(jeff.circumference());
		} else {
			if (perimeter2 > perimeter1 && perimeter2 > perimeter3) {
				System.out.println(bob.circumference());
			} else {
				if (perimeter3 > perimeter1 && perimeter3 > perimeter2) {
					System.out.println(fred.circumference());
				}
			}
		}
		do {
			System.out.println("Please enter three radius values");

			jeff.setRadius(input.nextDouble());
			jeff.circumference();

			bob.setRadius(input.nextDouble());
			bob.circumference();

			fred.setRadius(input.nextDouble());
			fred.circumference();

			if (perimeter1 > perimeter2 && perimeter1 > perimeter3) {
				System.out.println(jeff.circumference());
			} else {
				if (perimeter2 > perimeter1 && perimeter2 > perimeter3) {
					System.out.println(bob.circumference());
				} else {
					if (perimeter3 > perimeter1 && perimeter3 > perimeter2) {
						System.out.println(fred.circumference());
					}
				}
			}
			

			System.out.println("Would you like to quit?");
			input.nextBoolean();
		} while (quit == true);

		input.close();

	}

}
