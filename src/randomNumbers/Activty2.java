package randomNumbers;
import java.util.Random;
public class Activty2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Random generator = new Random();
int min = 1;
int max = 13;
int randomNum = 0;
int headcount = 0;
int tailcount = 0;
for (int i = 1; i <= 87; i++) {

	randomNum = min + generator.nextInt(max - min + 1);
	if (randomNum % 3 ==0) {
		headcount++;
	} else {
		tailcount++;
	}

}
System.out.println("The number of multiple of 3's is " + headcount);
System.out.println("The number of other numbers rolled is " + tailcount);
	}

}
