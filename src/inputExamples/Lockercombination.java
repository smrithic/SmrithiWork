package inputExamples;
import java.util.Scanner;

public class Lockercombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = 12;
int dadAge = 20;
int momAge = 19;
Scanner input = new Scanner(System.in);
System.out.println("how old are you?");
age = input.nextInt();
System.out.println("how old is your dad?");
dadAge = input.nextInt();
System.out.println("how old is your mom?");
momAge = input.nextInt();
System.out.println("your locker combination is " + age + " then " + dadAge + "and " + momAge + " at the end.");
	input.close();

	}

}
