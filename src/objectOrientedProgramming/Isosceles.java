package objectOrientedProgramming;

public class Isosceles {
	private double base1 = 0.0;
	private double base2 = 0.0;
	private double height = 0.0;
	private double leg = 0.0;

	public Isosceles() {
		base1 = 4.0;
		base2 = 3.0;
		height = 5.0;
		leg = 7.0;
	}
	
	public Isosceles(double newB1, double newB2, double newH, double newL) {
		newB1 = 5.0;
		newB2 = 4.0;
		newH = 6.0;
		newL = 9.0;
	}
	
	public double perimeter() {
		double perimeter = 0.0;
		perimeter = leg + leg + base1;
		return perimeter;
		
	}
	public double area() {
		double area = 0.0;
		area = base1 * height * 0.5;
		return area;
	}
	

}
