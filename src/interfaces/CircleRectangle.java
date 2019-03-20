package interfaces;

import java.util.ArrayList;

public class CircleRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		double smallest = 100;
		Circle round = new Circle(7);
		Circle round2 = new Circle(7);
		Rectangle square = new Rectangle(2, 6);
		Rectangle square2 = new Rectangle(2, 5);
		ArrayList<Shape>geo = new ArrayList<Shape>();
		geo.add(round);
		geo.add(round2);
		geo.add(square);
		geo.add(square2);
		
		System.out.println("The sum of all the objects:");
		for(Shape s: geo) {
			sum+=s.area();
		}
		System.out.println(sum);
		
		for(Shape s: geo) {
			if(s.perimeter()<100) {
				smallest = s.perimeter();
			}
		}
		System.out.println("Smallest perimeter is:");
		System.out.println(smallest);
	}

}
