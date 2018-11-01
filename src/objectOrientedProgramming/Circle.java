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
		return radius;
	}

	public void setRadius(double newR) {
		radius = newR;
	}
	public double circumference() {
		if (radius > 0) {
		double circumference = 2 * radius * Math.PI;
		}
		else {
			System.out.println("Bad data");
		}
		return circumference;

	}
	
	public double area() {
		if (radius > 0) {
		double area = Math.PI * radius * radius;
	}
		else {
			System.out.println("bad data");
		}
		return area;
	}
	

}
