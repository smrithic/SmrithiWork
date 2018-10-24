package objectOrientedProgramming;
import java.util.Scanner;
public class BankTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner input = new Scanner(System.in);
	System.out.println("What is the amount in your checkings account?");
	double check;
	check = input.nextDouble();
	System.out.println("What is the amount in your savings account?");
	double save;
	save = input.nextDouble();
	BankAccount money = new BankAccount();
	System.out.println(money.checkings(check));
	System.out.println(money.checkingsWithI(check));
	System.out.println(money.savings(save));
	System.out.println(money.savingsWithI(save));
	System.out.println(money.financeCharge(check));
	

	}

}
