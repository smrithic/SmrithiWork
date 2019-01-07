package arrays;

import java.util.Random;
import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int randomNum = 0;
		int households = 5;
		int residents = 0;
		double sum = 0;
		double counter = 0;
		double result = 0;
		double[] people = new double[households];
		for (int rows = 0; rows < people.length; rows++) {

			people[rows] = 1 + generator.nextInt(17 - 1 + 1);
		}

		for (int rows = 0; rows < people.length; rows++) {
			if (people[rows] % 2 == 0) {
				sum += people[rows];
				counter++;
			}
		}

		result = (sum / (counter *100)) * 100;
		System.out.println("The percentage of households with an even number of students is: " + result);

	}

}
