package interfaces;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// prompt the user for the length and width of the rectangle
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the length and width of the rectangle");
		double length = input.nextDouble();
		double width = input.nextDouble();

		// construct a new Rectangle object and reference it by a Shape interface
		Rectangle bob = new Rectangle(length, width);
		Shape thing1 = bob;
		// displays the perimeter and area of the Rectangle object using the Shape
		// interface
		System.out.println("Rectangle Perimeter:" + bob.area());
		System.out.println("Rectangle Area: " + bob.perimeter());

		// prompt the user for the radius of a circle
		System.out.println("Please enter a radius of a circle");
		double radius = input.nextDouble();

		// construct a new Circle object and reference it by a Shape interface
		Circle joe = new Circle(radius);
		Shape thing2 = joe;

		// experimenting with different methods - you can only call the perimeter and
		// area
		// thing1 can only reference multiple objects, but can only call a few methods
		// bob can call all the methods, but can't reference multiple objects

		// display the perimeter and the area of the Circle object using the Shape
		// interface
		System.out.println("Circle perimeter: " + joe.area());
		System.out.println("Circle area: " + joe.perimeter());

	}

}
