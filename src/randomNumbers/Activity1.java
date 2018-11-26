package randomNumbers;

import java.util.Random;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int min = 1;
		int max = 2;
		int randomNum = 0;
		int headcount = 0;
		int tailcount = 0;
		for (int i = 1; i <= 10000; i++) {

			randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum == 1) {
				headcount++;
			} else {
				tailcount++;
			}

		}
		System.out.println("The number of heads is " + headcount);
		System.out.println("The number of tails is " + tailcount);

	}

}
