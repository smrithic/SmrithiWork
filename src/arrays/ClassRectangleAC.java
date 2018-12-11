package arrays;

import java.util.Random;
import java.util.Scanner;

import objectOrientedProgramming.Rectangle;

public class ClassRectangleAC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		Rectangle [] boxes = new Rectangle[5];
		int minLength = 10;
		int maxLength = 56;
		int minWidth = 10;
		int maxWidth = 56;
		int randomLength;
		int randomWidth;
		Random generator = new Random();
		randomLength = minLength + generator.nextInt(maxLength - minLength + 1);
		randomWidth = minWidth + generator.nextInt(maxWidth - minWidth + 1);
		System.out.println("The length is: " + randomLength);
		System.out.println("The width is: " + randomWidth);
		


	}

}
