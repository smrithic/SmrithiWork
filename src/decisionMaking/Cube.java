package decisionMaking;
import java.util.Scanner;
public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
int number = 0;
int cube = 0;
while (number != -1) {
	System.out.println("What is your number?");
	number = input.nextInt();
	cube = number * number * number;
	System.out.println("The cube is " + cube);
}
	}

}
