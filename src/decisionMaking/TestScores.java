package decisionMaking;
import java.util.Scanner;
public class TestScores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double testScore = 0.0;
double test1;
double test2;
double test3;
double sum;
double average;
while (testScore != 9999) {
	System.out.println("What are your three passing test scores?");
	test1 = input.nextDouble();
	test2 = input.nextDouble();
	test3 = input.nextDouble();
	sum = test1 + test2 + test3;
	average = sum/3;
	System.out.println("Your test score sum is " + sum + " and your average is " + average);
}
	}

}
