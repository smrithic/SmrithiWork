package comparableinterfaces;

import java.util.ArrayList;
import java.util.Random;

public class CatTestForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CatStart> cat = new ArrayList<CatStart>();
		Random gen = new Random();
		int randomNum = 0;
		CatStart smallest;
		CatStart largest;
		for (int i = 0; i < 100; i++) {
			randomNum = gen.nextInt(200);
			cat.add(new CatStart(randomNum, randomNum));
		}
		smallest = cat.get(0);
		largest = cat.get(0);
		for (CatStart temp : cat) {
			if (smallest.compareTo(temp) > 0) {
				smallest = temp;
			}
		}

		for (CatStart temp : cat) {
			if (largest.compareTo(temp) < 0) {
				largest = temp;
			}
		}

		System.out.println("the smallest cat age is " + smallest.getAge() + " and the largest cat age is " + largest.getAge());
	}

}
