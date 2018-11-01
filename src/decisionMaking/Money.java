package decisionMaking;
import java.util.Scanner;
public class Money {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int age;
int gpa;
System.out.println("What is your age?");
age = input.nextInt();
System.out.println("What is your gpa?");
gpa = input.nextInt();
if (age+gpa > 20) {
	System.out.println("You will receive $250");
}
else {
System.out.println("You will receive $30");
}

	}

}
