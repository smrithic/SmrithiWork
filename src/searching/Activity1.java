package searching;

import java.util.ArrayList;
import java.util.Random;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> scores = new ArrayList<Integer>();
		Random generator = new Random();
		int min = 400;
		int max = 1600;
		int randomNum = 0;

		for (int i = 0; i < 1000; i++) {
			scores.add(min + generator.nextInt(max - min + 1));
		}
		randomNum = min + generator.nextInt(max - min + 1);
		boolean  contains = false;
		for (int temp : scores) {
			if (temp == randomNum) {
				contains = true;
				break;
			}
		}
		System.out.println("Is " + randomNum + " in the ArrayList? " + contains);

	}
}
