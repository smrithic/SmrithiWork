package randomNumbers;
import java.util.Random;
public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random(8);
		int min = 26;
		int max = 43;
		int randomNum = 0;
		int headcount = 0;
		int tailcount = 0;
		for (int i = 1; i <= 248; i++) {

			randomNum = min + generator.nextInt(max - min + 1);
			if (randomNum > 36) {
				headcount++;
			} else {
				tailcount++;
			}

		}
		System.out.println("The number of first graders more than three feet is " + headcount);
		
	}

}
