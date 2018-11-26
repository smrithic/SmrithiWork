package decisionMaking;
import java.util.Scanner;
public class CashRegister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
double cost = 0.0;
int items = 0;
int i = 1;
double price = 0.0;
final double TAX = 1.05;
int totalItems = 0;
double totalCost= 0.0;
double costTax = 0.0;

System.out.println("How many items are there?");
items = input.nextInt();


for (i=1; i <= items; i++)
{
	System.out.println("What is the price of each item?");
	price = input.nextDouble();
	totalItems += items;
	totalCost += price;
	cost = totalCost;
	costTax = cost * TAX;
}
System.out.println("The total cost is " + cost + " the tax is " + TAX + " and the cost including tax is " + costTax);
input.close();

	}

}
