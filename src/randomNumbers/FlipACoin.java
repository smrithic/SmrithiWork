package randomNumbers;

import java.util.Random;

public class FlipACoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int min = 1; // this is heads
		int max = 2; // this is tails
		int counter = 0;
		int randomNum = 0;
		int headcount = 0;
		int lowcount = 0;
		int highestHeads = 100000; // the max number of heads
		int lowestHeads = 0;

		for (int j = 1; j <= 1000; j++) {
			counter = 0;
			for (int i = 1; i <= 100000; i++) {
				randomNum = min + generator.nextInt(max - min + 1);
				if (randomNum == 1) {
					headcount++;
					lowcount++;
				}
			}
			if (headcount >= highestHeads) {
				highestHeads = headcount;
			}
			if (lowcount <= highestHeads && lowcount <= lowestHeads) {
				lowestHeads = headcount;
			}
		}
		int percentLow = (lowestHeads * 100)/100000;
		System.out.println("the lowest percentage of heads is " + percentLow);
		int percentHigh = (highestHeads * 100)/100000;
		System.out.println("the hightest percentage of heads is " + percentHigh);
	
	}

}
