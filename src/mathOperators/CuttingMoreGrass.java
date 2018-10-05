package mathOperators;

import java.util.Scanner;

public class CuttingMoreGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double length = 0;
		double width = 0;
		double widthMower = 0;
		double speedMower = 0;
		final double RATE = 12;
		double amountTime = 0;
		double amountMoney = 0;
		double numberPasses = 0;
		double distance = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the lawn in feet?");
		length = input.nextDouble();
		System.out.println("What is the width of the lawn in feet?");
		width = input.nextDouble();
		System.out.println("What is the width of the mower deck in inches?");
		widthMower = input.nextDouble();
		System.out.println("What is the speed of the mower in miles per hour?");
		speedMower = input.nextDouble();
		speedMower = speedMower/5280;
		widthMower = widthMower/12;
		numberPasses = Math.round((width/widthMower)+0.5);
		distance = numberPasses * length;
		amountTime = ((distance/speedMower)/5280);
		amountMoney = (amountTime - 1) * RATE;
		System.out.println(" It will take " + amountTime + " hours to cut the lawn and will cost " + amountMoney + " dollars ");
		input.close();
	}

}
