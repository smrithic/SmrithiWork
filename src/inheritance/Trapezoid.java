package inheritance;

public class Trapezoid extends Quadrilateral implements Geo{
	double height;

	public Trapezoid() {
		super();
	}

	public Trapezoid(double a, double b, double c, double d, double h) {
		super(c, a, d, b);
		height = h;
	}
	
	public void setHeight(double h) {
		height = h;
	}
	public double getHeight() {
		return height;
	}

	public double area() {
		return ((super.getside2() + super.getside4()) / 2) * height;

	}

}
