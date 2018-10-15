package objectOrientedProgramming;

import java.util.Scanner;

public class House {

	public House() {

	}

	public void sayWall() {
		Scanner input = new Scanner(System.in);
		int height = 0;
		int length = 0;
		int area = 0;
		int time = 0;
		System.out.println("What is the height of the wall (feet)");
		height = input.nextInt();
		System.out.println("What is the length of the wall (feet)");
		length = input.nextInt();
		area = length * height;
		time = (area / 200) * 60;
		System.out.println("It will take " + time + " minutes to paint the wall");
	}

}
