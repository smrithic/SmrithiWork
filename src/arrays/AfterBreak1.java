package arrays;

import java.util.Random;

import objectOrientedProgramming.Circle;

public class AfterBreak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int sum = 0;
		int randomNum = 0;
		Circle [] shape = new Circle [5];
		for (int i = 0; i < shape.length; i++) {
			randomNum = 1 + generator.nextInt(10 - 5 + 1);
			Circle round = new Circle(randomNum);
			shape[i] = round;
			sum += shape[i].area();
		}
		System.out.println("The sum of the areas is:" + sum);

	}

}
