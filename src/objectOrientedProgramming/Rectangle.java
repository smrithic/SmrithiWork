package objectOrientedProgramming;

public class Rectangle {
	private double length;
	private double width;

	public Rectangle() {
		length = 10;
		width = 5;
	}

	public Rectangle(double xLength, double xWidth) {
		length = xLength;
		width = xWidth;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double perimeter() {
		return 2 * length * width;
	}

	public double area() {
		return length * width;
	}

	public void setLength(double xLength) {
		length = xLength;
	}

	public void setWidth(double xWidth) {
		width = xWidth;
	}

}
