package inputExamples;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int favoriteWholeNumber = 5;
int age = 2;
int numberOfPets = 5;
Scanner input = new Scanner(System.in);
System.out.println("What is your favorite whole number?");
		favoriteWholeNumber = input.nextInt();
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("How many pets do you have?");
		numberOfPets = input.nextInt();
		System.out.println("your password is " + favoriteWholeNumber + age + numberOfPets);
		input.close();
	
	}

}
