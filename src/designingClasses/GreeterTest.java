package designingClasses;

import java.util.Scanner;

import objectOrientedProgramming.Friend;

import java.util.ArrayList;

public class GreeterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList<Greeter> people = new ArrayList<Greeter>();
		System.out.println("How many Greeter objects do you want to construct?");
		int num = input.nextInt();
		for (int i = 0; i < num; i++) {
			people.add(new Greeter());
		}
		for (Greeter temp : people) {
			System.out.println(temp.displayInfo());
		}
		input.close();
	}

}
