package objectOrientedProgramming;

public class Cat {
	private double age = 0;
	private double sleep = 0.0;

	public Cat() {
		age = 5;
		sleep = 8.9;
	}

	public double getAge() {
		return age;
	}

	public double getSleep() {
		return sleep;
	}

	public void changeBirthday(double birthday) {
		age = birthday;
	}

	public void sleepMore(double more) {
		sleep = sleep++;
	}

	public void sleepLess(double less) {
		sleep = sleep--;
	}

}
