package objectOrientedProgramming;

public class Circle {
	private double radius;
	private double circumference;
	private double area;
	

	public Circle() {
		

	}
	
	public Circle(double newR) {
		radius = newR;
		
	}

	public double getRadius() {
		return area;
	}

	public double getCircumference() {
		circumference = 2 * radius * Math.PI;
		return circumference;
	}
	public double getArea() {
		area = radius * radius * Math.PI;
		return area;
	}
	
	public void changeRadius(double newR) {
		radius = newR;
	}
	

}
