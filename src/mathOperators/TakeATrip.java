package mathOperators;

import java.util.Scanner;

public class TakeATrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double distanceOfTrip = 0.0;
		double fuelEconomy = 0.0;
		double moneyOnGas = 0.0;
		double gallonsUsed = 0.0;
		double costPerGallon = 0.0;
		Scanner input = new Scanner(System.in);
		System.out.println("How many miles did you travel?");
		distanceOfTrip = input.nextDouble();
		System.out.println("What is the fuel economy?");
		fuelEconomy = input.nextDouble();
		System.out.println("how much did you spend on gas?");
		moneyOnGas = input.nextDouble();
		gallonsUsed = distanceOfTrip / fuelEconomy;
		costPerGallon = moneyOnGas / gallonsUsed;
		System.out.println("the cost per gallon of the trip was " + costPerGallon);
		input.close();

	}

}
