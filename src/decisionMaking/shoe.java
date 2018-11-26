package decisionMaking;
import java.util.Scanner;
public class shoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double height;
double length;
System.out.println("What is your height in inches?");
height = input.nextDouble();
System.out.println("What is your shoe size?");
length = input.nextDouble();
System.out.println(height + length >= 26);
System.out.println(height < 62 && height > 9);
	}

}
