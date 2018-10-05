package mathOperators;

import java.util.Scanner;

public class BussesAndVans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfPeople = 0;
		int numberOfBusses = 0;
		int peopleLeftOver = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("How many people are there?");
		numberOfPeople = input.nextInt();
		numberOfBusses = numberOfPeople / 35;
		peopleLeftOver = numberOfPeople % 35;
		System.out.println("There are " + numberOfPeople + " people in the group");
		System.out.println("Order " + numberOfBusses + " busses");
		System.out.println("There will be " + peopleLeftOver + " people going in the vans");
		input.close();

	}

}
