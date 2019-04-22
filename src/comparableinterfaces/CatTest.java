package comparableinterfaces;

import java.util.Random;
import java.util.ArrayList;

public class CatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<CatStart> cat = new ArrayList<CatStart>();
		Random gen = new Random();
		CatStart smallest;
		CatStart largest;
		for (int i = 0; i < 100; i++) {
			cat.add(new CatStart(gen.nextInt(200), gen.nextInt(200)));
		}
		smallest = cat.get(0);
		largest = cat.get(0);
		for (int i = 0; i < cat.size(); i++) {
			if (smallest.compareTo(cat.get(i)) > 0) {
				smallest = cat.get(i);
			}
		}
		for (int i = 0; i < cat.size(); i++) {
			if (largest.compareTo(cat.get(i)) < 0) {
				largest = cat.get(i);
			}
		}
		
		System.out.println("the smallest cat age is " + smallest.getAge() + " and the largest cat age is " + largest.getAge());
	}

}
