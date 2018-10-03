package mathOperators;

import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int phoneNumber = 0;
		int areaCode = 0;
		int middleThree = 0;
		int lastFour = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your phone number with no dashes?");
		phoneNumber = input.nextInt();
		areaCode = phoneNumber / 10000000;
		middleThree = (phoneNumber / 10000) % 1000;
		lastFour = phoneNumber % 10000;
		System.out.println("Your phone number is " + phoneNumber);
		System.out.println("Your area code is " + areaCode);
		System.out.println("Your middle three numbers are " + middleThree);
		System.out.println("Your last four digits are " + lastFour);
		input.close();

	}

}
