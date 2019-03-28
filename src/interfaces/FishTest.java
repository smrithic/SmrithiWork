package interfaces;

import java.util.ArrayList;

public class FishTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double oldest = 0;
		double longest = 0;
		String color = "";
		double numScales = 0;
		String fishinfo = "";
		ArrayList<Fish> sea = new ArrayList<Fish>();
		Trout fish = new Trout(2, 3, 6);
		Goldfish fish2 = new Goldfish(5, 6, "pink");
		sea.add(fish);
		sea.add(fish2);

		for (Fish f : sea) {
			if (f.getLength() > longest) {
				longest = f.getLength();
				fishinfo = f.toString();
			}
		}
		System.out.println("Longest Fish info: " + fishinfo);
		
		for (Fish g : sea) {
			if (g instanceof Goldfish) {
				Goldfish fish3 = (Goldfish) g;
				if (fish3.getLength() > longest) {
					longest = fish3.getLength();
					color = fish3.getColor();
				}
			}

		}
		System.out.println("Color of longest goldfish: " + color);

		for (Fish t : sea) {
			if (t instanceof Trout) {
				Trout fish4 = (Trout) t;
				if (fish4.getAge() > oldest) {
					oldest = fish4.getAge();
					numScales = fish4.getScales();
				}
			}
		}
		System.out.println("number of scales on oldest fish: " + numScales);

	}

}
