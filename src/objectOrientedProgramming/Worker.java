package objectOrientedProgramming;

public class Worker {
private double hours = 0.0;
private double rate = 0.0;


public Worker() {
	hours = 4.5;
	rate = 6.9;
}
public Worker(double hourss, double ratee) {
	hourss = 9.0;
	ratee = 0.56;
}
	public double getHours() {
		return hours;
	}
	public double getRate() {
		return rate;
	}
	public double getPayCheck() {
		double payCheck = hours * rate;
		return payCheck;
	}
	public void changeRate(double newRaise) {
		rate = rate + newRaise;
	}
	
}
