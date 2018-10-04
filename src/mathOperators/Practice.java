package mathOperators;

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int songs = 0;
		double length = 0;
		int averageMin = 0;
		int averageSec = 0;
		System.out.println("How many songs are there?");
		songs = input.nextInt();
		System.out.println("What is the length of all the songs in minutes and seconds?");
		length = input.nextDouble();
		length = length * 60;
		averageMin = (int) (length / songs)/60;
		averageSec = (int) (length % songs)/60;
		System.out.println("The average song length is " + averageMin + " minutes and " + averageSec + " seconds");
		input.close();

	}

}
