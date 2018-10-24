package objectOrientedProgramming;

import java.util.Scanner;

public class Room {
	public Room() {
	}

	public void area() {
		Scanner input = new Scanner(System.in);
		int height = 0;
		int length = 0;
		int area = 0;
		System.out.println("What is the height of the wall?");
		height = input.nextInt();
		System.out.println("What is the length of the wall?");
		length = input.nextInt();
		area = length * height;
		System.out.println("The area of the wall is " + area);
	}

	public void areaDoor() {
		Scanner input = new Scanner(System.in);
		int heightWall = 0;
		int lengthWall = 0;
		int heightDoor = 0;
		int lengthDoor = 0;
		int areaDoor = 0;
		int areaWall = 0;
		System.out.println("What is the height of the wall?");
		heightWall = input.nextInt();
		System.out.println("What is the length of the wall?");
		lengthWall = input.nextInt();
		System.out.println("What is the height of the door?");
		heightDoor = input.nextInt();
		System.out.println("What is the length of the door?");
		lengthDoor = input.nextInt();
		areaWall = (heightWall * lengthWall);
		areaDoor = (heightDoor * lengthDoor);
		areaWall = areaWall - areaDoor;
		System.out.println("The area of the wall without the door is " + areaWall);
	}
}
