package decisionMaking;
import java.util.Scanner;
public class CuttingGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
final double RATE = 1/100;
final double RATE2 = 1.5/75;
boolean front;
System.out.println("You are cutting the front lawn");
front = input.nextBoolean();
if (front == true) {
	double length;
	double width;
	System.out.println("What is the length?");
	length = input.nextDouble();
	System.out.println("What is the width?");
	width = input.nextDouble();
	double yard;
	yard = length * width;
	double money;
	money = yard * RATE;
	System.out.println("You will earn " + money);
	
}
else {
	double radius;
	System.out.print("What is the radius of your backyard?");
	radius = input.nextDouble();
	double area;
	area = Math.PI * radius * radius;
	double back;
	back = area * RATE2;
	System.out.println("You will earn " + back);
}
	}

}
