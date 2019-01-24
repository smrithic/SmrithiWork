package designingClasses;

import java.util.Scanner;
import java.util.ArrayList;

public class JunkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<PIleOJunk> people = new ArrayList<PIleOJunk>();
		System.out.println("How many 'pile of junk' objects do you want to construct?");
		int num = input.nextInt();
		
		for (int i = 0; i < num; i++) {
			people.add(new PIleOJunk());
		}
	
		for (PIleOJunk temp : people) {
			System.out.println(temp.displayInfo());
		}
		
		System.out.println("Please enter two values to sum");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		PIleOJunk trash = new PIleOJunk();
		System.out.println("the sum of the two numbers is: " + trash.adding(num1, num2));
	}

}
