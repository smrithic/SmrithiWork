package mathOperators;

import java.util.Scanner;

public class CuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length = 0.0;
		double width = 0.0;
		double radius = 0.0;
		double areaTotal = 0.0;
		double areaFountain = 0.0;
		double areaLawn = 0.0;
		double amountEarned = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the lawn in yards?");
		length = input.nextDouble();
		System.out.println("What is the width of the lawn in yards?");
		width = input.nextDouble();
		System.out.println("What is the radius of the fountain in feet?");
		radius = input.nextDouble();
		areaTotal = (length * width) / 3;
		areaFountain = (Math.PI * radius * radius);
		areaLawn = areaTotal - areaFountain;
		amountEarned = areaLawn / 100 * 1.25;
		System.out.println("The amount owed for cutting the lawn is " + amountEarned);
		input.close();
	}

}
