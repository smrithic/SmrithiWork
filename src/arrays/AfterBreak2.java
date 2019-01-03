package arrays;

import java.util.Random;

import objectOrientedProgramming.Rectangle;

public class AfterBreak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		Rectangle[][] box = new Rectangle[2][3];
		int sum = 0;
		int randomNum = 0;
		for (int rows = 0; rows < box.length; rows++) {
			for (int columns = 0; columns < box[0].length; columns++) {
				randomNum = 1 + generator.nextInt(10 - 5 + 1);
				Rectangle shape = new Rectangle(randomNum, randomNum);
				box[rows][columns]= shape;
				sum += box[rows][columns].perimeter();
			}
		}
		System.out.println("The sum of the perimeters is: " + sum);
	}

}
