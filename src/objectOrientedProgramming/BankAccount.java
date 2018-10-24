package objectOrientedProgramming;

public class BankAccount {
private double check;
private double save;
private double checkinterest;
private double saveinterest;

	public BankAccount() {
		
	}
	public double checkings(double check) {
		check = check - 1000;
		return check;
	}
	
	public double savings(double save) {
		save = save + 100;
		return save;
	}
	
	public double checkingsWithI(double check) {
		checkinterest = check * 1.18;
		return checkinterest;
	}
	
	public double savingsWithI(double save) {
		saveinterest = save * 1.15;
		return saveinterest;
	}
	
	public double financeCharge(double check) {
		check = check - 8;
		return check;
	}
	
	
}
