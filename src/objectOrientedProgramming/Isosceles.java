package objectOrientedProgramming;

public class Isosceles {
	private double base1;
	private double base2;
	private double height;
	private double leg;

	public Isosceles() {
		
	}
	
	public Isosceles(double newB1, double newB2, double newH, double newL) {
		base1 = newB1;
		base2 = newB2;
		height = newH;
		leg = newL;
	}
	public double base1() {
		return base1;
	}
	public double base2() {
		return base2;
	}
	public double height() {
		return height;
	}
	public double leg() {
		return leg;
	}
	public double perimeter() {
		double perimeter = 0.0;
		perimeter = leg + base1 + base2 + height;
		return perimeter;
		
	}
	public double area() {
		double area = 0.0;
		area = ((base1 + base2)*height)/2;
		return area;
	}
	

}
