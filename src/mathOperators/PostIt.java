package mathOperators;

import java.util.Scanner;

public class PostIt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length = 0;
		int width = 0;
		int area = 0;
		final int POSTITAREA = 9;
		int numberOfPostits = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the length of the rectangular surface?");
		length = input.nextInt();
		System.out.println("What is the width of the rectangular surface?");
		width = input.nextInt();
		area = width * length;
		numberOfPostits = area / POSTITAREA;
		System.out.println("The number of postits needed to cover the rectangular surface is " + numberOfPostits);
		input.close();
	}

}
