package searching;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class DoubleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> nums = new ArrayList<Double>();
		Random generator = new Random();
		Scanner input = new Scanner(System.in);
		int min = 0;
		int max = 5;
		double randomNum;
		int counter = 0;
		//going through and adding the random numbers to the array list
		for (int i = 0; i < 1000; i++) {
			randomNum = min + generator.nextInt(max - min + 1);
			nums.add(randomNum);
		}
		randomNum = min + generator.nextInt(max - min + 1);
		boolean contains = false;
		
		System.out.println("Please enter a double value");
		double temp = input.nextDouble();
		
		//going through each of the numbers in the array list
		//to see if the user's number is in there
		for(int i = 0; i<nums.size(); i++) {
			if(nums.get(i) == temp) {
				contains = true;
				counter++;
			}
		}
		System.out.println("Is " + temp + " in the Array? " + contains + " it is contained in the array " + counter + " times");

	}
}
