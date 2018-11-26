package decisionMaking;
import java.util.Scanner;
public class AgeDecision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age;
Scanner input = new Scanner(System.in);
System.out.println("What is your age?");
age = input.nextInt();
if (age <= 17) {
	System.out.println("You are getting an A in this class");
}
System.out.println("Have a great day!");
input.close();
	}

}
