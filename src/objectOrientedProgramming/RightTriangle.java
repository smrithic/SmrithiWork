package objectOrientedProgramming;

public class RightTriangle {
	private double base = 0.0;
	private double height = 0.0;

	public RightTriangle() {
		base = 8.0;
		height = 3.0;
	}

	public RightTriangle(double newB, double newH) {
		base = 4.0;
		height = 8.0;
	}
	public double base() {
		return base;
	}
	public double height() {
		return height;
	}

	public double hypote() {
		double hypote = 0.0;
		double squared = 0.0;
		squared = (base * base) + (height * height);
		hypote = Math.sqrt(squared);
		return hypote;

	}

	public double perimeter() {
		double perimeter = 0.0;
		perimeter = base + height + hypote();
		return perimeter;
	}
	public double area() {
		double area = 0.0;
		area = (base * height) *0.5;
		return area;
	}

}
