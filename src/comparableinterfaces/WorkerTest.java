package comparableinterfaces;

import java.util.Random;

public class WorkerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		int randomNum = 0;
		WorkerStart smallest;
		WorkerStart largest;
		WorkerStart[] people = new WorkerStart[100];
		for (int i = 0; i < 100; i++) {
			randomNum = gen.nextInt(10);
			people[i] = new WorkerStart(randomNum, randomNum);
		}
		smallest = people[0];
		for (int i = 1; i < people.length; i++) {
			// if the smallest number is less than the next object, it returns a negative
			if (smallest.compareTo(people[i]) < 0) {
				smallest = people[i];
			}
		}
		largest = people[0];
		for (int i = 0; i < people.length - 1; i++) {
			if (largest.compareTo(people[i]) > 0) {
				largest = people[i];
			}
		}
		
		System.out.println("the smalles object's rate is " + smallest.getRate() + " and the largest's rate is " + largest.getRate());

	}

}
