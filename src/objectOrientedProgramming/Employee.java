package objectOrientedProgramming;

public class Employee {
	private double wage;
	private int experience;
	private double raise;

	public Employee() {
		wage = 10.5;
		experience = 4;
		raise = 15;
	}

	public double getRaise() {
		return raise;
	}

	public double getWage() {
		return wage;

	}

	public int getExperience() {
		return experience;
	}

	public void setRaise() {
		wage = wage*1.1;
	}

	public void setExperience(int newE) {
		experience = newE;
	}

	public void setWage(double newW) {
		wage = newW;
	}

}
