package mathOperators;

import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double phoneNumber = 0;
		double areaCode = 0;
		double middleThree = 0;
		double lastFour = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your phone number with no dashes?");
		phoneNumber = input.nextDouble();
		areaCode =  Math.round((phoneNumber / 10000000)-0.5);
		middleThree = Math.round((phoneNumber / 10000 % 1000)-0.5);
		lastFour = Math.round((phoneNumber % 10000)-0.5);
		System.out.println("Your phone number is " + Math.round(phoneNumber));
		System.out.println("Your area code is " + Math.round(areaCode));
		System.out.println("Your middle three numbers are " + Math.round(middleThree ));
		System.out.println("Your last four digits are " + Math.round(lastFour ));
		input.close();

	}

}
