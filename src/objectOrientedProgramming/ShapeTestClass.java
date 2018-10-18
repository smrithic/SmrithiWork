package objectOrientedProgramming;

import java.util.Scanner;

public class ShapeTestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		Rectangle bob = new Rectangle();
		double length = 0.0;
		double width = 0.0;
		double area1 = 0.0;
		double perimeter1=0.0;
		System.out.println("What is the length of the rectangle?");
		length = input.nextDouble();
		System.out.println("What is the width of the rectangle?");
		width = input.nextDouble();
		perimeter1 = (length*2) + (width*2);
		area1 = length * width;
		System.out.println("The area of the rectangle is " +area1+ " and the perimeter is " +perimeter1);
		
		Circle jeff = new Circle ();
		double radius = 0.0;
		double perimeter2 = 0.0;
		double area2 = 0.0;
		System.out.println("What is the radius of the circle?");
		radius = input.nextDouble();
		area2 = Math.PI * radius * radius;
		perimeter2 = Math.PI * radius * 2;
		System.out.println("The circumference of the cirlce is " +perimeter2 + " and the area is " +area2);
		
		RightTriangle fred = new RightTriangle();
		double base = 0.0;
		double height = 0.0;
		double area3 = 0.0;
		double perimeter3 = 0.0;
		System.out.println("What is the base of the triangle?");
		base = input.nextDouble();
		System.out.println("what is the height of the triangle?");
		height = input.nextDouble();
		area3 = 0.5 * base * height;
		perimeter3 = base + height + fred.hypote();
		System.out.println("The area is " +area3+ " and the perimeter is " + perimeter3);
		
		Isosceles dave = new Isosceles();
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
		double area4 = 0.0;
		area4 = ((base1+base2) * height2)/2;
		double perimeter4 = 0.0;
		perimeter4 = base1 + base2 + leg + height2;
		System.out.println("The area is " + area4 + " and the perimeter is " + perimeter4);
		input.close();
		
		
		

	}

}
