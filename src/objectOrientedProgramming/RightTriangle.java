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
	public void setBase(double baseNew) {
		base = baseNew;
	}
	public void setHeight(double heightNew) {
		height = heightNew;
	}

	public double hypote1() {
		double hypote = 0.0;
		double squared = 0.0;
		squared = (base * base) + (height * height);
		hypote = Math.sqrt(squared);
		return hypote;

	}
	
	public void setHypote (double hypoteNew) {
		double hypote = hypoteNew;
	}

	public double perimeter() {
		double perimeter;
		perimeter = base + height + hypote1();
		return perimeter;
	}

	public double area() {
		double area;
		area = (base * height) * 0.5;
		return area;
	}

}
