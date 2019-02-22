package searching;
import java.util.Random;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		int randomNum = 0;
		int [] scores = new int [10];
		int min = 0;
		int max = 5;
		int counter=0;

		for (int i = 0; i < scores.length; i++) {
			randomNum = min + generator.nextInt(max - min + 1);
			scores[i] = randomNum;
		}
		randomNum = min + generator.nextInt(max - min + 1);
		boolean  contains = false;
		for (int temp : scores) {
			if (temp == randomNum) {
				contains = true;
				counter++;
				break;
			}
		}
		System.out.println("Is " + randomNum + " in the Array? " + contains + " it is contained in the array " + counter + " times");

	}

}
