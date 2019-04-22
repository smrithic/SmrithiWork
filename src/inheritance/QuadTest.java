package inheritance;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class QuadTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double largest = 0;
		Quadrilateral shape = new Quadrilateral(4, 3, 2, 5);
		Parallelogram thing = new Parallelogram();
		ArrayList<Geo> shapes = new ArrayList<Geo>();
		Rectangle box = new Rectangle(1, 2);
		// area 2
		Rectangle box2 = new Rectangle(2, 4);
		// area 8
		Trapezoid box3 = new Trapezoid(0, 2, 0, 5, 2);
		// area 10
		Trapezoid box4 = new Trapezoid(0, 100, 0, 50, 4);
		// area 16
		shapes.add(box);
		shapes.add(box2);
		shapes.add(box3);
		shapes.add(box4);

		boolean isRectangle = false;
		for (Geo g : shapes) {
			if (g.area() > largest) {
				largest = g.area();
				if (g instanceof Rectangle) {
					isRectangle = true;
				} else
					isRectangle = false;
			}
		}
		if (isRectangle == true) {
			System.out.println("the shape with the largest area is a rectangle with the area of: " + largest);
		}
		if (isRectangle == false) {
			System.out.println("the shape with the largest area is a trapezoid with the area of: " + largest);
		}
	}

}
