package inputExamples;
import java.util.Scanner;

public class Fortuneteller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double weight = 113.5;
int age = 17;
double dogsAge = 14;
Scanner input = new Scanner(System.in);
System.out.println("what is your weight?");
weight = input.nextDouble();
System.out.println("What is your age?" );
age = input.nextInt();
System.out.println("What is your dog's age?");
dogsAge = input.nextDouble();
System.out.println("In the future, I see that you will have " + age + " kids and " + dogsAge + " husbands" );
input.close();
	}

}
