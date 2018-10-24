package objectOrientedProgramming;
import java.util.Scanner;
public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Phone bob = new Phone(1234567890, 1324756897, 1523745847, 19, 10.0);
		System.out.println("What is your phone number?");
		int phoneNumber;
		phoneNumber = input.nextInt();
		System.out.println("What is your speed dial?");
		int speedDial;
		speedDial = input.nextInt();
		System.out.println("What number did you call last?");
		int lastNumber;
		lastNumber = input.nextInt();
	}

}
