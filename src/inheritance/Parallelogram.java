package inheritance;

public class Parallelogram extends Quadrilateral {
	double height;

	public Parallelogram() {
		super();
	}

	public Parallelogram(double a, double base, double h) {
		super(a, base, a, base);
	}

	public void setHeight(double h) {
		height = h;
	}

	public double getHeight() {
		return height;
	}

	public double area() {
		return super.getside2() * height;
	}

	public String toString() {
		return "Type: Parallelogram, height: " + height + ", sides: " + super.toString();

	}
}
