package objectOrientedProgramming;

public class Numbers {

	public void sayNumber(double num) {
	}

	public Numbers() {
	}

	public void sayNumber(int num) {
		System.out.println(num);
	}

	public void sayNumberPlus2(double num) {
		System.out.println(num + 2);
	}

	public void saySum(double numone, double numtwo) {
		double sum = numone + numtwo;
		System.out.println(sum);
	}

	public double returnSquare(double nums1) {
		double value = nums1 * nums1;
		System.out.println(value);
		return value;
	}

	public double returnArea(double le, double wi) {
		double area = le * wi;
		System.out.println(area);
		return area;
	}

	public double returnRoundUp(double number) {
		double round = (int)(number + 1);
		System.out.println(round);
		return round;
	}
}
