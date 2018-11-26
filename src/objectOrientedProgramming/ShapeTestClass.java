package objectOrientedProgramming;

import java.util.Scanner;

public class ShapeTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		double length = 0.0;
		double width = 0.0;
		double area1 = 0.0;
		double perimeter1=0.0;
		System.out.println("What is the length of the rectangle?");
		length = input.nextDouble();
		System.out.println("What is the width of the rectangle?");
		width = input.nextDouble();
		Rectangle bob = new Rectangle(length, width);
		perimeter1 = bob.getPerimeter();
		area1 = bob.getArea();
		System.out.println("The area of the rectangle is " +area1+ " and the perimeter is " +perimeter1);
		
		
		double radius = 0.0;
		double perimeter2 = 0.0;
		double area2 = 0.0;
		System.out.println("What is the radius of the circle?");
		radius = input.nextDouble();	
		Circle jeff = new Circle(radius);
		
		
		double base = 0.0;
		double height = 0.0;
		double area3 = 0.0;
		double perimeter3 = 0.0;
		System.out.println("What is the base of the triangle?");
		base = input.nextDouble();
		System.out.println("what is the height of the triangle?");
		height = input.nextDouble();
		RightTriangle fred = new RightTriangle(base, height);
		area3 = fred.area();
		perimeter3 = fred.perimeter();
		System.out.println("The area is " +area3+ " and the perimeter is " + perimeter3);
		
		
		double base1 = 0.0;
		double base2 = 0.0;
		double leg = 0.0;
		double height2 = 0.0;
		System.out.println("What is the measure of one of the bases?");
		base1 = input.nextDouble();
		System.out.println("What is the measure of the other base?");
		base2 = input.nextDouble();
		System.out.println("What is the measure of the leg?");
		leg = input.nextDouble();
		System.out.println("What is the height of the trapezoid?");
		height2 = input.nextDouble();
		Isosceles dave = new Isosceles(base1,base2,leg,height2);
		double area4 = dave.area();
		double perimeter4 = dave.perimeter();
		System.out.println("The area is " + area4 + " and the perimeter is " + perimeter4);
		input.close();
		
		
		

	}

}
