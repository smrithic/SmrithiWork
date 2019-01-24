package arrayLists;

import java.util.ArrayList;
import java.util.Random;

import objectOrientedProgramming.Rectangle;

public class RectangleArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int randomNum = 0;
		int maxArea = 0;
		ArrayList<Rectangle> shape = new ArrayList<Rectangle>();
		Rectangle square = new Rectangle();

		for (int i = 0; i < 20; i++) {
			randomNum = 1 + generator.nextInt(50 - 1 + 1);
			shape.add(new Rectangle(randomNum, randomNum));
		}
		square = shape.remove(shape.size() - 1);
		shape.set(0, square);


	}

}
