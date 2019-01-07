package objectOrientedProgramming;

public class Circle {
	private double radius;

	public Circle() {
		radius = -99;
	}

	public Circle(double xRadius) {
		radius = xRadius;
	}

	public double getRadius() {
		return radius;
	}

	public double circumference() {
		if (radius > 0) {
			return 2 * radius * Math.PI;
		}
		return radius;
	}

	public double area() {
		if (radius > 0) {
			return Math.PI * radius * radius;
		}
		return radius;
	}

	public void setRadius(double xRadius) {
		radius = xRadius;
	}

}
