package objectOrientedProgramming;

public class Circle {
	private double radius = 0.0;
	private double circumference = 0.0;
	private double area = 0.0;
	

	public Circle() {
		radius = 5.5;
		circumference = 2.3;
		area = 19.8;

	}

	public double getRadius() {
		return radius;
	}

	public double getCircumference() {
		return circumference;
	}
	public double getArea() {
		return area;
	}
	
	public void changeRadius(double newR) {
		radius = newR;
	}

}
