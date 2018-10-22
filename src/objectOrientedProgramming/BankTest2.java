package objectOrientedProgramming;

import java.util.Scanner;

public class BankTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		BankAccount2 bob = new BankAccount2(5000, 123456, 1.15, 45);
		System.out.println("What is your balance?");
		double balance;
		balance = input.nextDouble();
		System.out.println("What is your six digit account number?");
		int account;
		account = input.nextInt();
		System.out.println("What is the interest rate?");
		double interest;
		interest = input.nextDouble();
		System.out.println(bob.withdrawBalance());
		System.out.println(bob.depositBalance());
		System.out.println(bob.interestBalance());
		System.out.println(bob.financeCharge());
	}

}
