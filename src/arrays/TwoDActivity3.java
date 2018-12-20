package arrays;

import java.util.Scanner;
import objectOrientedProgramming.Greeter;
import java.util.Random;

public class TwoDActivity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 18;
		int columns = 5;
		int randomNum = 0;
		Greeter [][] friend = new Greeter [rows][columns];
		Random generator = new Random();
		for (rows = 0; rows < friend.length; rows++) {
			for (columns = 0; rows < friend[0].length; rows++) {
				friend[rows][columns] = new Greeter();
				friend[rows][columns].setAge(randomNum);
			}
			System.out.println("Ages of your buddies: ");
	}

}
}
