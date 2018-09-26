package inputExamples;
import java.util.Scanner;

public class Ageandweight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = 17;
int weight = 105;
Scanner input = new Scanner(System.in);
System.out.println("What is your age and weight?");
age = input.nextInt();
weight = input.nextInt();
System.out.println("I am " + age + " years old and weigh " + weight + " pounds");
input.close();
	}

}
