package objectOrientedProgramming;

public class Rectangle {
	private double length = 0.0;
	private double width = 0.0;
	private double perimeter = 0.0;
	private double area = 0.0;

	public Rectangle() {
		length = 4.5;
		width = 3.5;
		area=15.75;
		perimeter=16;
	}
	public Rectangle (double newLe, double newWi) {
		length = 9.0;
		width = 8.0;	
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}
	public double getPerimeter() {
		return perimeter;
	}
	public double getArea() {
		return area;
	}
	public void changeLength(double newL) {
		length = newL;
	}
	public void changeWidth(double newW) {
		width = newW;
	}
}
