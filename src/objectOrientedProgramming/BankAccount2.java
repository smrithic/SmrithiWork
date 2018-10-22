package objectOrientedProgramming;

public class BankAccount2 {
	private double balance;
	private int accountNum;
	private double interest;
	private double financeCharge;

	public BankAccount2() {

	}

	public BankAccount2(double newB, int newA, double newI, double newF) {
		balance = newB;
		accountNum = newA;
		interest = newI;
		financeCharge = newF;
	}

	public double balance(double newB) {
		return balance;
	}

	public int accountNumber(double newA) {
		return accountNum;
	}

	public double interest(double newI) {
		return interest;
	}

	public double depositBalance() {
		balance = balance + 200;
		return balance;
	}

	public double withdrawBalance() {
		balance = balance - 400;
		return balance;
	}

	public double interestBalance() {
		balance = balance * interest;
		return balance;
	}

	public double financeCharge() {
		balance = balance - financeCharge;
		return balance;
	}
}
