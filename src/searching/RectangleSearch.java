package searching;

import java.util.Random;

import objectOrientedProgramming.Rectangle;
import java.util.ArrayList;

public class RectangleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		ArrayList<Rectangle> shapes = new ArrayList<Rectangle>();
		int minL = 0;
		int maxL = 10;
		int minW = 0;
		int maxW = 10;
		int randomNumL = 0;
		int randomNumW = 0;
		int counter = 0;
		boolean contains = false;
		for (int i = 0; i < 100; i++) {
			randomNumL = minL + generator.nextInt(maxL - minL + 1);
			randomNumW = minW + generator.nextInt(maxW - minW + 1);
			shapes.add(new Rectangle(randomNumL, randomNumW));
		}
		
		randomNumL = minL + generator.nextInt(maxL - minL + 1);
		randomNumW = minW + generator.nextInt(maxW - minW + 1);
		for (int i= 0; i< shapes.size(); i++) {
			if (shapes.get(i).getWidth() == 10 ) {
				contains = true;
				counter++;
				break;
			}
		}
		System.out.println("Is " + 10 + " a width in a Rectangle object? " + contains + " it is contained in the array " + counter + " times");


	}

}
