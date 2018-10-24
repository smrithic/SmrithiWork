package objectOrientedProgramming;

public class Rectangle {
	private double length;
	private double width;
	private double perimeter;
	private double area;

	public Rectangle() {
		
	}
	public Rectangle (double newLe, double newWi) {
		length = newLe;
		width = newWi;	
	}

	public double getLength(){
		return length;
	}

	public double getWidth() {
		return width;
	}
	public double getPerimeter() {
		perimeter = (length * 2) + (width * 2);
		return perimeter;
	}
	public double getArea() {
		area = length * width;
		return area;
	}
	
}
