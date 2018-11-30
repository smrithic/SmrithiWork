package strings;
import java.util.Scanner;
public class ClassActivityStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
System.out.println("Please enter your age");
int age = input.nextInt();
System.out.println("Please enter your full name");
input.nextLine();
String fullName = input.nextLine();
System.out.println("the age is " + age);
	}

}
