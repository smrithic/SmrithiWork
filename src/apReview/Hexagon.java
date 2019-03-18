package apReview;

import java.util.ArrayList;

public class Hexagon {
	private ArrayList<CoordinatePoint> points;
	double distance;
	double area;
	double x;
	double y;
	
	CoordinatePoint point1 = new CoordinatePoint(x,y);
	CoordinatePoint point2 = new CoordinatePoint (x,y);
	
	public Hexagon(ArrayList<CoordinatePoint> pts) {
		points = pts;
	}
	
	public double getSideLength() {
	
		distance = Math.sqrt(Math.sqrt(point2.getx()-point1.getx() + Math.sqrt(point2.gety()-point1.gety())));
		return distance;
	}
	
	public double getArea() {
		area = ((Math.pow(distance, 2))* (3*Math.sqrt(3)))/2;
		return area;
	}
	
}
