package decisionMaking;

import java.util.Scanner;

public class YouWin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double money;
double square = Math.sqrt(84.3);
System.out.println("How much money did you get?");
money = input.nextDouble();
if(Math.abs(square-money) < 0.00000000001)
{
	System.out.println("You get a choclate bar");
} 
else 
{
	System.out.println("Go mow the lawn");
}
	}

}
