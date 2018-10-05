package mathOperators;

import java.util.Scanner;

public class Paint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double TALL = 8;
		double length = 0;
		double width = 0;
		double area1 = 0;
		double area2 = 0;
		double areaNeedPaint = 0;
		double gallonsOfPaint = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the room?");
		length = input.nextDouble();
		System.out.println("What is the width of the room?");
		width = input.nextDouble();
		System.out.println("The dimensions are " + TALL + " by " + length + " by " + width);
		area1 = length * TALL;
		area2 = width * TALL;
		areaNeedPaint = area1 * 2 + area2 * 2;
		System.out.println("The area of wall space to be painted is " + areaNeedPaint + " square feet");
		gallonsOfPaint = Math.round((areaNeedPaint / 150)+0.5);
		System.out.println("The number of gallons of paint needed to paint the room is " + gallonsOfPaint);
		input.close();

	}

}
