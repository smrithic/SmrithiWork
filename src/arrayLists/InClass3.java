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

		for (int i = 0; i < 5; i++) {
			randomNum = 1 + generator.nextInt(70 - 50 + 1);
			shape.add(new Rectangle(randomNum, randomNum));
		}
		square = shape.remove(shape.size() - 1);
		shape.add(0, square);

		for (int i = 0; i < shape.size(); i++) {
			System.out.println(shape.get(i).area());
		}

	}

}
