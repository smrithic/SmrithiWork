package decisionMaking;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
double test1;
double test2;
double test3;
boolean ec;
System.out.println("What is your score for test 1?");
test1 = input.nextDouble();
System.out.println("What is your score for test 2?");
test2 = input.nextDouble();
System.out.println("What is your score for test 3?");
test3 = input.nextDouble();
System.out.println("You did the extra credit");
ec = input.nextBoolean();
if (ec == true) {
	int points;
	double average;
	System.out.println("How many points of extra credit did you earn?");
	points = input.nextInt();
	average = ((test1 + test2 + test3 + points)/3);
	System.out.println("Your average is " + average);
}
else {
	double average2;

average2 = ((test1 + test2 + test3)/3);
System.out.println("Your average is " + average2);
input.close();
}

	}

}
