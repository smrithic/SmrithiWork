package decisionMaking;
import java.util.Scanner;
public class ageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = 0;
Scanner input = new Scanner(System.in);
System.out.println("What is your age?");
age = input.nextInt();
System.out.println(age==16);
if(age >= 18)
{
	System.out.println("You will be charged as an adult");
}
System.out.println("Have a nice day");

int number;
System.out.println("What is your guess for the number?");
number = input.nextInt();
if(number == 16)
{
	System.out.println("You won a singular dollar!");
}
System.out.println("good guess but WRONG");
	}

}
