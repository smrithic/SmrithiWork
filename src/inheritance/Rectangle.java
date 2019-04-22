package inheritance;

public class Rectangle extends Parallelogram implements Geo {

	// side1 and side3 are width
	// side2 and side4 are length

	public Rectangle() {
		super();
	}

	public Rectangle(double width, double length) {
		super(length, width, width);
	}

}
