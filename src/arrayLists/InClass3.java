package arrayLists;

import java.util.ArrayList;
import java.util.Random;
import objectOrientedProgramming.Rectangle;

public class InClass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int randomNum = 0;
		ArrayList<Rectangle> shape = new ArrayList<Rectangle>();
		Rectangle square = new Rectangle();
		for (int i = 0; i < 400; i++) {
			randomNum = 1 + generator.nextInt(70 - 50 + 1);
			shape.add(new Rectangle(randomNum, randomNum));
		}

		for (int i = shape.size() - 1; i >= 0; i--) {
			square = shape.get(i);
			System.out.println("areas in reverse: " + square.area());

		}
	}

}
