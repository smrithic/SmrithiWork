package inheritance;

public class Quadrilateral {
	private double side1;
	private double side2;
	private double side3;
	private double side4;
	double perimeter;

	public Quadrilateral() {
		side1 = 2;
		side2 = 3;
		side3 = 2;
		side4 = 3;
	}

	public Quadrilateral(double s1, double s2, double s3, double s4) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
		side4 = s4;
	}

	public void setside1(double s1) {
		side1 = s1;
	}

	public double getside1() {
		return side1;
	}

	public void setside2(double s2) {
		side2 = s2;
	}

	public double getside2() {
		return side2;
	}

	public void setside3(double s3) {
		side3 = s3;
	}

	public double getside3() {
		return side3;
	}

	public void setside4(double s4) {
		side4 = s4;
	}

	public double getside4() {
		return side4;
	}

	public double perimeter() {
		perimeter = side1 + side2 + side3 + side4;
		return perimeter;
	}
	public String toString() {
		return "Type: Quadrilateral, side 1: " + side1 + ", side 2: " + side2 + ", side 3: " + side3 + ", side 4: " + side4;
	}

}
