package designingClasses;

import java.util.Random;

public class PileOJunk {
	private static int idNum = 1;
	private int myID;
	private String name;
	private int randomNum;

	public PileOJunk() {
		myID = idNum;
		idNum++;
		Random generator = new Random();
		randomNum = 10 + generator.nextInt(100 - 10 + 1);
		name = "Bob Smith";
	}

	public String displayInfo() {
		return "name:" + name + "  IDNum:" + myID;

	}

	public static int adding(int num1, int num2) {
		int sum = num1 + num2;
		return sum;
	}

	public void overWrite(int randomNum) {
		this.randomNum = randomNum;
	}
}
