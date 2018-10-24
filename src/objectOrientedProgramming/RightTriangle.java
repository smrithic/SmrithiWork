package objectOrientedProgramming;

public class RightTriangle {
	private double base;
	private double height;

	public RightTriangle() {
	}

	public RightTriangle(double newB, double newH) {
		base = newB;
		height = newH;
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
		double perimeter;
		perimeter = base + height + hypote();
		return perimeter;
	}

	public double area() {
		double area;
		area = (base * height) * 0.5;
		return area;
	}

}
