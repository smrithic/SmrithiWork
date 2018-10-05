package mathOperators;

import java.util.Scanner;

public class SpeedingTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int speedLimit = 0;
		int driverSpeed = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What was the speed limit?");
		speedLimit = input.nextInt();
		System.out.println("What was your speed?");
		driverSpeed = input.nextInt();
		int additionalMiles = driverSpeed - speedLimit - 1;
		int fine = 55 + 40 * (additionalMiles);
		System.out.println("your fine is " + fine);
		input.close();
	}

}
