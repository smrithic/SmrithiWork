package inputExamples;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int favoriteWholeNumber = 5;
int houseNumber = 14328;
int numberOfPets = 5;
Scanner input = new Scanner(System.in);
System.out.println("What is your favorite whole number?");
		favoriteWholeNumber = input.nextInt();
		System.out.println("What is your house number?");
		houseNumber = input.nextInt();
		System.out.println("How many pets do you have?");
		numberOfPets = input.nextInt();
		System.out.println("your password is " + favoriteWholeNumber + houseNumber + numberOfPets);
		input.close();
	
	}

}
